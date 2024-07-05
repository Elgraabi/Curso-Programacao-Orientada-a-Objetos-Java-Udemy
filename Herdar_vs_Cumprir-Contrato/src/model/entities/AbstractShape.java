package model.entities;

import model.entities.enums.Color;

public abstract class AbstractShape implements Shape {

	// Atributos
	private Color color;

	// Metodos Especificos

	// Metodos Especiais
	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
