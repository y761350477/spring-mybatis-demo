package dao;

import entity.Student;

import java.util.List;

public interface StudentDao {
	public List<Student> findManyToOne();
}
