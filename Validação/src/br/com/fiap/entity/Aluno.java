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
	@Column(name="ID")
	private Integer Id;
	
	@Column(name="NOME")
	private String nome;
//Many to one com ID curso ???	para indicar de qual curso pertence o aluno
	@Column(name="CURSO")
	private Integer IdCurso;
	

	public Integer getIdCurso() {
		return IdCurso;
	}

	public void setIdCurso(Integer idCurso) {
		IdCurso = idCurso;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
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