package model.entities;

import model.entities.enums.Color;

public class Rectangle extends AbstractShape {

	// Atributos
	private Double width;
	private Double height;

	// Metodos Especiais
	@Override
	public double area() {
		return width * height;
	}

	// Metodos Especificos
	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

}
