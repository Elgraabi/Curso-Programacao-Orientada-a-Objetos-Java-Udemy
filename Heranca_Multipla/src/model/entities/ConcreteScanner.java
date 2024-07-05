package model.entities;

public class ConcreteScanner extends Device implements Scanner {

	// Atributos
	// Metodos Especificos
	@Override
	public void processDoc(String doc) {
		System.out.println("Scanner processing: " + doc);
	}

	@Override
	public String scan() {
		return "Scanned content";
	}
	
	// Metodos Especiais
	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
	}
	
}
