package entities;

public class OrderItem {

	// Atributos
	private Integer quantity;
	private Double price;
	private Product product = new Product();
	
	// Metodos Especificos
	public Double subTotal() {	
		return this.product.getPrice() * this.quantity;
	}
	
	// Metodos Especiais
	public OrderItem() {
		super();
	}

	public OrderItem(Integer quantity, Product product) {
		super();
		this.quantity = quantity;
		this.product = product;
	}

	@Override
	public String toString() {
		return "OrderItem [quantity=" + quantity + ", price=" + price + ", product=" + product + "]";
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Double getPrice() {
		return price;
	}

	public Product getProduct() {
		return product;
	}
	
}
