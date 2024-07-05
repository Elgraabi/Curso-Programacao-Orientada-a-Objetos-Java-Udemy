package entities;

public class OutsourcedEmployee extends Employee {

	// Atributos
	private Double additionalCharge;
	
	// Metodos Especificos
	@Override
	public final double payment() {
		return super.payment() + this.additionalCharge * 1.1;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	// Metodos Especiais
	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuesPerHours, Double additionalCharge) {
		super(name, hours, valuesPerHours);
		this.additionalCharge = additionalCharge;
	}


	public Double getAdditionalCharge() {
		return additionalCharge;
	}


	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
}
