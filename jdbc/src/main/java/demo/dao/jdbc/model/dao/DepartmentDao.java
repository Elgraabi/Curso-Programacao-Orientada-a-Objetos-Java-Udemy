package demo.dao.jdbc.model.dao;

import java.util.List;

import demo.dao.jdbc.model.entities.Department;

public interface DepartmentDao {
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
}
