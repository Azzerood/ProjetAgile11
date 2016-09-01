package Draggenda;

import java.util.Scanner;

public class MenuCreationEvent {
	Scanner sc=new Scanner(System.in);
	public MenuCreationEvent(){
		
	}
	public String SaisirNom(){
		String reponse=sc.nextLine();
		return reponse;
	}
	public String SaisirDescription(){
		String reponse=sc.nextLine();
		return reponse;
	}
	public String SaisirJour(){
		
		String reponse=sc.nextLine();
		return reponse;
	}
	public int VerifJour(String day){
		int rep=-1;
		if(day.matches("[0-9][0-9]")|| day.matches("[0-9]")){
			rep=Integer.parseInt(day);
		}
		return rep;
	}
	public String SaisirMois(){
		
		String reponse=sc.nextLine();
		return reponse;
	}
	public int VerifMois(String month){
		int rep=-1;
		if(month.matches("[0-9][0-9]") || month.matches("[0-9]")){
			rep=Integer.parseInt(month);
		}
		return rep;
	}
	public String SaisirAnnee(){
		
		String reponse=sc.nextLine();
		return reponse;
	}
	public int VerifAnnee(String year){
		int rep=-1;
		if(year.matches("[0-9][0-9][0-9][0-9]")){
			rep=Integer.parseInt(year);
		}
		return rep;
	}
	public int saisieJour(){
		int jour;
		do{
			String j=SaisirJour();
			jour=VerifJour(j);
			
			}while(jour<0 || jour>31);
		return jour;
	}
	public int saisieMois(){
		int mois;
		do{
			String m=SaisirMois();
			mois=VerifMois(m);
			}while(mois<0 || mois>12);
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
		boolean DateFinIncorrect=false;
		System.out.println("Veuillez saisir le nom de votre évènement");
		String nom=SaisirNom();
		System.out.println("Veuillez saisir la description de votre évènement");
		String description=SaisirDescription();
		
		Date dateDebut = SaisirDateDebutEvent();
		Heure heureDebut = SaisirHeureDebutEvent();
		Date dateFin;
		Heure heureFin;
		do{
			dateFin = saisirDateFinEvent(dateDebut);
		}while(dateDebut.compareTo(dateFin) == -1);
		do{
			heureFin = SaisirHeureFinEvent(dateDebut, heureDebut, dateFin);
		}while( (dateDebut.compareTo(dateFin) == 0) && (heureDebut.compareHeure(heureFin) == 1)  );
		event= new Evenement(nom, description , dateDebut, dateFin, heureDebut, heureFin , null, true);
		return event;
	}
	public Heure SaisirHeureDebutEvent() {
		System.out.println("Veuillez saisir l'heure de début de votre évènement (nombre)");
		int heure = saisieHeure();
		System.out.println("Veuillez saisir la minute de début de votre évènement (nombre)");
		int minute = saisieMinute();
		Heure heureDebut= new Heure(heure,minute);
		return heureDebut;
	}
	public Heure SaisirHeureFinEvent(Date dateDebut, Heure heureDebut, Date dateFin) {
		int heure;
		int minute;
		Heure heureFin;
		
			System.out.println("Veuillez saisir l'heure de fin de votre évènement (nombre)");
			heure = saisieHeure();
			System.out.println("Veuillez saisir la minute de fin de votre évènement (nombre)");
			minute = saisieMinute();
		
			heureFin = new Heure(heure, minute);
		return heureFin;
	}
	public Date saisirDateFinEvent(Date dateDebut) {
		int jour;
		int mois;
		int annee;
		Date dateFin;
		
			System.out.println("Veuillez saisir le jour de fin de votre évènement (nombre)");
		jour=saisieJour();
		System.out.println("Veuillez saisir le mois de fin de votre évènement (nombre)");
		mois = saisieMois();
		System.out.println("Veuillez saisir l'année de fin de votre évènement (nombre)");
		annee = saisieAnnee();
		
		dateFin = new Date(jour,mois,annee) ;
		return dateFin;
	}
	public Date SaisirDateDebutEvent() {
		System.out.println("Veuillez saisir le jour de début de votre évènement (nombre)");
		int jour=saisieJour();
		System.out.println("Veuillez saisir le mois de début de votre évènement (nombre)");
		int mois = saisieMois();
		System.out.println("Veuillez saisir l'année de début de votre évènement (nombre)");
		int annee = saisieAnnee();
	
		Date dateDebut=new Date (jour,mois,annee);
		return dateDebut;
	}
	public String SaisirHeure(){
		
		String reponse=sc.nextLine();
		return reponse;
		
	}
	public String SaisirMinute(){
	
		String reponse=sc.nextLine();
		return reponse;
	}
	
	public int VerifHeure(String hour){
		int rep=-1;
		if(hour.matches("[0-9][0-9]")){
			rep=Integer.parseInt(hour);
		}
		return rep;
		//String reponse1;
		//reponse1=SaisirHeure()+":"+SaisirMinute();
	}
	public int VerifMinute(String min){
		int rep=-1;
		if(min.matches("[0-9][0-9]")){
			rep=Integer.parseInt(min);
		}
		return rep;
	}

	
}
