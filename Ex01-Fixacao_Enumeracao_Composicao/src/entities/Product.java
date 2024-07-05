package entities;

public class Product {

	// Atributos
	private String nome;
	private Double price;

	// Metodos Especificos

	// Metodos Especiais
	public Product() {
		super();
	}

	public Product(String nome, Double price) {
		super();
		this.nome = nome;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [nome=" + nome + ", price=" + price + "]";
	}

	public String getNome() {
		return nome;
	}

	public Double getPrice() {
		return price;
	}

}
