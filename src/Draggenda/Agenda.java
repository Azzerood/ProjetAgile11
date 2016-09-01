package Draggenda;
import java.util.GregorianCalendar;
import java.util.HashMap;


public class Agenda {

	//liste d'evenements
	//private Evenement[] e = new Evenement[24];
	
	private HashMap<GregorianCalendar, Evenement> calendrier = new HashMap<>();
	private GregorianCalendar dateActu = new GregorianCalendar();
	
	public void afficher(){
		calendrier.put(new GregorianCalendar(2016, 9, 1 ), new Evenement());
		calendrier.put(new GregorianCalendar(2016, 9, 2 ), new Evenement());
		calendrier.put(new GregorianCalendar(2016, 9, 4 ), new Evenement());
		calendrier.put(new GregorianCalendar(2016, 9, 6 ), new Evenement());
		calendrier.put(new GregorianCalendar(2016, 9, 9), new Evenement());
		for (GregorianCalendar date : calendrier.keySet()){
				System.out.println(date.toString() + "    " + calendrier.get(date).toString());
			
		}
	}
	
	public void 
	
	
	
	
	
}
