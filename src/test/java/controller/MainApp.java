package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.LoginService;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        LoginService loginService = (LoginService) ac.getBean("userTest");
        System.out.println(loginService.findAll().size());
    }
}
