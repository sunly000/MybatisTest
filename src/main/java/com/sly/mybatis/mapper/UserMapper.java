package com.sly.mybatis.mapper;

import java.util.List;

//import com.sly.mybatis.pojo.QueryVo;
import com.sly.mybatis.pojo.User;

public interface UserMapper {
	User getUserById(Integer id);

	List<User> getUserByUserName(String userName);

	void insertUser(User user);

	void updateUser(User user);

	void deleteUser(int id);

	Integer getUserCount();

	List<User> getUserByPojo(User user);

	//List<User> getUserByIds(QueryVo queryVo);

}
