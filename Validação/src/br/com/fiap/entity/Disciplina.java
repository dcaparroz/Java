package br.com.fiap.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="disciplina")
public class Disciplina {
	
	@Id@GeneratedValue
	@Column(name="ID_DISCIPLINA")
	private Integer id;
	
	@Column(name="NOME")
	private String nome;
/* Linnkar a tabela de curso com a disciplina como?
 * 	
 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_CURSO")
	private Curso curso;
/*
 * Linkar a tabela de disciplina com a de professor para distinguir
 * qual professor de cada disciplina 	
 */
	
	@OneToOne(cascade = CascadeType.ALL)
	private Professor professor;
	
	@OneToMany(cascade= CascadeType.ALL,  fetch = FetchType.LAZY, mappedBy ="notas")
	private Set <Notas> notas = new HashSet<Notas>();

	public Curso getCurso() {
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

	public  Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	
	public Disciplina(Integer id, String nome, Curso curso, Professor professor) {
		
		setId(id);
		setNome(nome);
		setCurso(curso);
		setProfessor(professor);
	}

	
}
