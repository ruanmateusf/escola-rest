package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_E_MATERIA")
@SequenceGenerator(name="materia",sequenceName="SQ_T_E_MATERIA",allocationSize=1)
public class Materia {
	
	@Id
	@GeneratedValue(generator="name",strategy=GenerationType.SEQUENCE)
	@Column(name="cd_materia")
	private int codigo;
	
	@Column(name="nm_materia")
	private String nome;
	
	@Column(name="nm_curso")
	private Curso curso;
	
	
	public Materia() {
		super();
	}


	public Materia(String nome, Curso curso) {
		super();
		this.nome = nome;
		this.curso = curso;
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

}
