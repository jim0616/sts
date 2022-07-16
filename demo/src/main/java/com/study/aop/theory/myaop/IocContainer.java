package com.study.aop.theory.myaop;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

public class IocContainer {

	
	private Map<String, Class<?>> beanDefinitionMap = new HashMap<>();
	
	//用戶的切面可能會有多個，簡化給一個作為代表
	private Aspect aspect;
	
	public void AddBeanDefinition(String beanName,Class<?> beanClass) {
		this.beanDefinitionMap.put(beanName, beanClass);
	}
	
	public Object getBean(String beanName) throws Exception{
		Object bean = createInstance(beanName);
		bean = proxyEnhance(bean);
		return bean;
	}

	private Object proxyEnhance(Object bean) {
		// 怎麼進行代理增強
		if(bean.getClass().getName().matches(this.aspect.getPointcut().getClassPattern()))
		{

			return Proxy.newProxyInstance(
					bean.getClass().getClassLoader(), 
					bean.getClass().getInterfaces(), 
					new AopInvocationHandler(bean,aspect));
		}
		return bean;
	}

	private Object createInstance(String beanName) throws Exception  {
		// TODO Auto-generated method stub
		return this.beanDefinitionMap.get(beanName).newInstance();
	}

	public Aspect getAspect() {
		return aspect;
	}

	public void setAspect(Aspect aspect) {
		this.aspect = aspect;
	}
	
	
}
