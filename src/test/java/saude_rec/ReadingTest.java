package saude_rec;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Solicitacoes2013;
import model.Viatura2013;

public class ReadingTest{
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("saude_rec");
		EntityManager manager = factory.createEntityManager();
		
		String consulta = "SELECT H FROM " + Solicitacoes2013.class.getName() + " H";
		TypedQuery<Solicitacoes2013> query = manager.createQuery(consulta, Solicitacoes2013.class);
		List<Solicitacoes2013> solicitacoes = query.getResultList();
				
		System.out.println("Lista de Remoções que o SAMU fez em 2013");
		for(Solicitacoes2013 distrito : solicitacoes){
			System.out.println(distrito.getId().getDataChegada());
		}
	}
}

