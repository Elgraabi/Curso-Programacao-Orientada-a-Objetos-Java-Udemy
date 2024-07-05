package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		LinkedList<Product> lista = new LinkedList<Product>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String name, data;
		char cha;
		int num;
		double price, customsFee;

		System.out.print("Enter the number of products: ");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			cha = sc.next().charAt(0);

			System.out.print("Name: ");
			name = sc.next();
			System.out.print("Price: ");
			price = sc.nextDouble();

			if (cha == 'i' || cha == 'I') {
				System.out.print("Customs fee: ");
				customsFee = sc.nextDouble();
				lista.add(new ImportedProduct(name, price, customsFee));
				
			} else if (cha == 'u' || cha == 'u') { 
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				data = sc.next(); 
				lista.add(new UsedProduct(name, price, sdf.parse(data)));
			} else {
				lista.add(new Product(name, price));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product p: lista) {
			System.out.println(p.priceTag());
		}

		sc.close();

	}

}
