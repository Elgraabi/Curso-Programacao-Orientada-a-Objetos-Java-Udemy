package entities;

public final class BusinessAccount extends Account {

	// Atributos
	private Double loanLimit;
	
	// Metodos Especificos
	public void loan(double amount) {
		if (amount <= this.loanLimit) {
			balance += amount - 10;
		}
	}
	
	@Override
	public void withdraw (double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
	
	// Metodos Especiais
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
}
