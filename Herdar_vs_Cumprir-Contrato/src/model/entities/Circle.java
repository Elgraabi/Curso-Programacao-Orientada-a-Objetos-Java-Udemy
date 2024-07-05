package model.entities;

import model.entities.enums.Color;

public class Circle extends AbstractShape {
	
	// Atributos
	private Double radius;
	
	// Metodos Especiais
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	
	// Metodos Especificos
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
