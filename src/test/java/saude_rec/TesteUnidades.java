package saude_rec;

import java.util.List;

import model.AcademiasDaCidade;
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
import data.ManipularUnidadesSaude;

public class TesteUnidades {
	public static void main(String[] args) {
		
		List<AcademiasDaCidade> academias =  ManipularUnidadesSaude.getAcademias("AREIAS");
		for (int i = 0; i < academias.size(); i++){
			System.out.println(academias.get(i).getNome());
		}
		
		
		List<Spa> spa =  ManipularUnidadesSaude.getSpa("AFOGADOS");
		for (int i = 0; i < spa.size(); i++){
			System.out.println(spa.get(i).getId().getUnidade());
		}
		
		List<Ubs> ubs =  ManipularUnidadesSaude.getUbs("NOVA DESCOBERTA");
		for (int i = 0; i < ubs.size(); i++){
			System.out.println(ubs.get(i).getNomeUnidade());
		}
		
		List<Usf> usf =  ManipularUnidadesSaude.getUsf("SANTO AMARO");
		for (int i = 0; i < usf.size(); i++){
			System.out.println(usf.get(i).getNomeUnidade());
		}
		
		List<CentrosEspecialidadesOdontologicas> ceos =  ManipularUnidadesSaude.getCeo("CENTRO");
		for (int i = 0; i < ceos.size(); i++){
			System.out.println(ceos.get(i).getNomeCentro());
		}
		
		
		List<FarmaciasDaFamilia> farmacias =  ManipularUnidadesSaude.getFarmacias("CENTRO");
		for (int i = 0; i < farmacias.size(); i++){
			System.out.println(spa.get(i).getId().getUnidade());
		}
		
		List<Hospitais2013> hospitais =  ManipularUnidadesSaude.getHospitais("AFOGADOS");
		for (int i = 0; i < hospitais.size(); i++){
			System.out.println(hospitais.get(i).getId().getHospitalNome());
		}
		
		List<Nasf> nasf =  ManipularUnidadesSaude.getNasf("CENTRO");
		for (int i = 0; i < nasf.size(); i++){
		
			System.out.println(nasf.get(i).getNomeNucleo());
		}
		
		List<Policlinicas> policlinicas =  ManipularUnidadesSaude.getPoliclinicas("CENTRO");
		for (int i = 0; i < policlinicas.size(); i++){
			System.out.println(policlinicas.get(i).getId().getUnidade());
		}
		
		List<Sadt> sadt =  ManipularUnidadesSaude.getSadt("CENTO");
		for (int i = 0; i < sadt.size(); i++){
			System.out.println(sadt.get(i).getId().getUnidade());
		}
		
		List<SaudeMental> caps =  ManipularUnidadesSaude.getCaps("CENTRO");
		for (int i = 0; i < caps.size(); i++){
		
			System.out.println(caps.get(i).getId().getUnidade());
		}
		
		
	}

}
