package saude_rec;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Samu2011;

public class ReadingTest{
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("saude_rec");
		EntityManager manager = factory.createEntityManager();
		
		String consulta = "SELECT H FROM " + Samu2011.class.getName() + " H";
		TypedQuery<Samu2011> query = manager.createQuery(consulta, Samu2011.class);
		List<Samu2011> solicitacoes = query.getResultList();
				
		System.out.println("Lista de Remoções que o SAMU fez em 2013");
		for(Samu2011 distrito : solicitacoes){
			System.out.println(distrito.getId().getSolicitacaoData());
		}
	}
}

