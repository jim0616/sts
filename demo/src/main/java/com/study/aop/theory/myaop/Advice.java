package com.study.aop.theory.myaop;

import java.lang.reflect.Method;

public interface Advice {
  
	//定義一個方法
	//用戶在此提供增強邏輯
	//方法執行前獲得時間
	//執行被增強的方法
	//獲取結束時間
	Object invoke(Object target, Method method, Object[] args)throws Exception;
}
