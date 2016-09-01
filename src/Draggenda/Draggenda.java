package Draggenda;

import java.util.ArrayList;

public class Draggenda {

	public static void main(String[] args) {
		ArrayList<String> participantsTest = new ArrayList<String>();
		participantsTest.add("nom1");
		participantsTest.add("nom2");
		Evenement testEven = new Evenement("nomTest","desriptionTest","2016/09/01","heureDepTest","heureFinTest", participantsTest);
		System.out.println(testEven.toString());
	}
}
