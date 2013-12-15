package business;

import java.util.Arrays;
import java.util.List;

import model.Samu2011;
import data.ManipulateCalled;

public class Main {
	
	private int codigosOrdenados[] = new int[ManipulateCalled.quantidadeBairros()];
	
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
		
		for(int j = 0; j < codigosOrdenados.length; j++){
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
			this.codigosOrdenados[j] = codigoMaisRepetido;
			repeticoesMax = 0;
			repeticoesParcial = 0;
		}
		
		System.out.println("RANKING DE CHAMADOS AO SAMU EM 2011" + "\n" + "-------------");
		
		String resposta = "";
		for (int i = 0; i < this.codigosOrdenados.length; i++){
			 resposta += "Bairro: " + this.codigosOrdenados[i] + "\n";
			 resposta += ManipulateCalled.localizarBairro(this.codigosOrdenados[i]) + "\n" + "\n";
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

}
