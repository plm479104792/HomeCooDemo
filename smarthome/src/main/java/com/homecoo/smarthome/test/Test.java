package com.homecoo.smarthome.test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONArray;
import com.homecoo.smarthome.domain.APPThemeMusic;
import com.homecoo.smarthome.domain.UserTest;

public class Test {
	
	public static void main(String[] args) {
		UserTest test=new UserTest();
		test.setDescription("q2313131");
		test.setEmail("dasda@wqewq");
		test.setName("老师");
		test.setPwd("1234456");
		
		System.out.println(JSONArray.toJSONString(test));
	}

}



