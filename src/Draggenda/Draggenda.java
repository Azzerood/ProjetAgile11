package Draggenda;

import java.util.ArrayList;

public class Draggenda {

	public static void main(String[] args) {
		Logs logs = new Logs();
		Save save = new Save();
		logs.ajouterCompte("tutu", "toto");
		MenuLog menuLog = new MenuLog(logs,save);
		menuLog.Menu();
		int index=logs.retournerIndexUser(menuLog.nom);
		Menu menuPrincipal = new Menu(index);
		menuPrincipal.DeroulerMenu();
		
	}
	
}
