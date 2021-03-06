package com.ssm.web;


import com.ssm.entity.UserEntity;
import com.ssm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
	
	@Autowired
	private UserMapper userMapper;

	//http://127.0.0.1:8080/getUsers
	@RequestMapping("/getUsers")
	public List<UserEntity> getUsers() {
        System.out.println("=====================================");
        List<UserEntity> users = userMapper.getAll();
		return users;
	}
}