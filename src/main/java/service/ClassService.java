package service;

import dao.ClassDao;
import entity.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("classService")
public class ClassService {

    @Autowired
    private ClassDao classDao;

    public List<Class> findAll() {
        return classDao.findAll();
    }
}
