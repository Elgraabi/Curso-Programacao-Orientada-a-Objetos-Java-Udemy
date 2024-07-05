package entities;

public class PessoaFisica extends Contribuinte {

	// Atributos
	private double gastosSaude;
	
	// Metodos Especificos
	@Override
	public double calculoImposto() {
		double imposto = 0;
		if (getRendaAnual() < 20000.00) {
			imposto = getRendaAnual() * 0.15;
		} else {
			imposto = getRendaAnual() * 0.25;
		}
		
		if (this.gastosSaude > 1) {
			imposto -= this.gastosSaude * 0.5;
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
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}
	
}
