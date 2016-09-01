package Draggenda;

import java.io.PrintWriter;

public class Save {

	String utilisateur;
	String mdp;
	
	public Save(String utilisateur,String mdp){
		this.utilisateur=utilisateur;
		this.mdp=mdp;
		try{
		PrintWriter save1 = new PrintWriter(utilisateur+".csv");
		save1.write(utilisateur+" "+mdp);
		save1.close();
		}catch(Exception e){
			System.out.println("Erreur");
		}
	}
	
}