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
		System.out.println("Veuillez saisir l'année");
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
	public int saisieJour(){
		int jour;
		do{
			String j=SaisirJour();
			jour=VerifJour(j);
			
			}while(jour<0 || jour>32);
		return jour;
	}
	public int saisieMois(){
		int mois;
		do{
			String m=SaisirMois();
			mois=VerifMois(m);
			}while(mois<0 || mois>11);
		return mois;
	}
	public int saisieAnnee(){
		int annee;
		do{
			String a=SaisirAnnee();
			annee=VerifAnnee(a);
			}while(annee<2016 || annee>9999);
		return annee;
	}
	public int saisieHeure(){
		int heure;
		do{
			String h=SaisirHeure();
			heure=VerifHeure(h);
		}while(heure<0 || heure > 24);
		return heure;
	}
	public int saisieMinute(){
		int minute;
		do{
			String m=SaisirMinute();
			minute=VerifMinute(m);
		}while(minute<0 || minute >60);
		return minute;
	}
	
	public Evenement CreeEvent(){
		Evenement event;
		String nom=SaisirNom();
		String description=SaisirDescription();
		
		int jour = saisieJour();
		int mois = saisieMois();
		int annee = saisieAnnee();
	
		Date dateDebut=new Date (jour,mois,annee);
		int heure = saisieHeure();
		int minute = saisieMinute();
		Heure heureDebut= new Heure(heure,minute);
		Date dateFin;
		Heure heureFin;
		
			do{
			jour=saisieJour();
			mois = saisieMois();
			annee = saisieAnnee();
			}while(dateDebut.compareTo(new Date(jour,mois,annee)) == 1);
			dateFin = new Date(jour,mois,annee) ;
			do{
				 heure = saisieHeure();
				 minute = saisieMinute();
			}while(heureDebut.compareHeure(new Heure(heure,minute)) == 1);
		heureFin = new Heure(heure, minute);
	
		event= new Evenement(nom, description , dateDebut, dateFin, heureDebut, heureFin , null, true);
		return event;
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
