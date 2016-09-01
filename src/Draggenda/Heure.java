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
	
	public int compareHeure(Heure heure){
		if(this.heure > heure.heure){
			return 1;
		}else if(this.heure < heure.heure){
			return -1;
		}else{
			if(this.minutes > heure.minutes){
				return 1;
			}else if(this.minutes < heure.minutes){
				return -1;
			}else{
				return 0;
			}
		}
	}
}
