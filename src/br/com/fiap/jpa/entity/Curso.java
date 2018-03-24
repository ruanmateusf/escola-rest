package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_E_CURSO")
@SequenceGenerator(name="curso",sequenceName="SQ_T_E_CURSO",allocationSize=1)
public class Curso {
	
	@Id
	@Column(name="cd_curso")
	@GeneratedValue(generator="curso",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_curso")
	private String nome;
	
	@Column(name="ds_periodo")
	@Enumerated(EnumType.STRING)
	private Periodo periodo;
	
	@Column(name="nm_professor")
	private Professor professor;
	
	@Column(name="ds_unidade")
	private String unidade;
	
	public Curso() {
		super();
	}

	public Curso(String nome, Periodo periodo, Professor professor, String unidade) {
		super();
		this.nome = nome;
		this.periodo = periodo;
		this.professor = professor;
		this.setUnidade(unidade);
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

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
	
}