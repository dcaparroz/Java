package br.com.fiap.entity;

import javax.persistence.*;

@Entity
@Table(name="notas")
public class Notas {
	
	private static final long serialVersionUID = 1L;

	@Id
	@ManyToOne(fetch =FetchType.LAZY)
	@JoinColumn(name="ID_DISCIPLINA")
	private Integer id;

	@Column(name="PROJETO1")
	private Integer nota1;
	
	@Column(name="ATIVIDADEPRATICA")
	private Integer nota2;
	
	@Column(name="PROJETO2")
	private Integer nota3;
	
	
	public String Calcula(Integer n1, Integer n2, Integer n3){
		
	     Integer v1= n1*(30/100);
	     Integer v2= n2*(30/100);
	     Integer v3= n3*(40/100);
	     
	     Integer total=v1+v2+v3;
	     if(7<=total){
	    	  return "Aprovado";
	    	 }else{
	    	  return "Reprovado";
	    	 }
	     
	}
	
}
