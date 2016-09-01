package Draggenda;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuEvent {

	Scanner sc;

	public MenuEvent() {
		sc = new Scanner(System.in);
	}

	public String SearchByEvent(Agenda agenda) {
		String s = "";
		System.out.println("Saisir l'évenement à rechercher");
		String rep = sc.nextLine();
		for (Evenement e : agenda.rechercherNom(rep)) {
			s += e;
		}
		return s;
	}

	public String SearchByDateDepart(Agenda agenda) {
		String s = "";
		System.out.println("Saisir la date voulu sour le format JJ/MM/AAAA");
		System.out.println("Ne pas écrire les zéros inutils");
		System.out.println("Saisir le jour");
		int jour = sc.nextInt();
		System.out.println("Saisir le mois");
		int mois = sc.nextInt();
		System.out.println("Saisir le annee");
		int annee = sc.nextInt();
		Date d = new Date(jour, mois, annee);
		for (Evenement e : agenda.rechercherDateDebut(d)) {
			s += e;
		}
		return s;
	}

	public void ModifEvent(Evenement e, Agenda a) {
		System.out.println("Voulez-vous modifier un Evenement ? (1=Oui)");
		int rep = sc.nextInt();
		if (rep == 1) {
			e.modifier();
			a.trierCalendrier(e);
			

		}
	}

	public void DeleteEvent(Evenement e, Agenda a) {
		System.out.println("Voulez-vous supprimer un evenement ? (1=Oui)");
		int rep = sc.nextInt();
		if (rep == 1) {
			a.supprimerEvent(e);
		}
	}
}
