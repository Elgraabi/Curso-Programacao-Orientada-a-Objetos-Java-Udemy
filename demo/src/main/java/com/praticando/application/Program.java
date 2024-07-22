package com.praticando.application;

import java.util.List;
import java.util.Scanner;

import com.praticando.model.dao.DaoFactory;
import com.praticando.model.dao.SellerDao;
import com.praticando.model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== Teste 1: seller insert ===");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		//Seller seller = new Seller(null, "Gabriel3", "Gabriel3@gmail.com", new Date(), 6000.0, new Department(2, null) );
		//sellerDao.insert(seller);
		//System.out.println("Seller inserido com sucesso! id do seller: " + seller.getId());
		
		System.out.println("=== Teste 2: seller update ===");
		Seller sellerUpdate = sellerDao.findById(18);
		sellerUpdate.setEmail("Gabriel2@gmail.com");
		sellerDao.update(sellerUpdate);
		System.out.println("Update completed");
		
		System.out.println("=== Teste 3: seller delete ===");
		System.out.print("Enter id for delete test: ");
		sellerDao.deleteById(sc.nextInt());
		System.out.println("Delete completed");
		
		System.out.println("=== Teste 4: seller findAll ===");
		List<Seller> list = sellerDao.findAll();
		
		for (Seller seller : list) {
			System.out.println(seller);
		}

		sc.close();
	}

}
