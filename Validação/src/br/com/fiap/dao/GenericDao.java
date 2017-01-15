package br.com.fiap.dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import javax.persistence.*;
import com.mysql.jdbc.Connection;
import br.com.fiap.entity.Usuario;

public class GenericDao<T> implements Dao<T> {

	private final Class<T> classe;
	protected EntityManager em;
	JpaUtil jpa;
	
	public GenericDao(Class<T> classe) {
		jpa = new JpaUtil();
		this.classe = classe;
	}

	@Override
	public void adicionar(T entidade) {
		
		em = JpaUtil.getEntityManager();
        em.getTransaction().begin();
		em.persist(entidade);
		em.getTransaction().commit();
		em.close();
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<T> listar() {
		em = JpaUtil.getEntityManager();
		return em.createQuery("From " + classe.getSimpleName()).getResultList();
	}

	@Override
	public T buscar(int id) {
		System.out.println("Entrou na JpaUtil");
		em = JpaUtil.getEntityManager();
		em.getTransaction().begin();
		T entidade = em.find(classe, id);
		em.getTransaction().commit();
		em.close();

		return entidade;
	}
	
	public Usuario buscarUsuario(String nome, String senha) throws SQLException{
			
//	Connection conexao = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dbnotas");
//		System.out.println("Conectou");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaPU");
		em = emf.createEntityManager();
		
		em = jpa.getEntityManager();
		em.getTransaction().begin();		
		
		Query query = em.createQuery(
			"select u from Usuario u where nome = :nome and senha = :senha");
		
		query.setParameter("nome", nome);
		query.setParameter("senha", senha);
		return (Usuario)query.getSingleResult();
	}

}
