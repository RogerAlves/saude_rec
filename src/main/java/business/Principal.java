package business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.AcademiasDaCidade;
import model.CentrosEspecialidadesOdontologicas;
import model.FarmaciasDaFamilia;
import model.Hospitais2013;
import model.Nasf;
import model.Policlinicas;
import model.Sadt;
import model.Samu2013;
import model.SaudeMental;
import model.Spa;
import model.Ubs;
import model.Usf;
import data.ManipularChamados;
import data.ManipularRanking;
import data.ManipularUnidadesSaude;

@ManagedBean
@SessionScoped
public class Principal {
	private int codigosOrdenados[] = new int[ManipularChamados.quantidadeBairros()];
	private int chamadosBairros[] = new int[ManipularChamados.quantidadeBairros()];
	private String[][] rankingBairros;
	private List<AcademiasDaCidade> academiasBairro = new ArrayList <AcademiasDaCidade>();
	private List<CentrosEspecialidadesOdontologicas> ceos = new ArrayList <CentrosEspecialidadesOdontologicas>();
	private List<FarmaciasDaFamilia> farmacias = new ArrayList <FarmaciasDaFamilia>();
	private List<Hospitais2013> hospitais = new ArrayList <Hospitais2013>();
	private List<Nasf> nasf = new ArrayList <Nasf>();
	private List<Policlinicas> policlinicas = new ArrayList <Policlinicas>();
	private List<Sadt> sadt = new ArrayList <Sadt>();
	private List<SaudeMental> caps = new ArrayList <SaudeMental>();
	private List<Spa> spa = new ArrayList <Spa>();
	private List<Ubs> ubs = new ArrayList <Ubs>();
	private List<Usf> usf = new ArrayList <Usf>();
	private double ias;
	private final int[] pesosIas = {1, 1, 2, 1, 5, 2, 2, 2, 2, 2, 2, 2};
	
	/*public String ordenarChamadosBairros(){
		List<Samu2013> solicitacoes = ManipularChamados.getChamados();
		int tamanho = solicitacoes.size();
		int codigos[] = new int[tamanho];
		for(int i = 0; i < tamanho; i++){
			codigos[i] = solicitacoes.get(i).getId().getBairrosaudeCodigo();
		}
		
		Arrays.sort(codigos);
		
		int repeticoesMax = 0;
		int repeticoesParcial = 0;
		int codigoMaisRepetido = 0;
		
		for(int j = 0; j <= codigosOrdenados.length; j++){
			for(int i = 1; i < tamanho; i++){
				if(codigoChecado(codigos[i])){
					
				} else {
					if(codigos[i] == codigos[i-1]){
						repeticoesParcial += 1;
						if(repeticoesParcial > repeticoesMax){
							codigoMaisRepetido = codigos[i];
							repeticoesMax = repeticoesParcial;
						}
					} else {
						repeticoesParcial = 0;
					}
				}
			}
			
			if(j != 0){
				if(codigosOrdenados[j-1] == codigoMaisRepetido){
					j = codigosOrdenados.length;
				} else {
					this.adicionarCodigo(codigoMaisRepetido, j, repeticoesMax);
					repeticoesMax = 0;
					repeticoesParcial = 0;				}
			} else{
				this.adicionarCodigo(codigoMaisRepetido, j, repeticoesMax);
				repeticoesMax = 0;
				repeticoesParcial = 0;
			}
		}
		
		System.out.println("RANKING DE CHAMADOS AO SAMU EM 2013" + "\n" + "-------------");
		
		String resposta = "";
		for (int i = 0; i < this.codigosOrdenados.length; i++){
			if(this.codigosOrdenados[i] == 0){
				break;
			} else {
				resposta += "Bairro: " + this.codigosOrdenados[i] + "\n";
				resposta += "Número de Chamados em 2013: " + this.chamadosBairros[i] + "\n";
				resposta += ManipularChamados.localizarBairro(this.codigosOrdenados[i]) + "\n" + "\n";
			}
		}
		return resposta;
		
	}*/
	
