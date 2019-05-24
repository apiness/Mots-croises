package pobj.motx.tme1;

import java.util.List;

public class Mot {

	private List<Case> lettres;

	public List<Case> getLettres() {
		return lettres;
	}

	public String toString() {
		String s = " le mot est ; \n";
		for (Case i : lettres) {
			s += i.getChar();

		}
		return s;
	}

	public int size() {
		return lettres.size();
	}

	public void ajoutCase(Case c) {
		if (c != null) {
			lettres.add(c);
		}
	}
}
