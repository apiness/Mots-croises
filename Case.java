package pobj.motx.tme1;

public class Case {

	private int ligne;
	private int colonne;
	private char val;
	
	public Case (int ligne, int colonne , char val){
		this.ligne = ligne;
		this.colonne = colonne;
		this.val = val;
	}

	public int getLig() {
		return ligne;
	}
	
	public int getCol() {
		return colonne;
	}
	
	public char getChar() {
		return val;
	}
	
	public void setLigne(int ligne) {
		this.ligne = ligne;
	}

	public void setColonne(int colonne) {
		this.colonne = colonne;
	}

	public void setChar(char val) {
		this.val = val;
	}
	
	public boolean isPleine(){
		if (val=='*'){
			return true;
		}
		return false;
	}
	public boolean isVide(){
		if (val==' '){
			return true;
		}
		return false;
	}
	
	public Case copyCase(){
		return new Case(ligne,colonne,val);
	}
	
	
		
		
		
	
	
}
