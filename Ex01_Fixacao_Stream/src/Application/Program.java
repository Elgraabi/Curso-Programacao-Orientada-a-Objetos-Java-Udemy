package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.next();
		
		System.out.print("Enter salary: ");
		Double salary = sc.nextDouble();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Funcionario> list = new ArrayList<>();
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Funcionario(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.println(String.format("Email of people whose salary is more than %.2f:", salary));
			list.stream()
				.filter(f -> f.getSalario() > salary)
				.map(f -> f.getEmail())
				.sorted()
				.collect(Collectors.toList()).forEach(System.out::println);
			
			System.out.format("Sum of salary from people whose name starts with 'M': %.2f", list.stream()
					  																		.filter(f -> f.getNome().charAt(0) == 'M')
					  																		.map(f -> f.getSalario())
					  																		.reduce(0.0, (x, y) -> x +y));
			
				
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		sc.close();

	}

}
