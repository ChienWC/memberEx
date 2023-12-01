package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.demo.vo.member;

@Mapper
public interface memberMapper {
	@Insert("insert into member(username,password,name,address,phone,mobile) "
			+ "values(#{username},#{password},#{name},#{address},#{phone},#{mobile})")
	void add(member m);
	
	@Select("select * from member")
	List<member> queryAll();
	
	@Select("select * from member where id=#{id}")
	member queryUser(int id);
	
	@Select("select * from member where username=#{username} and password=#{password}")
	member queryMember(String username,String password);
	
	@Select("select * from member where username=#{username}")
	member queryUsername(String username);

}
