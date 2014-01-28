package data;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.AcademiasDaCidade;
import model.Bairros2013;
import model.CentrosEspecialidadesOdontologicas;
import model.FarmaciasDaFamilia;
import model.Hospitais2013;
import model.Nasf;
import model.Policlinicas;
import model.Sadt;
import model.SaudeMental;
import model.Spa;
import model.Ubs;
import model.Usf;

public class ManipularUnidadesSaude {
	public static List<AcademiasDaCidade> getAcademias(String nomeBairro){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("saude_rec");
		EntityManager manager = factory.createEntityManager();
		
		String consulta = "SELECT H FROM " + AcademiasDaCidade.class.getName() + " H WHERE NOME_BAIRRO = :nomebairro";
		
		TypedQuery<AcademiasDaCidade> query = manager.createQuery(consulta, AcademiasDaCidade.class);
		query.setParameter("nomebairro", nomeBairro);
		List<AcademiasDaCidade> academias = query.getResultList();
		
		return academias;		
	}
	
	public static List<CentrosEspecialidadesOdontologicas> getCeo(String nomeBairro){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("saude_rec");
		EntityManager manager = factory.createEntityManager();
		
		String consulta = "SELECT H FROM " + CentrosEspecialidadesOdontologicas.class.getName() + " H WHERE NOME_BAIRRO = '" + nomeBairro + "'";
		
		TypedQuery<CentrosEspecialidadesOdontologicas> query = manager.createQuery(consulta, CentrosEspecialidadesOdontologicas.class);
		List<CentrosEspecialidadesOdontologicas> ceo = query.getResultList();
		
		return ceo;		
	}
	
	public static List<FarmaciasDaFamilia> getFarmacias(String nomeBairro){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("saude_rec");
		EntityManager manager = factory.createEntityManager();
		
		String consulta = "SELECT H FROM " + FarmaciasDaFamilia.class.getName() + " H WHERE BAIRRO = '" + nomeBairro + "'";
		
		TypedQuery<FarmaciasDaFamilia> query = manager.createQuery(consulta, FarmaciasDaFamilia.class);
		List<FarmaciasDaFamilia> farmacias = query.getResultList();
		
		return farmacias;		
	}
	
	public static List<Hospitais2013> getHospitais(String nomeBairro){
		List<Bairros2013> bairros = getCodigoBairro(nomeBairro);
		
		List<Hospitais2013> hospitais = new ArrayList<Hospitais2013>();
		
		for(int i = 0; i < bairros.size(); i++){
			int codigoBairro = bairros.get(i).getCodigoBairro();
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("saude_rec");
			EntityManager manager = factory.createEntityManager();
			
			String consulta = "SELECT H FROM " + Hospitais2013.class.getName() + " H WHERE BAIRROSAUDE_CODIGO = '" + codigoBairro + "'";
			
			TypedQuery<Hospitais2013> query = manager.createQuery(consulta, Hospitais2013.class);
			List<Hospitais2013> hospitaisParcial = query.getResultList();
			
			for(int j = 0; j < hospitaisParcial.size(); j++){
				hospitais.add(hospitaisParcial.get(j));
			}
		}
		
		return hospitais;		
	}
	
	private static List<Bairros2013> getCodigoBairro(String nomeBairro){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("saude_rec");
		EntityManager manager = factory.createEntityManager();
		
		String consulta = "SELECT H FROM " + Bairros2013.class.getName() + " H WHERE DESCRICAO = '" + nomeBairro + "'";
		
		TypedQuery<Bairros2013> query = manager.createQuery(consulta, Bairros2013.class);
		List<Bairros2013> bairro = query.getResultList();
		
		return bairro;
	}
	
	public static List<Nasf> getNasf(String nomeBairro){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("saude_rec");
		EntityManager manager = factory.createEntityManager();
		
		String consulta = "SELECT H FROM " + Nasf.class.getName() + " H WHERE AREA = '" + nomeBairro + "'";
		
		TypedQuery<Nasf> query = manager.createQuery(consulta, Nasf.class);
		List<Nasf> nasf = query.getResultList();
		
		return nasf;		
	}
	
	public static List<Policlinicas> getPoliclinicas(String nomeBairro){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("saude_rec");
		EntityManager manager = factory.createEntityManager();
		
		String consulta = "SELECT H FROM " + Policlinicas.class.getName() + " H WHERE BAIRRO = '" + nomeBairro + "'";
		
		TypedQuery<Policlinicas> query = manager.createQuery(consulta, Policlinicas.class);
		List<Policlinicas> policlinicas = query.getResultList();
		
		return policlinicas;		
	}
	
	public static List<SaudeMental> getCaps(String nomeBairro){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("saude_rec");
		EntityManager manager = factory.createEntityManager();
		
		String consulta = "SELECT H FROM " + SaudeMental.class.getName() + " H WHERE BAIRRO = '" + nomeBairro + "'";
		
		TypedQuery<SaudeMental> query = manager.createQuery(consulta, SaudeMental.class);
		List<SaudeMental> caps = query.getResultList();
		
		return caps;		
	}
	
	public static List<Sadt> getSadt(String nomeBairro){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("saude_rec");
		EntityManager manager = factory.createEntityManager();
		
		String consulta = "SELECT H FROM " + Sadt.class.getName() + " H WHERE BAIRRO = '" + nomeBairro + "'";
		
		TypedQuery<Sadt> query = manager.createQuery(consulta, Sadt.class);
		List<Sadt> sadt = query.getResultList();
		
		return sadt;		
	}
	
	public static List<Spa> getSpa(String nomeBairro){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("saude_rec");
		EntityManager manager = factory.createEntityManager();
		
		String consulta = "SELECT H FROM " + Spa.class.getName() + " H WHERE BAIRRO = '" + nomeBairro + "'";
		
		TypedQuery<Spa> query = manager.createQuery(consulta, Spa.class);
		List<Spa> spa = query.getResultList();
		
		return spa;		
	}
	
	public static List<Ubs> getUbs(String nomeBairro){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("saude_rec");
		EntityManager manager = factory.createEntityManager();
		
		String consulta = "SELECT H FROM " + Ubs.class.getName() + " H WHERE BAIRRO = '" + nomeBairro + "'";
				
		TypedQuery<Ubs> query = manager.createQuery(consulta, Ubs.class);
		List<Ubs> ubs = query.getResultList();
		
		return ubs;		
	}
	
	public static List<Usf> getUsf(String nomeBairro){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("saude_rec");
		EntityManager manager = factory.createEntityManager();
		
		String consulta = "SELECT H FROM " + Usf.class.getName() + " H WHERE NOME_BAIRRO = '" + nomeBairro + "'";
				
		TypedQuery<Usf> query = manager.createQuery(consulta, Usf.class);
		List<Usf> usf = query.getResultList();
		
		return usf;		
	}
	

}
