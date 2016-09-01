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
	public int VerifJour(String day){
		int rep=-1;
		if(day.matches("") && rep <= 31 ){
			rep=Integer.parseInt(day);
		}
		return rep;
	}
	public String SaisirMois(){
		System.out.println("Veuillez saisir le mois");
		String reponse=sc.nextLine();
		return reponse;
	}
	public void VerifMois(String month){
		
	}
	public String SaisirAnnee(){
		System.out.println("Veuillez saisir l'année");
		String reponse=sc.nextLine();
		return reponse;
	}
	public void VerifAnnee(){
		
	}
	public Evenement CreeEvent(){
		String nom=SaisirNom();
		String descriptino=SaisirDescription();
		int jour=SaisirJour();
		
		
	}
	public String SaisirHeure(){
		System.out.println("Veuillez saisir l'heure");
		String reponse=sc.nextLine();
		return reponse;
		
	}
<<<<<<< HEAD
	public void VerifHeure(String hour){
		int rep=-1;
		if(rep >= 0 && rep <= 12){
			rep=Integer.parseInt(hour);
		}
		String reponse1;
		reponse1=SaisirHeure()+":"+SaisirMinute();
=======
	public void VerifHeure(){
>>>>>>> branch 'master' of https://github.com/Azzerood/ProjetAgile11.git
		
	}
<<<<<<< HEAD
	public void VerifHeureFin(Heure debut, Heure fin){
=======
	public void VerifHeureFin(){
>>>>>>> branch 'master' of https://github.com/Azzerood/ProjetAgile11.git
		
	}
}
