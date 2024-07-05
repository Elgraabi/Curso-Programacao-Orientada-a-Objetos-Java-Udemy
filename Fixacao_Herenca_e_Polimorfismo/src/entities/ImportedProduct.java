package entities;

public final class ImportedProduct extends Product{
	
	// Atributos
	private Double customsFee;
	
	// Metodos Especificos
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(name + " $" + String.format("%.2f", this.totalPrice()) + " (Customs fee: $" + String.format("%.2f)", this.customsFee));
		return sb.toString();
	}
	
	public double totalPrice() {
		return price + this.customsFee;
	}
	
	// Metodos Especiais
	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
}
