package demo.dao.jdbc.application;

import java.util.List;

import demo.dao.jdbc.model.dao.DaoFactory;
import demo.dao.jdbc.model.dao.SellerDao;
import demo.dao.jdbc.model.entities.Department;
import demo.dao.jdbc.model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		Department department = new Department(2, null);
		
		System.out.println("\n=== TEST 2: seller findByDepartment ===");
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj: list) {
			System.out.println(obj);
		}
		
	}

}
