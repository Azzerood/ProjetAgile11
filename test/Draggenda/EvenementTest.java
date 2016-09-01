package Draggenda;

import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.*;

public class EvenementTest {

	@Test
	public void toStringTest() { 
		ArrayList <String> particip=new ArrayList<>();
		particip.add("participant test");
		Evenement event=new Evenement("Test","Description du Test",new Date(01,9,2016),new Heure(9,00),new Heure(10,00),particip);
		assertEquals("Nom : Test\nDescription : Description du Test\nDate : 01 Septembre 2016\nHeureDepart : 9:00\nHeureFin : 10:00\nParticipants : [participant test].",event.toString());
	}

}