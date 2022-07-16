package com.study.aop.theory.myaop;

public class Pointcut {

	//類名匹配模式(正規表示法)
	private String classPattern;
	
	//方法名匹配模式(正規表示法)
	private String methodPattern;



	public Pointcut(String classPattern2, String methodPattern2) {
		super();
		this.classPattern = classPattern2;
		this.methodPattern = methodPattern2;
	}

	public String getClassPattern() {
		return classPattern;
	}

	public void setClassPattern(String classPattern) {
		this.classPattern = classPattern;
	}

	public String getMethodPattern() {
		return methodPattern;
	}

	public void setMethodPattern(String methodPattern) {
		this.methodPattern = methodPattern;
	}
	
}
