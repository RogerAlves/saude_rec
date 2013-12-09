package saude_rec;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Bairros2013;
import model.Hospitais2013;
import model.Remocoes2013;

public class ReadingTest{
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("saude_rec");
		EntityManager manager = factory.createEntityManager();
		
		String consulta = "select h from " + Bairros2013.class.getName() + " h";
		List<Bairros2013> bairros = manager.createQuery(consulta).getResultList();
				
		System.out.println("Lista de Remoções que o SAMU fez em 2013");
		for(Bairros2013 bairro : bairros){
			System.out.println(bairro.getDescricao());
		}
	}
}

