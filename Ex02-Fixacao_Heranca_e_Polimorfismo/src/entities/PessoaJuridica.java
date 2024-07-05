package entities;

public class PessoaJuridica extends Contribuinte {
	
	// Atributos
	private Integer numFundionario;
	
	// Metodos Especificos
	@Override
	public double calculoImposto() {
		double imposto = 0;
		if (this.numFundionario > 10) {
			imposto = getRendaAnual() * 0.14;
		} else {
			imposto = getRendaAnual() * 0.16;
		}
		return imposto;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getNome() + ": $" + String.format("%.2f", this.calculoImposto()));
		return sb.toString();
	}
	
	// Metodos Especiais
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String nome, Double rendaAnual, Integer numFundionario) {
		super(nome, rendaAnual);
		this.numFundionario = numFundionario;
	}

	public Integer getNumFundionario() {
		return numFundionario;
	}

	public void setNumFundionario(Integer numFundionario) {
		this.numFundionario = numFundionario;
	}
	
}