	public void rankingBairros(){
		List<Samu2013> solicitacoes = ManipularChamados.getChamados();
		int tamanho = solicitacoes.size();
		int codigos[] = new int[tamanho];
		for(int i = 0; i < tamanho; i++){
			codigos[i] = solicitacoes.get(i).getId().getBairrosaudeCodigo();
		}
		
		Arrays.sort(codigos);
		
		int repeticoesMax = 0;
		int repeticoesParcial = 0;
		int codigoMaisRepetido = 0;
		
		for(int j = 0; j <= codigosOrdenados.length; j++){
			for(int i = 1; i < tamanho; i++){
				if(codigoChecado(codigos[i])){
					
				} else {
					if(codigos[i] == codigos[i-1]){
						repeticoesParcial += 1;
						if(repeticoesParcial > repeticoesMax){
							codigoMaisRepetido = codigos[i];
							repeticoesMax = repeticoesParcial;
						}
					} else {
						repeticoesParcial = 0;
					}
				}
			}	
			if(j != 0){
				if(codigosOrdenados[j-1] == codigoMaisRepetido){
					j = codigosOrdenados.length;
				} else {
					this.adicionarCodigo(codigoMaisRepetido, j, repeticoesMax);
					repeticoesMax = 0;
					repeticoesParcial = 0;				}
			} else{
				this.adicionarCodigo(codigoMaisRepetido, j, repeticoesMax);
				repeticoesMax = 0;
				repeticoesParcial = 0;
			}
		}
		String[][] resposta = new String[codigosOrdenados.length][3];
		int controle = 0;
		for (int i = 0; i < this.codigosOrdenados.length; i++){
			if(this.codigosOrdenados[i] == 0){
				break;
			} else {
				System.out.println("Entrou aqui /////////////////////////////////////// fsdfsdfs/f//////////////////");
				resposta[controle][0] = this.codigosOrdenados[i] + ""; //Código do Bairro
				resposta[controle][1] = this.chamadosBairros[i] + "";  //Número de chamados em 2013
				resposta[controle][2] = ManipularChamados.localizarBairro(this.codigosOrdenados[i]); //Nome do Bairro
				controle += 1;
			}
		}
		System.out.println(resposta);
		ManipularRanking.salvarRanking(resposta);
		this.rankingBairros = resposta;
	}
	

	private boolean codigoChecado(int codigo){
		for(int i = 0; i < this.codigosOrdenados.length; i++){
			if(this.codigosOrdenados[i] == codigo){
				return true;
			}
		}
		return false;
	}
	
	private void adicionarCodigo(int codigo, int index, int numeroChamados){
		this.codigosOrdenados[index] = codigo;
		this.chamadosBairros[index] = numeroChamados;
	}
	
	/*public String chamdosBairro(String nomeBairro){
		String resposta = "";
		List<Samu2013> chamados = ManipularChamados.chamadosBairro(nomeBairro);
		System.out.println("Chamados realizados em 2013 pelo bairro " + nomeBairro + " para o SAMU");
		for(int i = 0; i < chamados.size(); i++){
			resposta += "Número da Solicitação: " + chamados.get(i).getId().getSolicitacaoNumero() + "\n";
			resposta += "Data do Chamado: " + chamados.get(i).getId().getSolicitacaoData() + "\n";
			resposta += "Origem do Chamado: " + chamados.get(i).getId().getOrigemchamadoDescricao() + "\n";
			resposta += "Situação Atual do Atendimento: " + chamados.get(i).getId().getSituacaosolicitacaoDescricao() + "\n" + "\n";
			
		}
		return resposta;
	}*/
	
	public void unidadesBairro(String nomeBairro){
		this.academiasBairro = ManipularUnidadesSaude.getAcademias(nomeBairro);
		this.ceos = ManipularUnidadesSaude.getCeo(nomeBairro);
		this.farmacias = ManipularUnidadesSaude.getFarmacias(nomeBairro);
		this.hospitais = ManipularUnidadesSaude.getHospitais(nomeBairro);
		this.nasf = ManipularUnidadesSaude.getNasf(nomeBairro);
		this.policlinicas = ManipularUnidadesSaude.getPoliclinicas(nomeBairro);
		this.sadt = ManipularUnidadesSaude.getSadt(nomeBairro);
		this.caps = ManipularUnidadesSaude.getCaps(nomeBairro);
		this.spa = ManipularUnidadesSaude.getSpa(nomeBairro);
		this.ubs = ManipularUnidadesSaude.getUbs(nomeBairro);
		this.usf = ManipularUnidadesSaude.getUsf(nomeBairro);
	}
		
