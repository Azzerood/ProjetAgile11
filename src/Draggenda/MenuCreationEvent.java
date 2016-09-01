package Draggenda;

import java.util.Scanner;

public class MenuCreationEvent {
	Scanner sc=new Scanner(System.in);
	public MenuCreationEvent(){
		
	}
	public String SaisirNom(){
		System.out.println("Veuillez saisir votre nom");
		String reponse=sc.nextLine();
		return reponse;
	}
	public String SaisirDescription(){
		System.out.println("Veuillez descrire votre événement");
		String reponse=sc.nextLine();
		return reponse;
	}
	public String SaisirJour(){
		System.out.println("Veuillez rentrer un jour");
		String reponse=sc.nextLine();
		return reponse;
	}
	public void VerifJour(){
		
	}
	public String SaisirMois(){
		System.out.println("Veuillez saisir le mois");
		String reponse=sc.nextLine();
		return reponse;
	}
	public void VerifMois(){
		
	}
	public String SaisirAnnee(){
		System.out.println("Veuillez saisir l'année");
		String reponse=sc.nextLine();
		return reponse;
	}
	public void VerifAnnee(){
		
	}
	public String SaisirHeure(){
		System.out.println("Veuillez saisir l'heure");
		String reponse=sc.nextLine();
		return reponse;
	}
	public void VerifHeure(){
		
	}
	public void VerifHeureFin(){
		
	}
}
