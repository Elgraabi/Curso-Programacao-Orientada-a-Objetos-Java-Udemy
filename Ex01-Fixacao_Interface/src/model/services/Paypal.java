package model.services;

public class Paypal implements ServicoDePagamentoOnline {
	
	// Atributos
	
	// Metodos Especificos
	@Override
	public Double taxaDePagamento(Double valor) {
		return valor * 0.02;
	}

	@Override
	public Double juros(Double valor, Integer meses) {
		return valor * 0.01 * meses;
	}
	
	// Metodos Especiais
	
}
