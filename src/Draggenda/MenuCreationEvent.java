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
		System.out.println("Veuillez descrire votre �v�nement");
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
		if(day.matches("[0-31]")){
			rep=Integer.parseInt(day);
		}
		return rep;
	}
	public String SaisirMois(){
		System.out.println("Veuillez saisir le mois");
		String reponse=sc.nextLine();
		return reponse;
	}
	public int VerifMois(String month){
		int rep=-1;
		if(month.matches("[0-12]")){
			rep=Integer.parseInt(month);
		}
		return rep;
	}
	public String SaisirAnnee(){
		System.out.println("Veuillez saisir l'ann�e");
		String reponse=sc.nextLine();
		return reponse;
	}
	public int VerifAnnee(String year){
		int rep=-1;
		if(year.matches("[0-9999]")){
			rep=Integer.parseInt(year);
		}
		return rep;
	}
	public Evenement CreeEvent(){
		String nom=SaisirNom();
		String descriptino=SaisirDescription();
		String jour=SaisirJour();
		String mois=SaisirMois();
		String annee=SaisirAnnee();
		String heure=SaisirHeure();
		String minute=SaisirMinute();
		
	}
	public String SaisirHeure(){
		System.out.println("Veuillez saisir l'heure");
		String reponse=sc.nextLine();
		return reponse;
		
	}
	public String SaisirMinute(){
		System.out.println("Veuillez choisir les minutes");
		String reponse=sc.nextLine();
		return reponse;
	}
	
	public int VerifHeure(String hour){
		int rep=-1;
		if(hour.matches("[0-24]")){
			rep=Integer.parseInt(hour);
		}
		return rep;
		//String reponse1;
		//reponse1=SaisirHeure()+":"+SaisirMinute();
	}
	public int VerifMinute(String min){
		int rep=-1;
		if(min.matches("[0-60]")){
			rep=Integer.parseInt(min);
		}
		return rep;
	}

	public void VerifHeureFin(Heure debut, Heure fin){
		
	}
	public void VerifHeureFin(){

		
	}
}
