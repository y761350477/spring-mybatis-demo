package service;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import dao.UserDAO;

import javax.annotation.Resource;
import java.util.List;

@Component("userTest")
public class LoginService {
	
	@Resource
	private UserDAO userdao;

	public List<User> findAll() {
		return userdao.findAll();
	}

}
