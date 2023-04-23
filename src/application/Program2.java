package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entites.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departments = DaoFactory.createDepartmentDao();
		
		Department department = new Department(5, "Food");
		
		//departments.insert(department);
		//departments.update(department);
		//departments.deleteById(5);
		//List<Department> dep = departments.findAll();
		Department dep = departments.findById(4);
		//dep.forEach(System.out::println);
		System.out.println(dep.toString());
		System.out.println("Done!");
		
		
	}

}
