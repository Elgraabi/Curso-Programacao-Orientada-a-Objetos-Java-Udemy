package application;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		LinkedList<Employee> lista = new LinkedList<Employee>();
		String name;
		int hours;
		double perHour, additionalCharge;

		System.out.print("Enter the number of employees: ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println("-------------------------------");
			System.out.println("Employee #" + (i + 1) + " data:");
			System.out.print("Outsourced (y/n)? ");
			char outsourced = sc.next().charAt(0);

			System.out.print("Name: ");
			name = sc.next();
			System.out.print("Hours: ");
			hours = sc.nextInt();
			System.out.print("Value per hour: ");
			perHour = sc.nextDouble();

			if (outsourced == 'y' || outsourced == 'Y') {
				System.out.print("Additional charge: ");
				additionalCharge = sc.nextDouble();
				System.out.println("-------------------------------");
				Employee emp = new OutsourcedEmployee(name, hours, perHour, additionalCharge);

				lista.add(emp);
			} else {
				System.out.println("-------------------------------");
				Employee emp = new Employee(name, hours, perHour);

				lista.add(emp);
			}
		}
		System.out.println("-------------------------------");
		System.out.println();
		System.out.println("PAYMENTS: ");
		for (Employee emp : lista) {
			System.out.println(emp);
		}
		sc.close();

	}

}
