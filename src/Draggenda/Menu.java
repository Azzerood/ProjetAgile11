package Draggenda;

import java.util.Scanner;

public class Menu {

	Scanner sc = new Scanner(System.in);

	public Menu() {
	}

	public void Showagenda() {
	}

	public void CreateEvent() {
	}

	public void SearchUsers() {
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

	public boolean ModifEvent() {
		System.out.println("Voulez-vous modifier un Evenement ? (1=Oui)");
		int rep = sc.nextInt();
		if (rep == 1) {
			return true;
		} else {
			return false;
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

	public String SaisieNombre() {
		String nombre;

		System.out.println("Saisissez votre nombre");
		String reponse = sc.nextLine();
		return reponse;
	}

	public int VerifNombre(String nb) {
		int nombre = -1;
		if (nb.matches("[0-9][0-9]*")) {
			nombre = Integer.parseInt(nb);
		}
		return nombre;
	}

	public void LancerAction(int nb) {
		if (nb == 1) {
			Showagenda();
		} else if (nb == 2) {
			CreateEvent();
		} else if (nb == 3) {
			SearchUsers();
		}
	}

	public void AfficherMenu() {
		System.out.println(new Menu().TexteMenu());
	}

	public void DeroulerMenu() {
		AfficherMenu();
		SaisieNombre();
	}

	public String TexteMenu() {
		return "Votre Menu d'actions\n1- Consulter votre agenda\n2- Cr�er un �v�nement\n3- Recherche d'utilisateur";
	}
}
