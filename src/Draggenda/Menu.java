package Draggenda;

import java.io.Serializable;
import java.util.Scanner;

public class Menu implements Serializable{

	Scanner sc = new Scanner(System.in);
	Agenda agenda;
	//*********
	Save save=new Save();
	//*********
	 
	public Menu() {
		//*********
		agenda=save.charger();
		//*********
	}

	public Menu(Agenda agenda) {
	this.agenda = agenda;
	}
	public void Showagenda( Agenda agenda) {
		agenda.afficher();
	}

	public Evenement CreateEvent(Agenda agenda) {
		Evenement event= new MenuCreationEvent().CreeEvent();
		System.out.println("L'évènement "+event.getNom()+" a été crée à la date "+event.getDateDepart()+" à "+event.getHeureDepart()+" et finira le "+event.getDateFin()+" à "+event.getHeureFin());
		agenda.ajouterEvenement(event);
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
			CreateEvent(agenda);
		} else if (nb >2) {
			if(nb == 3){
				MenuEvent menuEvent = new MenuEvent();
				menuEvent.menuEvenement(agenda);
			}
		}
	}

	public void AfficherMenu() {
		//System.out.println(new Menu().TexteMenu());
		System.out.println(this.TexteMenu());
	}

	public void DeroulerMenu() {
		int choix ;
		do{
			AfficherMenu();
			String rep=SaisieNombre();
			choix = VerifNombre(rep);
			if(choix>0 && choix<5){
				LancerAction(choix, agenda);
			}
		}while(choix<4);
		//*********
		save.sauvegarder(agenda);
		//*********
		System.exit(1);
	}

	public String TexteMenu() {
		return "Votre Menu d'actions\n1- Consulter votre agenda\n2- Creer un événement\n3- Gerer les evenements\n4- Quitter";
	}
}
