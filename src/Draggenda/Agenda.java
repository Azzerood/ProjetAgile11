package Draggenda;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Evenement> calendrier = new ArrayList<>();

	public void afficher() {
		if (calendrier.isEmpty())
			System.out.println("Votre agenda est vide. Pensez à créer des evenements ;)");
		else {
			System.out.println("===============Mon Agenda===============");
			for (Evenement e : calendrier) {
				System.out.println("----------------------------------------");
				System.out.println(e.toStringresum());
				System.out.println("----------------------------------------");
			}
			System.out.println("===============Fin Agenda===============");
		}
	}

	public void ajouterEvenement(Evenement e) {
		calendrier.add(e);
		this.trierCalendrier(e);
	}

	public void trierCalendrier(Evenement e) {
		int i = 0;
		while (e.getDateDepart().compareTo(calendrier.get(i).getDateDepart()) == -1) {
			i++;
		}
		if (e.getDateDepart().compareTo(calendrier.get(i).getDateDepart()) == 1) {
			calendrier.add(i, e);
		} else {
			while (e.getHeureDepart().compareHeure(calendrier.get(i).getHeureDepart()) == -1) {
				i++;
			}
			calendrier.add(i, e);
		}
	}

	public ArrayList<Evenement> rechercherDateDebut(Date d) {
		ArrayList<Evenement> result = new ArrayList<>();

		for (Evenement e : calendrier) {
			if (e.getDateDepart() == d)
				result.add(e);
		}
		return result;

	}

	public ArrayList<Evenement> rechercherNom(String nom) {
		ArrayList<Evenement> result = new ArrayList<>();

		for (Evenement e : calendrier) {
			if (e.getNom().equals(nom))
				result.add(e);
		}
		return result;
	}

	public void supprimerEvent(Evenement e) {
		calendrier.remove(e);
	}
}
