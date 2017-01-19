package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="aluno")
public class Aluno {
	
// Many to one com ID usuario ???	para indicar qual o usuario é aluno
	@Id @GeneratedValue
	@Column(name="ID_ALUNO")
	private Integer id;
	
	@Column(name="NOME")
	private String nome;
//Many to one com ID curso ???	para indicar de qual curso pertence o aluno
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_CURSO")
	private Curso curso;
	

	public Curso getIdCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Aluno(Integer id, String nome, Curso curso) {
		setId(id);
		setNome(nome);
		setCurso(curso);
	}

	
}