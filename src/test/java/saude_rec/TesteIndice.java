package saude_rec;

import business.Principal;

public class TesteIndice {
	public static void main(String[] args) {
		Principal principal = new Principal();
		
		principal.ias("SANTO AMARO");
		System.out.println(principal.getIas());
		
	}

}
