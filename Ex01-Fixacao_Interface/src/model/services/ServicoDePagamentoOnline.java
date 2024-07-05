package model.services;

public interface ServicoDePagamentoOnline {
	
	// Atributos
	
	// Metodos Especificos 
	public Double taxaDePagamento(Double valor);
	public Double juros(Double valor, Integer meses);
		
	// Metodos Especiais
	
}
