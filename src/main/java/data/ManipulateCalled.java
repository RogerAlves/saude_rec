package data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Bairros2013;
import model.Distritos2013;
import model.Remocoes2013;
import model.Solicitacoes2011;
import model.Solicitacoes2012;
import model.Solicitacoes2013;

public class ManipulateCalled {
	
	public static List<Solicitacoes2011> getCalled(){
		EntityManagerFactory factory2 = Persistence.createEntityManagerFactory("saude_rec");
		EntityManager manager = factory2.createEntityManager();
		
		String consulta = "select h from " + Solicitacoes2011.class.getName() + " h";
		Query query = manager.createQuery(consulta);
		List<Solicitacoes2011> solicitacoes = query.getResultList();
		
		return solicitacoes;
	}
	
	
	

}
