package com.example.demo.mq.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.mq.Model.MemberAccount;

@RestController
public class MemberApiController {
	@Autowired
	MemberAccount memberAccount;
	
	 @RequestMapping("/memberApi/memberTest")
	 public MemberAccount memberTest() {
		 MemberAccount memberAccount = new MemberAccount();
		 memberAccount.setAddress("台北市");
		 memberAccount.setCellphone("09123456789");
		 memberAccount.setEmail("test@gmail.com");
		 memberAccount.setId(1);
		 memberAccount.setPassword("123456789");
		 return memberAccount;
	 }
	 
	 @Autowired LineNotify line;
	 
	 @RequestMapping("/line")
	 public String memberTest1() {
		 line.sendMessage("daWUwjrk0ykh0rr2lPYXvNyLZB3rfQsHZw2iNBHibBM","123", false);
		 //line.sendNotification("HELLO", "XMXUeRWmOmKzNG7sKNfCBordHmJwN8FJCw6CvA8G7Ir");
		 return "13";
	 }
}