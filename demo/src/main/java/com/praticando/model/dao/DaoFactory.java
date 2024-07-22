package com.praticando.model.dao;

import com.praticando.db.DB;
import com.praticando.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
	
}
