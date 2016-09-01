package Draggenda;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Evenement> calendrier = new ArrayList<>();

	public void afficher() {
		if (calendrier.isEmpty())
			System.out.println("Votre agenda est vide. Pensez à créer des evenements ;)");
		else {
			this.trierCalendrier();
			for (Evenement e : calendrier) {
				System.out.println(e.toString());
			}
		}
	}

	public void ajouterEvenement(Evenement e) {
		calendrier.add(e);
	}

	public void trierCalendrier() {

	}

	public ArrayList<Evenement> rechercheDateDepart(Date d) {
		ArrayList<Evenement> result = new ArrayList<>();

		for (Evenement e : calendrier) {
			if (e.getDateDepart() == d)
				result.add(e);
		}
		return result;
	}
	
	public ArrayList<Evenement> rechercheNom(String nom) {
		ArrayList<Evenement> result = new ArrayList<>();

		for (Evenement e : calendrier) {
			if (e.getNom().equals(nom))
				result.add(e);
		}
		return result;
	}
	
	
}
