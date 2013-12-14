package saude_rec;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Samu2013;
import model.Solicitacoes2013;
import model.Viatura2013;

public class ReadingTest{
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("saude_rec");
		EntityManager manager = factory.createEntityManager();
		
		String consulta = "SELECT H FROM " + Samu2013.class.getName() + " H";
		TypedQuery<Samu2013> query = manager.createQuery(consulta, Samu2013.class);
		List<Samu2013> solicitacoes = query.getResultList();
				
		System.out.println("Lista de Remoções que o SAMU fez em 2013");
		for(Samu2013 distrito : solicitacoes){
			System.out.println(distrito.getId().getBairrosaudeCodigo());
		}
	}
}

