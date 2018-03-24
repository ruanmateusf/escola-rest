package br.com.fiap.jpa.entity;

public class Curso {

	private int codigo;
	private String nome;
	private Periodo periodo;
	private Professor professor;
	private String unidade;
	
	public Curso() {
		super();
	}

	public Curso(String nome, Periodo periodo, Professor professor, String unidade) {
		super();
		this.nome = nome;
		this.periodo = periodo;
		this.professor = professor;
		this.unidade = unidade;
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

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	
	
	
	
}