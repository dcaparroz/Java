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

@Entity
public class Curso {
	

	@Id @GeneratedValue
	@Column(name="ID_CURSO")
	private Integer IdCurso;
	
	@Column(name="NOME")
	private String nome;
/* Many to one com ID universidade para indicar de qual universidade pertence o
   curso */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="ID_UNIVERSIDADE")
	private Universidade universidade;

	@OneToMany(cascade= CascadeType.ALL,  fetch = FetchType.LAZY, mappedBy ="disciplina")
	private Set <Disciplina> disciplinas = new HashSet<Disciplina>();	
	
	@OneToMany(cascade= CascadeType.ALL,  fetch = FetchType.LAZY, mappedBy ="disciplina")
	private Set<Aluno> alunos = new HashSet<Aluno>();
	
	public Integer getIdCurso() {
		return IdCurso;
	}
	public void setIdCurso(Integer idCurso) {
		IdCurso = idCurso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Universidade getUnivesirdade() {
		return universidade;
	}
	public void setUniversidade(Universidade univesirdade) {
		this.universidade = univesirdade;
	}
	public Curso (Integer id, String nome, Universidade universidade ){
		setIdCurso(id);
		setNome(nome);
		setUniversidade(universidade);
	}
	
}
