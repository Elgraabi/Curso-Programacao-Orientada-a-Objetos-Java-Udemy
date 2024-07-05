package service;

public class BrazilInterestService implements InterestService {

	// Atributos
	private double interestRate;
	
	// Metodos Especificos 
	
	
	// Metodos Especiais 
	public BrazilInterestService(double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		return "BrazilInterestService [interestRate=" + interestRate + "]";
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
	
}
