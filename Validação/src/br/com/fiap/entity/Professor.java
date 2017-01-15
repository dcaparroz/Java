package br.com.fiap.entity;

import javax.persistence.*;

@Entity
@Table(name="profesor")
public class Professor {
	
	private static final long serialVersionUID = 1L;
// many to one para indicar qual o usuario é professor ?	
	@Id @GeneratedValue
	@Column(name="ID")
	private Integer Id;
	
	@Column(name="NOME")
	private String nome;

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

	public Professor(Integer id, String nome) {
		setId(id);
		setNome(nome);
	}

	
}
