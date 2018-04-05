package service;

import dao.ClassDao;

import javax.annotation.Resource;
import entity.Class;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("classService")
public class ClassService {

    @Resource
    private ClassDao classDao;

    public List<Class> findAll() {
        return classDao.findAll();
    }
}
