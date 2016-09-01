package Draggenda;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Evenement> calendrier = new ArrayList<>();

	public void afficher() {
		if (calendrier.isEmpty())
			System.out.println("Votre agenda est vide. Pensez à créer des evenements ;)");
		else
			for (Evenement e : calendrier) {
				System.out.println(e.toString());
			}
	}

	public void ajouterEvenement(Evenement e) {
		if (calendrier.isEmpty())
			calendrier.add(e);

		else {
			int cpt = 1;
			for (Evenement e1 : calendrier) {
				if (e1.getDateDepart().compareTo(e.getDateDepart()) == 1
						|| (e1.getDateDepart().compareTo(e.getDateDepart()) == 0
								&& e1.getHeureDepart().compareHeure(e.getHeureDepart()) == 1))
					calendrier.add(cpt, e);

				cpt++;
			}
		}
	}
}
