package pobj.motx.tme1;

public class Grille {

	private Case[][] matrice;
	
	public Grille(int hauteur, int largeur){
		
		matrice = new Case[hauteur][largeur];
		for (int i = 0; i< hauteur; i++){
			for (int j =0; j< largeur;j++){
				matrice[i][j] = new Case (i,j,' ');
			}
		}
	}
	
	public Case getCase(int lig, int col){
		return matrice[lig][col];
		
	}
	
	public String toString(){
		
		String s = "la grille est : \n";
		s = s+GrilleLoader.serialize(this, false);
		return s;
	}
	
	public int nbCol(){
		return matrice[0].length;
	}
	
	public int nbLig(){
		return matrice.length;
	}
	
	public Grille copy(){
		int nb1=nbCol();
		int nb2=nbLig();
		Grille r=new Grille(nb1,nb2);
		
		for(int i=0;i<nb1;i++){
			for(int j=0;j<nb2;j++){
				r.matrice[i][j]=matrice[i][j].copyCase();
			}
		}
		return r;
	}
}
