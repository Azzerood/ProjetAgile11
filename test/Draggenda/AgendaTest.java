package Draggenda;

import static org.junit.Assert.*;

import org.junit.Test;

public class AgendaTest {

	@Test
	public void testAjoutEvent() {
		Agenda a = new Agenda();
		Evenement e = new Evenement("test", "test", new Date(01,01,2016), new Heure(12,11),new Heure(15,11), null, false);
		assertTrue(a.getCalendrier().isEmpty());
		a.ajouterEvenement(e);
		assertFalse(a.getCalendrier().isEmpty());
	}

}
