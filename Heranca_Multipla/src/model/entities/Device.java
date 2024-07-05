package model.entities;

public abstract class Device {
	
	// Atributos 
	public String serialNumber;
	
	// Metodos Especificos
	public abstract void processDoc(String doc);
	
	// Metodos Especiais
	public Device(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
}
