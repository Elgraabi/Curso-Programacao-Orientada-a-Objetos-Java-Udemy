package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {

	// Atributos
	private Integer numContrato;
	private LocalDate dataContrato;
	private Double valorTotal;
	private List<Parcela> parcelas = new ArrayList<Parcela>();

	// Metodos Especificos

	// Metodos Especiais
	public Contrato() {
		super();
	}

	public Contrato(Integer numContrato, LocalDate dataContrato, Double valorTotal) {
		super();
		this.numContrato = numContrato;
		this.dataContrato = dataContrato;
		this.valorTotal = valorTotal;
	}

	public Integer getNumContrato() {
		return numContrato;
	}

	public void setNumContrato(Integer numContrato) {
		this.numContrato = numContrato;
	}

	public LocalDate getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(LocalDate dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Parcela> getParcelas() {
		return parcelas;
	}

}
