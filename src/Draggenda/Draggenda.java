package Draggenda;

import java.util.ArrayList;

public class Draggenda {

	public static void main(String[] args) {
		Logs logs = new Logs();
		logs.ajouterCompte("tutu", "toto");
		MenuLog menuLog = new MenuLog(logs);
		menuLog.Menu();
		
		
		Menu menuPrincipal = new Menu(0);
		menuPrincipal.DeroulerMenu();
		
	}
	
}
