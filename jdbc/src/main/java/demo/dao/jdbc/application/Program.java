package demo.dao.jdbc.application;

import demo.dao.jdbc.model.dao.DaoFactory;
import demo.dao.jdbc.model.dao.SellerDao;
import demo.dao.jdbc.model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);

		System.out.println(seller);
	}

}
