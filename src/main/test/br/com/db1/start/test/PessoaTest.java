package br.com.db1.start.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import br.com.db1.start.classes.Pessoa;

public class PessoaTest {

	@Test
	public void inserirPessoa() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Jose Farias");
		pessoa.setDocumento("07365658825");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(pessoa);
		manager.getTransaction().commit();
		
		factory.close();
		
	}
}
