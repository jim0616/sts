package com.study.aop.theory.myaop;


import org.springframework.stereotype.Component;


public class Aspect {

	private Advice advice;
	private Pointcut pointcut;
	
	
	
	public Aspect(Advice advice, Pointcut pointcut) {
		super();
		this.advice = advice;
		this.pointcut = pointcut;
	}
	
	public Advice getAdvice() {
		return advice;
	}
	public void setAdvice(Advice advice) {
		this.advice = advice;
	}
	public Pointcut getPointcut() {
		return pointcut;
	}
	public void setPointcut(Pointcut pointcut) {
		this.pointcut = pointcut;
	}
	
}
