package com.lls.pushlog.service;

import com.lls.pushlog.common.PageModel;
import com.lls.pushlog.entity.User;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface UserService {
	public List<User> findAll();
}
