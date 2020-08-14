package com.lls.pushlog.service.impl;

import com.lls.pushlog.entity.User;
import com.lls.pushlog.mapper.UserDao;
import com.lls.pushlog.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;


	public List<User> findAll() {
		return this.userDao.findAllUsers();
	}

}
