package br.com.fiap.entity;

import javax.persistence.*;

@Entity
@Table(name="disciplina")
public class Disciplina {
	
	private static final long serialVersionUID = 1L;

	
	@Id@GeneratedValue
	@Column(name="ID_DISCIPLINA")
	private Integer id;
	
	@Column(name="NOME")
	private String nome;
/* Linnkar a tabela de curso com a disciplina como?
 * 	
 */

	@Column(name="IDCURSO")
	private Integer Curso;
/*
 * Linkar a tabela de disciplina com a de professor para distinguir
 * qual professor de cada disciplina 	
 */
	
	@Column(name="IDPROFESSOR")
	private Integer professor;

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

	public Integer getCurso() {
		return Curso;
	}

	public void setCurso(Integer curso) {
		Curso = curso;
	}

	public Integer getProfessor() {
		return professor;
	}

	public void setProfessor(Integer professor) {
		this.professor = professor;
	}

	
	public Disciplina(Integer id, String nome, Integer curso, Integer professor) {
		
		setId(id);
		setNome(nome);
		setCurso(curso);
		setProfessor(professor);
	}

	
}
