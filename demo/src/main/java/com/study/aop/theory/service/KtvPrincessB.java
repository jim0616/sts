package com.study.aop.theory.service;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class KtvPrincessB implements KtvService {

	private Random ramdom = new Random();

	private int bound = 5;
	
	@Override
	public void momoSing(String customer) {

		//long start = System.currentTimeMillis();
		
		//開始時間
		try {
			TimeUnit.SECONDS.sleep(ramdom.nextInt(bound));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(customer + "享受完momoSing服務!");
		//結束時間
		
		
		
	}

}
