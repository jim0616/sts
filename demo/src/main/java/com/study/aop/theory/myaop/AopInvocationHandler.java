package com.study.aop.theory.myaop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AopInvocationHandler implements InvocationHandler {

	private Object target;
	
	private Aspect aspect;
	
	
	
	public AopInvocationHandler(Object target, Aspect aspect) {
		super();
		this.target = target;
		this.aspect = aspect;
	}



	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 判斷當前方法是否需要增強
		if(method.getName().matches(this.aspect.getPointcut().getMethodPattern())) {
			return this.aspect.getAdvice().invoke(target, method, args);
		}
		
		//不需要增強
		return method.invoke(target, args);
	}



	public Object getTarget() {
		return target;
	}



	public void setTarget(Object target) {
		this.target = target;
	}



	public Aspect getAspect() {
		return aspect;
	}



	public void setAspect(Aspect aspect) {
		this.aspect = aspect;
	}

}
