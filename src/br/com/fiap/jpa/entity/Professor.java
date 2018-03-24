package br.com.fiap.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_E_PROFESSOR")
@SequenceGenerator(name="professor",sequenceName="SQ_T_E_PROFESSOR",allocationSize=1)
public class Professor {

	@Id
	@Column(name="cd_professor")
	@GeneratedValue(generator="professor",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name="nm_professor")
	private String nome;
	
	
	public Professor() {
		super();
	}


	public Professor(String nome) {
		super();
		this.nome = nome;
	}

	
	
	
}
