package business;

import java.util.Arrays;
import java.util.List;

import model.Samu2011;
import data.ManipulateCalled;

public class Main {
	
	private int codigosOrdenados[] = new int[ManipulateCalled.quantidadeBairros()];
	private int chamadosBairros[] = new int[ManipulateCalled.quantidadeBairros()];
	
	public String ordenarChamadosBairros(){
		List<Samu2011> solicitacoes = ManipulateCalled.getCalled();
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
		
		System.out.println("RANKING DE CHAMADOS AO SAMU EM 2011" + "\n" + "-------------");
		
		String resposta = "";
		for (int i = 0; i < this.codigosOrdenados.length; i++){
			if(this.codigosOrdenados[i] == 0){
				break;
			} else {
				resposta += "Bairro: " + this.codigosOrdenados[i] + "\n";
				resposta += "Número de Chamados em 2011: " + this.chamadosBairros[i] + "\n";
				resposta += ManipulateCalled.localizarBairro(this.codigosOrdenados[i]) + "\n" + "\n";
			}
		}
		return resposta;
		
	}
	
	public boolean codigoChecado(int codigo){
		for(int i = 0; i < this.codigosOrdenados.length; i++){
			if(this.codigosOrdenados[i] == codigo){
				return true;
			}
		}
		return false;
	}
	
	public void adicionarCodigo(int codigo, int index, int numeroChamados){
		this.codigosOrdenados[index] = codigo;
		this.chamadosBairros[index] = numeroChamados;
	}
	
	public String chamdosBairro(String nomeBairro){
		String resposta = "";
		List<Samu2011> chamados = ManipulateCalled.chamadosBairro(nomeBairro);
		System.out.println("Chamados realizados em 2011 pelo bairro " + nomeBairro + " para o SAMU");
		for(int i = 0; i < chamados.size(); i++){
			resposta += "Número da Solicitação: " + chamados.get(i).getId().getSolicitacaoNumero() + "\n";
			resposta += "Data do Chamado: " + chamados.get(i).getId().getSolicitacaoData() + "\n";
			resposta += "Origem do Chamado: " + chamados.get(i).getId().getOrigemchamadoDescricao() + "\n";
			resposta += "Situação Atual do Atendimento: " + chamados.get(i).getId().getSituacaosolicitacaoDescricao() + "\n" + "\n";
			
		}
		return resposta;
	}

}
