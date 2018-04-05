package controller;

import entity.Class;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ClassService;

import java.util.List;

/**
 * 问题:
 *  1. 数据库使用小驼峰命名, 实体属性使用大驼峰命名, 导致查询能查询出List集合的大小却查询每个元素的值为NULL的问题;
 *      在mybatis中配置驼峰命名配置;
 *
 * @author YC
 * @create 2018/4/5 17:21.
 */
public class MainApp {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("config/applicationContext.xml");
        ClassService classService = (ClassService) ac.getBean("classService");
        List<Class> class_find = classService.findAll();
        for (Class classInfo : class_find) {
            System.out.println(classInfo.getClassId() + "\t" + classInfo.getClassName());
        }
    }
}
