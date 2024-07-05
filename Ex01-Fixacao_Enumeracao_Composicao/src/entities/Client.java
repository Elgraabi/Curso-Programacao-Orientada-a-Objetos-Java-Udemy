package entities;

import java.util.Date;

public class Client {

	// Atributos
	private String nome;
	private String email;
	private Date birthDate;
	
	// Metodos Especificos
	
	// Metodos Especiais
	public Client() {
		super();
	}

	public Client(String nome, String email, Date birthDate) {
		super();
		this.nome = nome;
		this.email = email;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Client [nome=" + nome + ", email=" + email + ", birthDate=" + birthDate + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
}
