package Draggenda;

import java.io.Serializable;
import java.util.ArrayList;

public class Evenement implements Serializable{


	private String nom;
	private String description;
	private Date dateDepart, dateFin;
	private Heure heureDepart, heureFin;
	private ArrayList<String> participants;
	private boolean publi;
	
	public Evenement(String nom, String description, Date dateDepart, Date dateFin, Heure heureDepart, Heure heureFin, ArrayList<String> participants, boolean publi){
		this.nom=nom;
		this.description=description;
		this.dateDepart=dateDepart;
		this.dateFin=dateFin;
		this.heureDepart=heureDepart;
		this.heureFin=heureFin;
		this.participants=participants;
		this.publi=publi;
	}
	
	public Evenement(String nom, String description, Date dateDepart,Heure heureDepart, Heure heureFin, ArrayList<String> participants, boolean publi){
		this.nom=nom;
		this.description=description;
		this.dateDepart=dateDepart;
		this.dateFin=dateDepart;
		this.heureDepart=heureDepart;
		this.heureFin=heureFin;
		this.participants=participants;
		this.publi=publi;
	}
	
	public Date getDateDepart(){
		return dateDepart;
	}
	
	public Date getDateFin(){
		return dateFin;
	}
	
	public Heure getHeureDepart(){
		return heureDepart;
	}
	
	public Heure getHeureFin(){
		return heureFin;
	}
	
	public boolean getpublic(){
		return publi;
	}

	public String toString() {
		return "Nom : " + nom + "\nDescription : " + description +"\nEvenement "+(publi? "Public":"Prive")+"\nDate de Debut : " + dateDepart + "Date de Fin : " + dateFin +"\nHeureDepart : "
				+ heureDepart + "\nHeureFin : " + heureFin + "\nParticipants : " + participants + ".";
	}

	public void modifier(){
		Menu menu=new Menu();
		MenuCreationEvent menuevent=new MenuCreationEvent();
		int choix=-1;
		while(choix!=7){
			System.out.println("Que voulez vous modifier?\n1-Nom\n2-Description\n3-Visibilté\n4-Date\n5-Heure\n6-Participants\n7-Retour");
			choix=menu.VerifNombre(menu.SaisieNombre());
			while(choix<=0|| choix >7){
				System.out.println("Choix incorrect");
				choix=menu.VerifNombre(menu.SaisieNombre());
			}
			if(choix == 1){
				System.out.println("Nom?");
				this.nom=menu.SaisieNombre();
			}else if (choix ==2){
				System.out.println("Descrition?");
				this.description=menu.SaisieNombre();
			}else if(choix==3){
				publi=!publi;
			}else if(choix==4){
				dateDepart=menuevent.SaisirDateDebutEvent();
				dateFin=menuevent.saisirDateFinEvent(dateDepart);
			}else if(choix==5){
				heureDepart=menuevent.SaisirHeureDebutEvent();
				heureFin=menuevent.SaisirHeureFinEvent(dateDepart, heureDepart, dateFin);
			}
		}
	}

	public String toStringresum(){
		return nom+" le "+dateDepart+(dateDepart.compareTo(dateFin)==0? "":""+dateFin)+"à "+heureDepart+" jusque "+heureFin+" ";
	}

	public String getNom() {
		return nom;
	}
}
