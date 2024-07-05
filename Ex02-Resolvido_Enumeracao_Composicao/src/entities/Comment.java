package entities;

public class Comment {
	
	//Atributos
	private String text = "";

	//Metodos Especificos
	
	
	//Metodos Especiais
	public Comment() {
		super();
	}

	public Comment(String text) {
		super();
		this.text = text;
	}

	@Override
	public String toString() {
		return "Comment [text=" + text + "]";
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}
