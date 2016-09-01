package Draggenda;

import java.util.Scanner;

public class MenuEvent {

	Scanner sc;

	public MenuEvent() {
		sc = new Scanner(System.in);
	}
	
	public String SearchByEvent() {
		System.out.println("Saisir l'évenement à rechercher");
		String rep = sc.nextLine();
		return rep;
	}

	public Date SearchByDateDepart() {
		System.out.println("Saisir la date voulu sour le format JJ/MM/AAAA");
		System.out.println("Ne pas écrire les zéros inutils");
		System.out.println("Saisir le jour");
		int jour = sc.nextInt();
		System.out.println("Saisir le mois");
		int mois = sc.nextInt();
		System.out.println("Saisir le annee");
		int annee = sc.nextInt();
		return new Date(jour, mois, annee);
	}

	public void ModifEvent(Evenement e) {
		System.out.println("Voulez-vous modifier un Evenement ? (1=Oui)");
		int rep = sc.nextInt();
		if (rep == 1) {
			e.modifier();
			
		}
	}

	public boolean DeleteEvent() {
		System.out.println("Voulez-vous supprimer un evenement ? (1=Oui)");
		int rep = sc.nextInt();
		if (rep == 1) {
			return true;
		} else {
			return false;
		}
	}
}
