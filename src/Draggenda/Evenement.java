package Draggenda;

import java.util.ArrayList;

public class Evenement {


	private String nom;
	private String description;
	private Date dateDepart, dateFin;
	private Heure heureDepart, heureFin;
	private ArrayList<String> participants;
	private boolean publi;
	private Menu menu;
	
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

	public void affichage(){
		menu=new Menu();
		System.out.println(this.toString());
		System.out.println("Que voulez-vous faire?\n1-Modifier cet evenement\n2-Supprimer cet evenement\n3-Retour");
		int choix=menu.VerifNombre(menu.SaisieNombre());
		while(choix<=0|| choix >3){
			System.out.println("Choix incorrect");
			choix=menu.VerifNombre(menu.SaisieNombre());
		}
		if(choix == 1){
			modifier();
		}
	}

	public void modifier(){
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
			}
		}
	}

	public String toStringresum(){
		return dateDepart+(dateDepart.compareTo(dateFin)==0? " ":" "+dateFin)+" "+heureDepart+" "+heureFin+" "+nom;
	}

}
