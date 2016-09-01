package Draggenda;

import java.util.ArrayList;

public class Agenda {

	private ArrayList<Evenement> calendrier = new ArrayList<>();

	public void afficher() {
		if (calendrier.isEmpty())
			System.out.println("Votre agenda est vide. Pensez à créer des evenements ;)");
		else {
			//this.trierCalendrier();
			for (Evenement e : calendrier) {
				System.out.println(e.toStringresum());
			}
		}
	}

	public void ajouterEvenement(Evenement e) {calendrier.add(e);}
	
	public void trierCalendrier(Evenement e){
		int i=0;
		while(e.getDateDepart().compareTo(calendrier.get(i).getDateDepart())==-1){
			i++;
		}
		if(e.getDateDepart().compareTo(calendrier.get(i).getDateDepart())==1){
			calendrier.add(i,e);
		}else{
			while(e.getHeureDepart().compareHeure(calendrier.get(i).getHeureDepart())==-1){
				i++;
			}
				calendrier.add(i,e);
		}
	}
}
