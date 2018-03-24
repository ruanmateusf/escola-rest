package br.com.fiap.jpa.entity;

import java.util.Calendar;

public class Aluno {

	private int codigo;
	private String nome;
	private Curso curso;
	private Calendar dataMAtricula;
	
	public Aluno() {
		super();
	}

	public Aluno(String nome, Curso curso, Calendar dataMAtricula) {
		super();
		this.nome = nome;
		this.curso = curso;
		this.dataMAtricula = dataMAtricula;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Calendar getDataMAtricula() {
		return dataMAtricula;
	}

	public void setDataMAtricula(Calendar dataMAtricula) {
		this.dataMAtricula = dataMAtricula;
	}
			
}
