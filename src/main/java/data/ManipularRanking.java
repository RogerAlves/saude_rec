package data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.RankingBairros;
import model.RankingBairrosId;

public class ManipularRanking {
	public static void salvarRanking(String[][] rankingChamados){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("saude_rec");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();   
		
		for(int i = 0; i < rankingChamados.length; i++){
			if(rankingChamados[i][0] == null){
				break;
			} else {
				RankingBairrosId rankTrue = new RankingBairrosId();
				System.out.println(rankingChamados[i][0]);
			
				rankTrue.setCodigoBairro(rankingChamados[i][0]);
				rankTrue.setNomeBairro(rankingChamados[i][2]);
				rankTrue.setNumeroChamados(rankingChamados[i][1]);
				rankTrue.setPosicao(i+"");
				
				RankingBairros rank = new RankingBairros();
				rank.setId(rankTrue);
				
				manager.merge(rank);
				//Insere os dados no banco de dados
			}
		}transaction.commit();	
	}
	
	public static String[][] getRanking(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("saude_rec");
		EntityManager manager = factory.createEntityManager();
		
		String consulta = "SELECT H FROM " + RankingBairros.class.getName() + " H";
		
		TypedQuery<RankingBairros> query = manager.createQuery(consulta, RankingBairros.class);
		List<RankingBairros> rankingBairros = query.getResultList();
	
		String[][] ranking = new String[rankingBairros.size()][3];
		for(int i = 0; i < rankingBairros.size(); i++){
			ranking[i][0] = rankingBairros.get(i).getId().getCodigoBairro();
			ranking[i][1] = rankingBairros.get(i).getId().getNumeroChamados();
			ranking[i][2] = rankingBairros.get(i).getId().getNomeBairro();
		}
		
		return ranking;
	}
	
}
