package demo.dao.jdbc.model.dao;

import demo.dao.jdbc.model.impl.SellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao( ) {
		return new SellerDaoJDBC();
	}
	
}
