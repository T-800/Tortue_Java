package commande;

import ihm.PanelHistory;

import java.io.IOException;

import javax.swing.JPanel;

import objetQuiDessine.CurseurQuiDessine;
import objetQuiDessine.SymboleQuiDessine;

public class Center implements Commande {

	// Place le curseur au centre de l'image
	/*
	 * Trouver un moyen pour qu'on recupere la taille du panel  dessin 
	 * du dessin
	 *
	*/
	
	public static void execute(SymboleQuiDessine s){
		s.setAbscisse(0);
		s.setOrdonnee(0);
		
	}

	@Override
	public void execute(String[] parametres, JPanel dessin,
			CurseurQuiDessine curseur) throws IOException {
		// TODO Auto-generated method stub
		history.addToHistory(parametres[0]);
	}

	@Override
	public Object[] convertTo(String[] parametres) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void execute(String[] c, JPanel dessin, CurseurQuiDessine curseur,
			PanelHistory p) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
