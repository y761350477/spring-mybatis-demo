package dao;

import entity.User;

import java.util.List;

public interface UserDAO {

    int finduser(String user, String pwd);

    int findbyname(String username);

    List<User> findAll();
}
