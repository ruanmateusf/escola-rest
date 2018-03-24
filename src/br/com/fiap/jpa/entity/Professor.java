package br.com.fiap.jpa.entity;

public class Professor {

	private int codigo;
	private String nome;
	
	
	public Professor() {
		super();
	}


	public Professor(String nome) {
		super();
		this.nome = nome;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
