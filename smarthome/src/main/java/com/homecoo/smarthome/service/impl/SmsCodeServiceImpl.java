package com.homecoo.smarthome.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homecoo.smarthome.domain.SmsCode;
import com.homecoo.smarthome.persistence.SmsCodeMapper;
import com.homecoo.smarthome.service.ISmsCode;

@Service
public class SmsCodeServiceImpl implements ISmsCode {
	
		@Autowired
		SmsCodeMapper smsCodeMapper;
			
		@Override
		public int addSmsCode(SmsCode smsCode) {
			// TODO Auto-generated method stub
			int smsCodeId = -1;
			smsCodeMapper.insertSmsCode(smsCode);
			if (smsCode.getSmscodeId()!=null) {
				smsCodeId = smsCode.getSmscodeId();
				return  smsCodeId;
			}else{
				return smsCodeId;
			}
		}
		@Override
		public String findIdentifyCodeByPhone(SmsCode sms) {
			// TODO Auto-generated method stub
			List<SmsCode> list= smsCodeMapper.findIdentifyCodeByPhone(sms);
			String identifyCode = list.get(0).getSmscode();
			return identifyCode;
		}
		@Override
		public int updateSmsCode(SmsCode smsCode) {
			int row=smsCodeMapper.updateByPhoneNum(smsCode);
			return row;
		}
		@Override
		public int getPhoneNum(String phoneNum) {
			List<SmsCode> list=smsCodeMapper.getPhoneNum(phoneNum);
			int row=0;
			if (list.size()==0) {
				return row;
			}else{
				row=list.size();
				return row;
			}
		}
		
		@Override
		public int deleteByPhonenum(String phonenum) {
			int row=smsCodeMapper.deleteByphoneNum(phonenum);
			return row;
		}
		
		
	}


