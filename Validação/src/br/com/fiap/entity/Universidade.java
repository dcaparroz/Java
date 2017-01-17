package br.com.fiap.entity;

import javax.persistence.*;

@Entity
@Table(name="universidade")
public class Universidade {
	
	private static final long serialVersionUID = 1L;
	
/* Como "linkar" a tabela de universidade com a de curso ?
 * 
 */
	@Id @GeneratedValue
	@Column(name="ID_UNIVERSIDADE")
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

	public Universidade(Integer id, String nome) {
		setId(id);
		setNome(nome);
	}
	
	
}
