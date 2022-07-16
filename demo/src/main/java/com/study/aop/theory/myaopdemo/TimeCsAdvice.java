package com.study.aop.theory.myaopdemo;

import java.lang.reflect.Method;

import com.study.aop.theory.myaop.Advice;

public class TimeCsAdvice implements Advice {

	@Override
	public Object invoke(Object target, Method method, Object[] args) throws Exception {
		
//		System.out.println(
//				"記錄：" + target.getClass().getName() + "." + method.getName() );
		
		
		long stime = System.currentTimeMillis();
		
		Object ret = method.invoke(target, args);
		
		long useTime = System.currentTimeMillis() - stime;
		System.out.println(
				"記錄：" + target.getClass().getName() + "." + method.getName() + "耗時：" + useTime);
		
		return ret;
	}

}
