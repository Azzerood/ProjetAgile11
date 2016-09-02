package Draggenda;

import java.util.Scanner;

public class MenuLog {
		
	String nom;
	String motdepasse;
	Scanner sc= new Scanner(System.in);
	public MenuLog(){
		
	}
	
	public String SaisirNom(){
		System.out.println("Veuillez saisir votre nom d'utilisateur");
		nom=sc.nextLine();
		return nom;
	}
	public String SaisirMdp(){
		System.out.println("Veuillez saisir votre mot de passe");
		motdepasse=sc.nextLine();
		return motdepasse;
	}
	public void LancerMenuLog(){
		SaisirNom();
		SaisirMdp();
	}
}
