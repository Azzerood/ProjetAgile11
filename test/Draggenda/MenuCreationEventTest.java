package Draggenda;

import static org.junit.Assert.*;

import org.junit.Test;

public class MenuCreationEventTest {

	@Test
	public void VerifJour() {
		assertEquals(new MenuCreationEvent().VerifJour("12"), 12);
		assertEquals(new MenuCreationEvent().VerifJour("1"), 1);
		assertEquals(new MenuCreationEvent().VerifJour("01"), 1);
		assertEquals(new MenuCreationEvent().VerifJour("-5"), -1);
		assertEquals(new MenuCreationEvent().VerifJour("32"), 32);
	}
	@Test
	public void VerifMois() {
		assertEquals(new MenuCreationEvent().VerifMois("12"), 12);
		assertEquals(new MenuCreationEvent().VerifMois("1"), 1);
		assertEquals(new MenuCreationEvent().VerifMois("01"), 1);
		assertEquals(new MenuCreationEvent().VerifMois("-5"), -1);
		assertEquals(new MenuCreationEvent().VerifMois("15"), 15);
	}
	@Test
	public void  VerifAnnee() {
		assertEquals(new MenuCreationEvent().VerifAnnee("123"), -1);
		assertEquals(new MenuCreationEvent().VerifAnnee("2016"), 2016);
		assertEquals(new MenuCreationEvent().VerifAnnee("2015"), 2015);
		assertEquals(new MenuCreationEvent().VerifAnnee("2017"), 2017);
		assertEquals(new MenuCreationEvent().VerifAnnee("20000"), -1);
	}
	
	@Test
	public void  VerifHeure() {
		assertEquals(new MenuCreationEvent().VerifHeure("123"), -1);
		assertEquals(new MenuCreationEvent().VerifHeure("01"),1);
		assertEquals(new MenuCreationEvent().VerifHeure("10"), 10);
		assertEquals(new MenuCreationEvent().VerifHeure("14"), 14);
		assertEquals(new MenuCreationEvent().VerifHeure("25"), 25);
	}
	@Test
	public void  VerifMinute() {
		assertEquals(new MenuCreationEvent().VerifMinute("123"), -1);
		assertEquals(new MenuCreationEvent().VerifMinute("01"),1);
		assertEquals(new MenuCreationEvent().VerifMinute("10"), 10);
		assertEquals(new MenuCreationEvent().VerifMinute("14"), 14);
		assertEquals(new MenuCreationEvent().VerifMinute("25"), 25);
	}
	
}
