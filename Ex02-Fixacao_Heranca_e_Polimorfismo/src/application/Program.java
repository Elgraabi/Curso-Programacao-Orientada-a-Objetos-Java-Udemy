package application;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number = 0, numberEmp = 0;
		char ic = 'i';
		String name = "";
		double anualIncome = 0.0, healthExp = 0.0, total = 0.0;
		LinkedList<Contribuinte> list = new LinkedList<Contribuinte>();
		
		System.out.println("--------------------------------");
		System.out.print("Enter the number of tax payers: ");
		number = sc.nextInt();
		System.out.println("--------------------------------");
		
		for (int i = 1; i <= number; i++) {
			System.out.println("--------------------------------");
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			ic = sc.next().charAt(0);
			
			System.out.print("Name: ");
			name = sc.next();
			System.out.print("Anual income: ");
			anualIncome = sc.nextDouble();
			if (ic == 'i' || ic == 'I') {
				System.out.print("Health expenditures: ");
				healthExp = sc.nextDouble();
				list.add(new PessoaFisica(name, anualIncome, healthExp));
			} else {
				System.out.print("Number of employees: ");
				numberEmp = sc.nextInt();
				list.add(new PessoaJuridica(name, anualIncome, numberEmp));
			}
			
		}
		
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("TAXES PAID: ");
		for (Contribuinte ctb : list) {
			System.out.println(ctb);
		}
		
		System.out.println();
		
		for (Contribuinte cbt : list) {
			total += cbt.calculoImposto();
		}
		System.out.print("TOTAL TAXES: $" + String.format("%.2f", total));
		
		sc.close();
		
	}

}
