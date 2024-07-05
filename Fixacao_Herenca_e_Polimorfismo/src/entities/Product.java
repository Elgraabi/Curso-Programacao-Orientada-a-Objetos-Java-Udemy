package entities;

public class Product {
	
	// Atributos
	protected String name;
	protected Double price;
	
	// Metodos Especificos
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name + " $" + String.format("%.2f", this.price));
		return sb.toString();
	}

	// Metodos Especiais
	public Product() {
		super();
	}

	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}
	
}
