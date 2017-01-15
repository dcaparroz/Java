package br.com.fiap.entity;

import javax.persistence.*;

@Entity
public class Curso {
	
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	@Column(name="ID")
	private Integer IdCurso;
	
	@Column(name="NOME")
	private String nome;
/* Many to one com ID universidade para indicar de qual universidade pertence o
   curso */
	@Column(name="IDUNIVERS")
	private Integer IdUniversidade;
	
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
	public Integer getIdUniversidade() {
		return IdUniversidade;
	}
	public void setIdUniversidade(Integer idUniversidade) {
		IdUniversidade = idUniversidade;
	}
	
	public Curso (Integer id, String nome, Integer universidade ){
		setIdCurso(id);
		setNome(nome);
		setIdUniversidade(universidade);
	}
	
}
