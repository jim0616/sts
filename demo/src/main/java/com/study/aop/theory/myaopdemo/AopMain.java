package com.study.aop.theory.myaopdemo;

import com.study.aop.theory.myaop.Advice;
import com.study.aop.theory.myaop.Aspect;
import com.study.aop.theory.myaop.IocContainer;
import com.study.aop.theory.myaop.Pointcut;
import com.study.aop.theory.service.KtvPrincessB;
import com.study.aop.theory.service.KtvService;
import com.study.aop.theory.service.SPAService;
import com.study.aop.theory.service.SpaPrincessA;

public class AopMain {

	public static void main(String[] args) throws Exception {
		//使用者提供增強模式，切入點都有了
		Advice advice = new TimeCsAdvice();
		Pointcut pointcut = new Pointcut(
				"com\\.study\\.aop\\.theory\\.service\\..*",
				".*Massage");		
		
		Aspect aspect = new Aspect(advice, pointcut);
		
		//到此，用戶要幹的事情就幹完了，該我們完成框架的功能
		//SPAService spa = new SpaPrincessA();
		//spa.aromaOilMassage("mike");
		
		IocContainer ioc = new IocContainer();
		ioc.AddBeanDefinition("spa", SpaPrincessA.class);
		ioc.AddBeanDefinition("ktv", KtvPrincessB.class);
		
		ioc.setAspect(aspect);
		
		SPAService spa = (SPAService)ioc.getBean("spa");
		spa.aromaOilMassage("mike");
		KtvService ktv = (KtvService)ioc.getBean("ktv");
		ktv.momoSing("mike");
	}

}
