package Draggenda;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Evenement> calendrier = new ArrayList<>();

	public void afficher() {
		for (Evenement e : calendrier) {
			System.out.println(e.toString());
		}
	}

	public void ajouterEvenement(Evenement e) {
		if (calendrier.isEmpty())
			calendrier.add(e);
		
		else {
			for (Evenement e1 : calendrier) {
				if(e1.estAvant(e))
				System.out.println(e1.toString());
			}
		}
	}
}
