package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_e_BufferedWriter {

	public static void main(String[] args) {
		
		String lines[] = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "c:\\Windows\\Temp\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { // Adicionar "true" no parametro para escrever no final no arquivo sem apagalo, para recriar só remover o "true" passado no parametro.
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
