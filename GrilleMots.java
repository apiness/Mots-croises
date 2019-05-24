package pobj.motx.tme1;

import java.util.ArrayList;
import java.util.List;

public class GrilleMots {

	private List<Mot> mots;

	public GrilleMots(Grille g) {

		mots = new ArrayList<Mot>();

		for (int i = 0; i < g.nbLig(); i++) {
			for (int j = 0; j < g.nbCol(); j++) {

				Case c = g.getCase(i, j);
				if (c.isVide() && j + 1 != g.nbCol()) {
					int k = j;
					Case c2 = g.getCase(i, k + 1);
					if (c2.isVide()) {
						Mot m = new Mot();
						while (k < g.nbCol() && g.getCase(i, k).isPleine()) {
							Case x = g.getCase(i, k);
							m.ajoutCase(x);
							k++;
						}
						mots.add(m);
					}
				}
			}
		}
	}

	public List<Mot> getMots() {
		return mots;
	}

	public int getNbHorizontal() {
		return getMots().size();
	}

	public String toString() {
		String s = "les mots sont : \n";
		for (Mot i : mots) {
			s += i + " , ";
		}
		return s;

	}

	public void setMots(List<Mot> mots) {
		this.mots = mots;
	}

}
