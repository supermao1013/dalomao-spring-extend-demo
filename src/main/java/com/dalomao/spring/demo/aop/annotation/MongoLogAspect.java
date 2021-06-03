package com.dalomao.spring.demo.aop.annotation;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;

/**
 * MongoLog切面类
 */
@Aspect
@Configuration
@Slf4j
public class MongoLogAspect {
    /**
     * 定义切入点，切入点为被注解 @MongoLog 标注的所有方法
     */
    @Pointcut("@annotation(com.dalomao.spring.demo.aop.annotation.MongoLog)")
    public void pointCut() {}

    /**
     * 前置通知
     */
    @Before("pointCut()")
    public void doBefore(JoinPoint joinPoint) {
        log.info("前置通知");
    }

    /**
     * 环绕通知
     */
    @Around("pointCut()")
    public Object doAroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
        log.info("环绕通知");
        MongoLogVO logVO = new MongoLogVO();
        Object obj = null;
        // 签名方法
        MethodSignature signature = (MethodSignature) proceedingJoinPoint.getSignature();
        // 功能描述
        Method method = signature.getMethod();
        MongoLog mongoLog = method.getAnnotation(MongoLog.class);
        logVO.setDesc(mongoLog.desc());

        // 成功状态
        logVO.setStatus("S");
        // 被调用的类的全限定名
        logVO.setClazz(signature.getDeclaringTypeName());
        // 被调用的类的方法名
        logVO.setMethod(signature.getName());
        // 入参
        Object[] args = proceedingJoinPoint.getArgs();
        if (args != null && args.length > 0) {
            logVO.setRequest(JSON.toJSONString(args));
        }

        long beginTime = System.currentTimeMillis();
        try {
            obj = proceedingJoinPoint.proceed();
        } catch (Throwable ex) {
            log.error("报错", ex);
            // 失败状态
            logVO.setStatus("E");
            // 异常信息
            logVO.setExceptionInfo(ex.getMessage());
        }

        // 耗时
        logVO.setTakeTime(System.currentTimeMillis() - beginTime);
        // 返回参数
        if (obj != null) {
            logVO.setResponse(JSON.toJSONString(obj));
        }

        // TODO：调用Mongo组件上传日志 MongoLogVO

        return obj;
    }

    /**
     * 后置通知
     */
    @AfterReturning(value = "pointCut() && args(queryVO, pageVO)", argNames = "queryVO, pageVO")
    public void doAfterReturning(Object queryVO, Object pageVO) {
        log.info("后置通知");
        log.info("入参1为：{}", JSON.toJSONString(queryVO));
        log.info("入参2为：{}", JSON.toJSONString(pageVO));
    }
}
