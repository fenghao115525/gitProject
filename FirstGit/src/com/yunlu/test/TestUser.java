package com.yunlu.test;

import com.yunlu.bean.User;

public class TestUser {

	public static void main(String[] args) {
		User user = new User();
		user.setUserNo(001);
		user.setUserName("小明");
		
		System.out.println("编号："+user.getUserNo());
		System.out.println("姓名："+user.getUserName());
	}
}
