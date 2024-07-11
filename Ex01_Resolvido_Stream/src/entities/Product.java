package entities;

import java.util.Objects;

public class Product {
	
	private String nome;
	private Double price;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [nome=" + nome + ", price=" + price + "]";
	}

	public Product(String nome, Double price) {
		super();
		this.nome = nome;
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(price, other.price);
	}

}
