package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aluno")
public class Aluno {
	
	private static final long serialVersionUID = 1L;
// Many to one com ID usuario ???	para indicar qual o usuario é aluno
	@Id @GeneratedValue
	@Column(name="ID_ALUNO")
	private Integer id;
	
	@Column(name="NOME")
	private String nome;
//Many to one com ID curso ???	para indicar de qual curso pertence o aluno
	@Column(name="CURSO")
	private Integer idCurso;
	

	public Integer getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(Integer idCurso) {
		idCurso = idCurso;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Aluno(Integer id, String nome, Integer curso) {
		setId(id);
		setNome(nome);
		setIdCurso(curso);
	}

	
}