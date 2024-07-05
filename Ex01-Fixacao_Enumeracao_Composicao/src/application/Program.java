package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data: ");
		System.out.print("Name: ");
		String nome = sc.next();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.next();
		Client c1 = new Client(nome, email, sdf.parse(birthDate));
		
		System.out.println("Enter order data: ");
		Date data = new Date();
		System.out.print("Status: ");
		String status = sc.next();
		Order o = new Order(data, OrderStatus.valueOf(status), c1);
		
		System.out.print("How many items to this order? ");
		int order = sc.nextInt();
		for(int i = 0; i < order; i++) {
			System.out.println("Enter #" + (i+1) +" item data: ");
			System.out.print("Product name: ");
			String productName = sc.next();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quant = sc.nextInt();
			Product product = new Product(productName, productPrice);
			OrderItem oI = new OrderItem(quant, product);
			
			o.addItem(oI);
		}
		
		System.out.println(o.toString1());
		sc.close();
		
	}

}