	public void ias(String nomeBairro){
		unidadesBairro(nomeBairro);
		this.rankingBairros = ManipularRanking.getRanking();
		
		int posicao = 0;
		for(int i = 0; i < this.rankingBairros.length; i++){
			if(this.rankingBairros[i][2] == nomeBairro){
				posicao = i;
				break;
			}
		}
		
		int parcialAcademias = this.academiasBairro.size();
		int parcialCeos = this.ceos.size();
		int parcialfarmacias = this.farmacias.size();
		int parcialhospitais = this.hospitais.size();
		int parcialnasf = this.nasf.size();
		int parcialpoliclinicas = this.policlinicas.size();
		int parcialsadt = this.sadt.size();
		int parcialCaps = this.caps.size();
		int parcialspa = this.spa.size();
		int parcialubs = this.ubs.size();
		int parcialusf = this.usf.size();
		
		int[] valores = new int[this.pesosIas.length];
		valores[0] = posicao;
		valores[1] = parcialAcademias;
		valores[2] = parcialCeos;
		valores[3] = parcialfarmacias;
		valores[4] = parcialhospitais;
		valores[5] = parcialnasf;
		valores[6] = parcialpoliclinicas;
		valores[7] = parcialsadt;
		valores[8] = parcialCaps;
		valores[9] = parcialspa;
		valores[10] = parcialubs;
		valores[11] = parcialusf;
		
		double somaParciais = 0;
		for(int i = 0; i < valores.length; i++){
			if(valores[i] > 0){
				somaParciais += 10 * this.pesosIas[i];
			}
		}
		
		double somaPesos = 0;
		for(int i = 0; i < valores.length; i++){
			somaPesos += this.pesosIas[i];
		}
		
		this.ias = somaParciais/somaPesos;
		
		System.out.println(somaParciais);
		System.out.println(somaPesos);
		
	}
	

	// GETS E SETS dos Attributos
	
	
	public String[][] getRankingBairros() {
		return rankingBairros;
	}

	public void setRankingBairros(String[][] rankingBairros) {
		this.rankingBairros = rankingBairros;
	}

	public List<AcademiasDaCidade> getAcademiasBairro() {
		return academiasBairro;
	}

	public void setAcademiasBairro(List<AcademiasDaCidade> academiasBairro) {
		this.academiasBairro = academiasBairro;
	}

	public List<CentrosEspecialidadesOdontologicas> getCeos() {
		return ceos;
	}

	public void setCeos(List<CentrosEspecialidadesOdontologicas> ceos) {
		this.ceos = ceos;
	}

	public List<FarmaciasDaFamilia> getFarmacias() {
		return farmacias;
	}

	public void setFarmacias(List<FarmaciasDaFamilia> farmacias) {
		this.farmacias = farmacias;
	}

	public List<Hospitais2013> getHospitais() {
		return hospitais;
	}

	public void setHospitais(List<Hospitais2013> hospitais) {
		this.hospitais = hospitais;
	}

	public List<Nasf> getNasf() {
		return nasf;
	}

	public void setNasf(List<Nasf> nasf) {
		this.nasf = nasf;
	}

	public List<Policlinicas> getPoliclinicas() {
		return policlinicas;
	}

	public void setPoliclinicas(List<Policlinicas> policlinicas) {
		this.policlinicas = policlinicas;
	}

	public List<Sadt> getSadt() {
		return sadt;
	}

	public void setSadt(List<Sadt> sadt) {
		this.sadt = sadt;
	}

	public List<SaudeMental> getCaps() {
		return caps;
	}

	public void setCaps(List<SaudeMental> caps) {
		this.caps = caps;
	}

	public List<Spa> getSpa() {
		return spa;
	}

	public void setSpa(List<Spa> spa) {
		this.spa = spa;
	}

	public List<Ubs> getUbs() {
		return ubs;
	}

	public void setUbs(List<Ubs> ubs) {
		this.ubs = ubs;
	}

	public List<Usf> getUsf() {
		return usf;
	}

	public void setUsf(List<Usf> usf) {
		this.usf = usf;
	}

	public double getIas() {
		return ias;
	}

	public void setIas(double ias) {
		this.ias = ias;
	}


}
