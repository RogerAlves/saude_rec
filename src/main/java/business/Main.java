package business;

import java.util.List;

import model.Bairros2013;
import model.Distritos2013;
import model.Remocoes2013;
import model.Solicitacoes2011;
import model.Solicitacoes2012;
import model.Solicitacoes2013;
import data.ManipulateCalled;

public class Main {
	public String ordenarChamadosBairros(){
		List<Solicitacoes2011> solicitacoes = ManipulateCalled.getCalled();
		String resposta = "";
		System.out.println(solicitacoes.size());
		for(Solicitacoes2011 solicitacao : solicitacoes){
			resposta += solicitacao.getId().getDataConclusao() + "\n";
		}
		return resposta;
	}

}
