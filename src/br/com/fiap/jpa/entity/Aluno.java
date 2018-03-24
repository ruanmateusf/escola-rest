package br.com.fiap.jpa.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_E_ALUNO")
@SequenceGenerator(name="aluno",sequenceName="SQ_T_E_ALUNO",allocationSize=1)
public class Aluno {

	@Id
	@Column(name="cd_aluno")
	@GeneratedValue(generator="aluno",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_aluno", length=150, nullable=false)
	private String nome;
	
	@Column(name="ds_curso")
	private Curso curso;
	
	@Column(name="dt_matricula")
	@Temporal(TemporalType.DATE)
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
