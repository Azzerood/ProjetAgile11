package Draggenda;

import static org.junit.Assert.*;

import org.junit.Test;

public class MenuTest {


	
	
	@Test
	public void afficherMenu() {
		assertEquals(new Menu().TexteMenu() , "Votre Menu d'actions\n1- Consulter votre agenda\n2- Créer un événement\n3- Recherche d'utilisateur");
	}
	
	@Test
	public void verifNombre() {
		assertEquals( new Menu().VerifNombre("toto"), -1 );
		assertEquals( new Menu().VerifNombre("8"), 8); 
		assertEquals( new Menu().VerifNombre("1039"), 1039); 
		
	}
	
}
