package br.com.fiap.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="universidade")
public class Universidade {
	
/* Como "linkar" a tabela de universidade com a de curso ?
 * 
 */
	@Id @GeneratedValue
	@Column(name="ID_UNIVERSIDADE")
	private Integer Id;
	
	@Column(name="NOME")
	private String nome;

	
	@OneToMany(cascade= CascadeType.ALL,  fetch = FetchType.LAZY, mappedBy ="curso")
	private Set<Curso> cursos= new HashSet<Curso>();
	
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

	public Universidade(Integer id, String nome) {
		setId(id);
		setNome(nome);
	}
	
	
}
