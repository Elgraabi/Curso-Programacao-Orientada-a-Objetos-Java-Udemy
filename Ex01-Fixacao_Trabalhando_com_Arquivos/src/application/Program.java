package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Program {

	public static void main(String[] args) {

		LinkedList<String[]> list = new LinkedList<String[]>();

		try (BufferedReader br = new BufferedReader(new FileReader("c:\\Windows\\Temp\\itens_Vendidos\\in.txt"))) {
			String line = br.readLine();

			while (line != null) {
				list.add(line.split(","));
				line = br.readLine();
			}

			boolean out = new File("c:\\Windows\\Temp\\itens_Vendidos" + "\\out").mkdir();

			if (out) {
				try (BufferedWriter bw = new BufferedWriter(
						new FileWriter("c:\\Windows\\Temp\\itens_Vendidos\\out\\summary.csv"))) {
					for (String lines[] : list) {
						Double valor1 = Double.parseDouble(lines[1]);
						Double valor2 = Double.parseDouble(lines[2]);
						bw.write(lines[0] + "," + valor1 * valor2);
						bw.newLine();
					}

				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
