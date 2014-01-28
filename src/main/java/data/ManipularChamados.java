package data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.Bairros2013;
import model.Samu2013;

public class ManipularChamados {
	
	public static List<Samu2013> getChamados(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("saude_rec");
		EntityManager manager = factory.createEntityManager();
		
		String consulta = "select h from " + Samu2013.class.getName() + " h";
		TypedQuery<Samu2013> query = manager.createQuery(consulta, Samu2013.class);
		List<Samu2013> solicitacoes = query.getResultList();
		
		return solicitacoes;
	}
	
	public static String localizarBairro(int codigo){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("saude_rec");
		EntityManager manager = factory.createEntityManager();
		
		String consulta = "SELECT descricao FROM " + Bairros2013.class.getName() + " WHERE codigo_bairro = " + codigo;
		
		@SuppressWarnings("unchecked")
		TypedQuery<String> query = (TypedQuery<String>) manager.createQuery(consulta);
		String resultado = query.getSingleResult();
		
		return resultado;	
	}
	
	public static int quantidadeBairros(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("saude_rec");
		EntityManager manager = factory.createEntityManager();
		
		String consulta = "SELECT B FROM " + Bairros2013.class.getName() + " B";
		
		TypedQuery<Bairros2013> query = manager.createQuery(consulta, Bairros2013.class);
		List<Bairros2013> resultado = query.getResultList();
		
		return resultado.size();
		
	}
	
	public static List<Samu2013> chamadosBairro(String nomeBairro){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("saude_rec");
		EntityManager manager = factory.createEntityManager();
		
		String consulta = "SELECT H FROM " + Bairros2013.class.getName() + " H WHERE DESCRICAO = '" + nomeBairro + "'";
		
		TypedQuery<Bairros2013> query1 = manager.createQuery(consulta, Bairros2013.class);
		List<Bairros2013> resultado = query1.getResultList();
		
		
		consulta = "SELECT H FROM " + Samu2013.class.getName() + " H WHERE BAIRROSAUDE_CODIGO = " + resultado.get(0).getCodigoBairro();
		
		TypedQuery<Samu2013> query2 = manager.createQuery(consulta, Samu2013.class);
		List<Samu2013> chamados = query2.getResultList();
		
		return chamados;
	}
	
}