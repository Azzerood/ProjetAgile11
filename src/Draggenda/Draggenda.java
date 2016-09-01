package Draggenda;

import java.util.ArrayList;

public class Draggenda {

	public static void main(String[] args) {
		
		Menu action = new Menu();
		action.DeroulerMenu();
		
		
		ArrayList<String> participantsTest = new ArrayList<String>();
		participantsTest.add("nom1");
		participantsTest.add("nom2");
		Evenement testEven = new Evenement("nomTest","desriptionTest",new Date(01,9,2016),new Heure(10,00),new Heure(11,00), participantsTest);
		System.out.println(testEven.toString());
	}
}
