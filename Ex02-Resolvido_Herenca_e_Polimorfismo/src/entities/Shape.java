package entities;

import entities.enums.Color;

public abstract class Shape {

	// Atributos
	private Color color;

	// Metodos Especificos
	public abstract double area();
	

	// Metodos Especiais
	public Shape() {
		super();
	}

	public Shape(Color color) {
		super();
		this.color = color;
	}


	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
