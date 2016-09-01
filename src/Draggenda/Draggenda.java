package Draggenda;

import java.util.ArrayList;

public class Draggenda {

	public static void main(String[] args) {
		
		
		ArrayList<String> participantsTest = new ArrayList<String>();
		participantsTest.add("nom1");
		participantsTest.add("nom2");
		Evenement testEvent = new Evenement("nomTest","desriptionTest1",new Date(01,9,2016),new Date(01,9,2016),new Heure(10,00),new Heure(11,00), participantsTest,true);
		System.out.println(testEvent.toString());
		Agenda agendaTest = new Agenda();
		Evenement testEvent2 = new Evenement("Event 2","desriptionTest2",new Date(01,10,2016),new Date(01,9,2016),new Heure(10,00),new Heure(11,00), participantsTest,true);
		Evenement testEvent3 = new Evenement("Event 3","desriptionTest3",new Date(14,12,2016),new Date(01,9,2016),new Heure(10,00),new Heure(11,00), participantsTest,true);
		agendaTest.ajouterEvenement(testEvent);
		agendaTest.ajouterEvenement(testEvent2);
		agendaTest.ajouterEvenement(testEvent3);
		agendaTest.afficher();
	}
}
