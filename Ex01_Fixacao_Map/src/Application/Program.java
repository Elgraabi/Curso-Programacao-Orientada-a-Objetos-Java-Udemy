package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = sc.next();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			Map<String, Integer> votos = new HashMap<>();

			String line = br.readLine();
			while (line != null) {
				String[] filds = line.split(",");
				String nome = filds[0];
				Integer voto = Integer.parseInt(filds[1]);

				if (votos.containsKey(nome)) {
					voto += votos.get(nome);
					votos.put(nome, voto);
				} else {
					votos.put(nome, voto);
				}

				line = br.readLine();
			}

			for (String key : votos.keySet()) {
				System.out.println(key + ": " + votos.get(key));
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
