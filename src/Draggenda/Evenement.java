package Draggenda;

import java.util.ArrayList;

public class Evenement {


	private String nom;
	private String description;
	private Date dateDepart, dateFin;
	private Heure heureDepart, heureFin;
	private ArrayList<String> participants;
	
	public Evenement(String nom, String description, Date dateDepart, Date dateFin, Heure heureDepart, Heure heureFin, ArrayList<String> participants){
		this.nom=nom;
		this.description=description;
		this.dateDepart=dateDepart;
		this.dateFin=dateFin;
		this.heureDepart=heureDepart;
		this.heureFin=heureFin;
		this.participants=participants;
	}
	
	public Date getDateDepart(){
		return dateDepart;
	}
	
	public Date getDateFin(){
		return dateFin;
	}

	public String toString() {
		return "Nom : " + nom + "\nDescription : " + description + "\nDate de Debut : " + dateDepart + "Date de Fin : " + dateFin +"\nHeureDepart : "
				+ heureDepart + "\nHeureFin : " + heureFin + "\nParticipants : " + participants + ".";
	}

	

}
