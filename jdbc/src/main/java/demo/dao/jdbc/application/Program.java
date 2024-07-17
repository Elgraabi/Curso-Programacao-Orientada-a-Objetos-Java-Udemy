package demo.dao.jdbc.application;

import java.util.Date;

import demo.dao.jdbc.model.dao.DaoFactory;
import demo.dao.jdbc.model.dao.SellerDao;
import demo.dao.jdbc.model.entities.Department;
import demo.dao.jdbc.model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department dp = new Department(1, "Nooks");
		Seller seller = new Seller(21,"Bob", "bob@gmail.com", new Date(), 3000.0, dp);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(dp);
		System.out.println(seller);
	}

}
