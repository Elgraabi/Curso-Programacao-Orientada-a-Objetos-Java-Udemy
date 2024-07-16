package demo.dao.jdbc.application;

import demo.dao.jdbc.model.entities.Department;

public class Program {

	public static void main(String[] args) {
		
		Department dp = new Department(1, "Nooks");

		System.out.println(dp);
	}

}
