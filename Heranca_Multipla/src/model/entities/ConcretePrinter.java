package model.entities;

public class ConcretePrinter extends Device implements Printer {

	// Atributos
	// Metodos Especificos
	@Override
	public void processDoc(String doc) {
		System.out.println("Printer processing: " + doc);
	}

	@Override
	public void print(String doc) {
		System.out.println("Printing: " + doc);
	}
	
	// Metodos Especiais
	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
	}
}
