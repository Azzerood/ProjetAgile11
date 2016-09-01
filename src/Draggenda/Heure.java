package Draggenda;

public class Heure {
	
	private int heure, minutes;
	
	public Heure(int heure, int minutes){
		this.heure=heure;
		this.minutes=minutes;
	}
	
	public String toString(){
		return heure+":"+(minutes<10? "0"+minutes:minutes);
	}
}
