package com.example.demo.service;

import com.example.demo.vo.member;

public interface memberDao {
	member Login(String username,String password);
	boolean userNamerRepeat(String username);
	void addMember(member m);
}
