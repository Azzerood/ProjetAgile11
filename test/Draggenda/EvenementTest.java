package Draggenda;

import java.util.ArrayList;

import org.junit.Test;
import static org.junit.Assert.*;

public class EvenementTest {

	@Test
	public void toStringTest() { 
		ArrayList <String> particip=new ArrayList<>();
		particip.add("participant test");
		Evenement event=new Evenement("Test","Description du Test",new Date(01,9,2016),new Date(01,9,2016),new Heure(10,00),new Heure(11,00),particip,true);
		assertEquals("Nom : Test\nDescription : Description du Test\nEvenement Public\nDate de Debut : 1 Septembre 2016\nDate de Fin : 1 Septembre 2016\n\nHeureDepart : 10:00\nHeureFin : 11:00\nParticipants : [participant test].",event.toString());
	}

}