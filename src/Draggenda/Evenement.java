package Draggenda;

import java.util.ArrayList;

public class Evenement {


	private String nom;
	private String description;
	private String date;
	private String heureDepart, heureFin;
	private ArrayList<String> participants;
	
	public Evenement(String nom, String description, String date, String heureDepart, String heureFin, ArrayList<String> participants){
		this.nom=nom;
		this.description=description;
		this.date=date;
		this.heureDepart=heureDepart;
		this.heureFin=heureFin;
		this.participants=participants;
	}
	
	public String getDate(){
		return date;
	}

	public String toString() {
		return "Nom : " + nom + "\nDescription : " + description + "\nDate : " + date + "\nHeureDepart : "
				+ heureDepart + "\nHeureFin : " + heureFin + "\nParticipants : " + participants + ".";
	}

	

}
