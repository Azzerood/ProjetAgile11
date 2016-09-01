package Draggenda;

public class Date {

	int jour, mois, annee;

	Date(int jour, int mois, int annee) {
		this.jour = jour;
		this.mois = mois;
		this.annee = annee;
	}

	int getJour() {
		return jour;
	}

	int getMois() {
		return mois;
	}

	int getAnnee() {
		return annee;
	}

	boolean estBissextile() {
		if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0)
			return true;
		else
			return false;
	}

	int nbJourDuMois() {
		if (estBissextile() && mois == 2)
			return 29;
		else if (mois == 2)
			return 28;
		else if (mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8
				|| mois == 10 || mois == 12)
			return 31;
		else
			return 30;
	}

	String getMoisEnLettre() {
		switch (mois) {
		case 1:
			return "Janvier";
		case 2:
			return "Fevrier";
		case 3:
			return "Mars";
		case 4:
			return "Avril";
		case 5:
			return "Mai";
		case 6:
			return "Juin";
		case 7:
			return "Juillet";
		case 8:
			return "Aout";
		case 9:
			return "Septembre";
		case 10:
			return "Octobre";
		case 11:
			return "Novembre";
		case 12:
			return "Decembre";
		default:
			return "ERROR";
		}

	}

	public String toString() {
		return /*JourSemaine() + " " + */getJour() + " " + getMoisEnLettre()
				+ " " + getAnnee() + "\n";
	}

}
