package com.homecoo.smarthome.service;

import com.homecoo.smarthome.domain.User;

public interface IUser {

	int addUser(User user);

	User SelectUser(User user);

	User loadUserByPhonenum(String phonenum);

	int updateUser(User record);

	int CancelUser(String phonenum);
}
