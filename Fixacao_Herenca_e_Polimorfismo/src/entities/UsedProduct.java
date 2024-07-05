package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product{
	
	// Atributos
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date manufactureDate;
	
	// Metodos Especificos
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + " (used) $" + String.format("%.2f", price) + " (Manufacture date: " + sdf.format(this.manufactureDate) + ")");
		return sb.toString();
	}
	
	// Metodos Especiais
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
}
