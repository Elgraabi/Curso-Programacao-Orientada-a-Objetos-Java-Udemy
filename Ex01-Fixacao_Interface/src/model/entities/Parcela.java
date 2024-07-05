package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {
	
	// Atributos
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	private LocalDate vencimento;
	private Double valorParcela;
	
	// Metodos Especificos
	@Override
	public String toString() {
		return fmt.format(this.vencimento) + " - " + String.format("%.2f", this.valorParcela);
	}
	
	// Metodos Especiais
	public Parcela(LocalDate vencimento, Double valorParcela) {
		super();
		this.vencimento = vencimento;
		this.valorParcela = valorParcela;
	}

	public LocalDate getVencimento() {
		return vencimento;
	}

	public void setVencimento(LocalDate vencimento) {
		this.vencimento = vencimento;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public void setQuantMes(Double valorParcela) {
		this.valorParcela = valorParcela;
	}
	
}
