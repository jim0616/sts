package com.study.aop.theory.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeConsumingStatisticsAspect {

	@Around("execution(* com.study.aop.theory.service.*.*(..))")
	public Object TimeConsumingStatisticsAspect(ProceedingJoinPoint pjp) throws Throwable{
		
		long stime = System.currentTimeMillis();
		Object ret = pjp.proceed();
		long useTime = System.currentTimeMillis() - stime;
		System.out.println("記錄：" + pjp.getTarget() + "." + pjp.getSignature() + "耗時：" + useTime);
		
		return ret;
	}
}
