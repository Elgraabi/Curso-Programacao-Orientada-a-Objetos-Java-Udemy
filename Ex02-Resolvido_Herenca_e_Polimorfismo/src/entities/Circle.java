package entities;

import entities.enums.Color;

public class Circle extends Shape{

	// Atributos
	private Double radius;
	
	// Metodos Especificos
	@Override
	public double area() {
		return Math.PI * this.radius * this.radius;
	}

	// Metodos Especiais
	public Circle() {
		super();
	}

	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
}
