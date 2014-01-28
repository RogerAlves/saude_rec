package saude_rec;

import business.Principal;

public class TesteComunicacao {
	public static void main(String[] args) {
		Principal teste = new Principal();
		int controle = 0;
		teste.rankingBairros();
		/*String[][] ranking = teste.getRankingBairros();
		String resposta = "";*/
		/*for(int i = 0; i < ranking.length; i++){
			if(ranking[i][0] == null){
				break;
			} else{
				resposta += "Posição: " + (controle + 1) + "\n" +
						"Código: " + ranking[i][0] + "\n" +
						"Nome do Bairro: " + ranking[i][2] + "\n" +
						"Número de Chamados: " + ranking[i][1] + "\n" + "\n";
				controle += 1;
			}
		}
		System.out.println(resposta);*/
		
	}

} 
