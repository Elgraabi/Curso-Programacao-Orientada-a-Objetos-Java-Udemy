package model.services;

import java.time.LocalDate;

import model.entities.Contrato;
import model.entities.Parcela;

public class ContratoServico {
	
	// Atributos
	private ServicoDePagamentoOnline servicoDePagamentoOnline;
	
	// Metodos Especificos
	public void processamentoContrato(Contrato contrato, int meses) {
		double parcelaBasica = contrato.getValorTotal() / meses;
		for (int i = 1; i <= meses; i++) {
			LocalDate dueDate = contrato.getDataContrato().plusMonths(i);
			double juros = servicoDePagamentoOnline.juros(parcelaBasica, i);
			double taxa = servicoDePagamentoOnline.taxaDePagamento(parcelaBasica + juros);
			double quota = parcelaBasica + juros + taxa;
			contrato.getParcelas().add(new Parcela(dueDate, quota));
		}
	}

	// Metodos Especiais
	public ContratoServico(ServicoDePagamentoOnline servicoDePagamentoOnline) {
		super();
		this.servicoDePagamentoOnline = servicoDePagamentoOnline;
	}

	public ServicoDePagamentoOnline getServicoDePagamentoOnline() {
		return servicoDePagamentoOnline;
	}

	public void setServicoDePagamentoOnline(ServicoDePagamentoOnline servicoDePagamentoOnline) {
		this.servicoDePagamentoOnline = servicoDePagamentoOnline;
	}
	
}
