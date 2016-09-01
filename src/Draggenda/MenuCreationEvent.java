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
		if(rep >= 1 && rep <= 31 ){
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
		if(rep >= 0 && rep <= 12 ){
			rep=Integer.parseInt(month);
		}
		return rep;
	}
	public String SaisirAnnee(){
		System.out.println("Veuillez saisir l'année");
		String reponse=sc.nextLine();
		return reponse;
	}
	public int VerifAnnee(String year){
		int rep=-1;
		if(rep >=0 && rep <= 9999){
			rep=Integer.parseInt(year);
		}
		return rep;
	}
	public String SaisirMinute(){
		System.out.println("Veuillez saisir les minutes");
		String reponse=sc.nextLine();
		return reponse;
	}
	public int VerifMinute(String min){
		int rep=-1;
		if(rep >= 0 && rep <= 60){
			rep=Integer.parseInt(min);
		}
		return rep;
	}
	public int VerifDateFin(Date debut,Date fin){
		
	}
	public String SaisirHeure(){
		System.out.println("Veuillez saisir l'heure");
		String reponse=sc.nextLine();
		return reponse;
		
	}
	public void VerifHeure(String hour){
		String reponse1;
		reponse1=SaisirHeure()+":"+SaisirMinute();
	}
	public void VerifHeureFin(int finalhour){
		
	}
}
