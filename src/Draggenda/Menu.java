package Draggenda;

import java.util.Scanner;

public class Menu {

	Scanner sc = new Scanner(System.in);
	Agenda agenda;
	
	public Menu() {
	}

	public Menu(Agenda agenda) {
	this.agenda = agenda;
	}
	public void Showagenda( Agenda agenda) {
		agenda.afficher();
	}

	public Evenement CreateEvent() {
		Evenement event= new MenuCreationEvent().CreeEvent();
		System.out.println("L'évènement "+event.getNom()+" a été crée à la date "+event.getDateDepart()+" à "+event.getHeureDepart()+" et finira le "+event.getDateFin()+" à "+event.getHeureFin());
		return event;
	}

	public void SearchUsers() {
	}

	public String SaisieNombre() {
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

	public void LancerAction(int nb, Agenda agenda) {
		if (nb == 1) {
			Showagenda(agenda);
		} else if (nb == 2) {
			CreateEvent();
		} else if (nb >2) {
			
		}
	}

	public void AfficherMenu() {
		System.out.println(new Menu().TexteMenu());
	}

	public void DeroulerMenu() {
		int choix ;
		do{
			AfficherMenu();
			String rep=SaisieNombre();
			choix = VerifNombre(rep);
			if(choix>0 && choix<4){
				LancerAction(choix, agenda);
			}
		}while(choix<3);
		System.exit(1);
	}

	public String TexteMenu() {
		return "Votre Menu d'actions\n1- Consulter votre agenda\n2- Creer un événement\n3- Quitter";
	}
}
