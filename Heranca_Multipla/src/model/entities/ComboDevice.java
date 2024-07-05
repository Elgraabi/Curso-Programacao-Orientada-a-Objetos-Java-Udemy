package model.entities;

public class ComboDevice extends Device implements Scanner, Printer {

	// Atributos
	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}
	
	// Metodos Especificos
	@Override
	public void print(String doc) {
		System.out.println("Combo printing: " + doc);
	}
	
	@Override
	public String scan() {
		return "Combo scan result";
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Combo processing: " + doc);
	}
	
	// Metodos Especiais

}
