package entities;

public abstract class Contribuinte {

	// Atributos
	private String nome;
	private Double rendaAnual;
	
	// Metodos Especificos
	public abstract double calculoImposto();

	// Metodos Especiais
	public Contribuinte() {
		super();
	}

	public Contribuinte(String nome, Double rendaAnual) {
		super();
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}
	
}
