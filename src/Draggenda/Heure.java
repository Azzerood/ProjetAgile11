package Draggenda;

import java.io.Serializable;

public class Heure implements Serializable {

	private int heure, minutes;

	public Heure(int heure, int minutes) {
		this.heure = heure;
		this.minutes = minutes;
	}

	public String toString() {
		return heure + ":" + (minutes < 10 ? "0" + minutes : minutes);
	}

	public int compareHeure(Heure heure) {
		if (this.heure > heure.heure) {
			return 1;
		} else if (this.heure < heure.heure) {
			return -1;
		} else {
			if (this.minutes > heure.minutes) {
				return 1;
			} else if (this.minutes < heure.minutes) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	public int getHeure() {
		return heure;
	}

	public int getMinutes() {
		return minutes;
	}

}
