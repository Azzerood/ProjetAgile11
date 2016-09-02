package Draggenda;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuEvent {

	Scanner sc;

	public MenuEvent() {
		sc = new Scanner(System.in);
	}

	public String searchByEvent(Agenda agenda) {
		String s = "";
		System.out.println("Saisir l'évenement à rechercher");
		String rep = sc.nextLine();
		for (Evenement e : agenda.rechercherNom(rep)) {
			s += e;
		}
		return s;
	}

	public Evenement retourEvenement(Agenda agenda, String s) {
		for (Evenement e : agenda.getCalendrier()) {
			if (e.getNom().equals(s))
				return e;
		}
		return null;
	}

	public String searchByDateDepart(Agenda agenda) {
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

	public void modifEvent(Evenement e, Agenda a) {
		System.out.println("Voulez-vous modifier un Evenement ? (1=Oui)");
		int rep = sc.nextInt();
		if (rep == 1) {
			e.modifier();
			a.trierCalendrier(e);
		}
	}

	public void deleteEvent(Evenement e, Agenda a) {
		System.out.println("Voulez-vous supprimer un evenement ? (1=Oui)");
		int rep = sc.nextInt();
		if (rep == 1) {
			a.supprimerEvent(e);
		}
	}

	public void menuEvenement(Agenda agenda) {
		System.out.println("Que voulez-vous faire");
		System.out.println("1- Chercher un evenement par son nom");
		System.out.println("2- Chercher un evenement par sa date de depart");
		System.out.println("3- Modifier un evenement");
		System.out.println("4- Supprimer un evenement");
		int rep = sc.nextInt();
		if (rep == 1) {
			searchByEvent(agenda);
			System.out.println("" + retourEvenement(agenda, searchByEvent(agenda)).toString());
		} else if (rep == 2) {
			searchByDateDepart(agenda);
			System.out.println("" + retourEvenement(agenda, searchByDateDepart(agenda)).toString());
		} else if (rep == 3) {
			modifEvent(retourEvenement(agenda, searchByEvent(agenda)), agenda);
		} else if (rep == 4) {
			deleteEvent(retourEvenement(agenda, searchByEvent(agenda)), agenda);
		}
	}
}
