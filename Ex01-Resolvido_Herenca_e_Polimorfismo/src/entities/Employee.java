package entities;

public class Employee {
	
	// Atributos
	private String name;
	private Integer hours;
	private Double valuesPerHours;

	// Metodos Especificos
	public double payment() {
		return this.hours * this.valuesPerHours;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.name + " - $" + String.format("%.2f", this.payment()));
		return sb.toString();
	}
	
	// Metodos Especiais
	public Employee() {
		super();
	}


	public Employee(String name, Integer hours, Double valuesPerHours) {
		super();
		this.name = name;
		this.hours = hours;
		this.valuesPerHours = valuesPerHours;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getHours() {
		return hours;
	}


	public void setHours(Integer hours) {
		this.hours = hours;
	}


	public Double getValuesPerHours() {
		return valuesPerHours;
	}


	public void setValuesPerHours(Double valuesPerHours) {
		this.valuesPerHours = valuesPerHours;
	}
	
}
