package saude_rec;

import data.ManipularRanking;

public class TesteRanking {
	public static void main(String[] args) {
		String[][] teste = new String[1][3];
		teste[0][0] = "0001";
		teste[0][1] = "0001";
		teste[0][2] = "0001";
		
		ManipularRanking.salvarRanking(teste);
	}

}
