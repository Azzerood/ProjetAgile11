package Draggenda;

import java.util.ArrayList;

public class Evenement {


	private String nom;
	private String description;
	private Date date;
	private Heure heureDepart, heureFin;
	private ArrayList<String> participants;
	
	public Evenement(String nom, String description, Date date, Heure heureDepart, Heure heureFin, ArrayList<String> participants){
		this.nom=nom;
		this.description=description;
		this.date=date;
		this.heureDepart=heureDepart;
		this.heureFin=heureFin;
		this.participants=participants;
	}
	
	public Date getDate(){
		return date;
	}

	public String toString() {
		return "Nom : " + nom + "\nDescription : " + description + "\nDate : " + date + "\nHeureDepart : "
				+ heureDepart + "\nHeureFin : " + heureFin + "\nParticipants : " + participants + ".";
	}

	

}
