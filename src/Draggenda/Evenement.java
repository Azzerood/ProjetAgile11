package Draggenda;

import java.util.ArrayList;

public class Evenement {


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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<String> getParticipants() {
		return participants;
	}

	public void setParticipants(ArrayList<String> participants) {
		this.participants = participants;
	}

	public boolean isPubli() {
		return publi;
	}

	public void setPubli(boolean publi) {
		this.publi = publi;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public void setHeureDepart(Heure heureDepart) {
		this.heureDepart = heureDepart;
	}

	public void setHeureFin(Heure heureFin) {
		this.heureFin = heureFin;
	}

	

}
