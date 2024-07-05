package entities;

public class SavingsAccount extends Account {
	
	// Atributos
	private Double interestRate;
	
	// Metodos Especificos
	public void updateBalence() {
		balance += this.interestRate * balance;
	}
	
	@Override
	public final void withdraw (double amount) {
		balance -= amount;
	}
	
	// Metosos Especiais
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
}
