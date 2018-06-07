package br.com.db1.start.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import br.com.db1.start.classes.Cidade;
import br.com.db1.start.classes.Endereco;
import br.com.db1.start.classes.Pessoa;

public class EnderecoTest {
	
	@Test
	public void enderecoTest() {
		Cidade cidade = new Cidade();
		cidade.setId(50);
		
		Pessoa pessoa = new Pessoa();
		pessoa.setId(8);
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua FCV");
		endereco.setCep("87050250");
		endereco.setTipo(1);
		endereco.setNumero("435");
		endereco.setTipoLogradouro("RUA");
		endereco.setCidade(cidade);
		endereco.setPessoa(pessoa);
		
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("db1start");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(endereco);
		manager.getTransaction().commit();

		factory.close();

	}

}
