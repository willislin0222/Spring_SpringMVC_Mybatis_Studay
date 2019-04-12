package com.cheese.service.impl;
 
import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import com.cheese.dao.UserMapper;
import com.cheese.pojo.User;
import com.cheese.service.UserService;
 
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;//UserMapper 是接口
	
	public void addUser(Map<String,Object> map) {		
		userMapper.insert(map);//调用接口的方法
	}	
	
	public int updateUser(Map<String, Object> map) {
		return userMapper.update(map);
	}	
	
	public User getUser(User user) {
		return this.userMapper.getUser(user);
	}
	
	public User getUserInfo(User user) {
		return this.userMapper.getUserInfo(user);
	}
	
	public List<User> getUserList(){
		return this.userMapper.getUserList();
	}
}