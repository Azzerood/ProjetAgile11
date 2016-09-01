package Draggenda;

import static org.junit.Assert.*;

import org.junit.Test;

public class MenuTest {


	
	
	@Test
	public void afficherMenu() {
		assertEquals(new Menu().toString(), "Votre Menu d'actions\n1- Consulter votre agenda\n2-Créer un évènement\n3-Recherche d'utilisateurs");
	}
	
	@Test
	public void verifNombre() {
		assertEquals( new Menu().VerifNombre("toto"),false );
		assertEquals( new Menu().VerifNombre("1039"), 1039);
		
	}
	
}
