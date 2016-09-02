package Draggenda;

import java.util.ArrayList;

public class Draggenda {

	public static void main(String[] args) {
		Logs logs = new Logs();
		logs.ajouterCompte("tutu", "toto");
		MenuLog menuLog = new MenuLog(logs);
		menuLog.Menu();
		
		ArrayList<String> participantsTest = new ArrayList<String>();
		participantsTest.add("nom1"); 
		participantsTest.add("nom2");
		Evenement testEvent = new Evenement("nomTest","desriptionTest1",new Date(01,9,2016),new Date(01,9,2016),new Heure(10,00),new Heure(11,00), participantsTest,true);
		
		Agenda agendaTest = new Agenda();
		agendaTest.ajouterEvenement(testEvent);
		//Menu menuPrincipal = new Menu(agendaTest);
		Menu menuPrincipal = new Menu();
		menuPrincipal.DeroulerMenu();
		
	}
	
}
