package com.study.aop.theory.service;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

@Service
public class SpaPrincessA implements SPAService {

	private Random ramdom = new Random();

	private int bound = 5;

	@Override
	public void fullBodyMassage(String customer) {
		try {
			TimeUnit.SECONDS.sleep(ramdom.nextInt(bound));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(customer + "享受完fullBodyMassage服務!");
	}

	@Override
	public void aromaOilMassage(String customer) {
		try {
			TimeUnit.SECONDS.sleep(ramdom.nextInt(bound));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(customer + "享受完aromaOilMassage服務!");

	}

	@Override
	public void rest() {
		// TODO Auto-generated method stub

	}

}
