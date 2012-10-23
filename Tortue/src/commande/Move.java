package commande;

import objetQuiDessine.CurseurQuiDessine;
import objetQuiDessine.SymboleQuiDessine;

import ihm.PanelHistory;

import java.io.IOException;
import java.lang.Math.*;

import javax.swing.JPanel;

public class Move implements Commande {
	
	
	
	public static void execute(SymboleQuiDessine s,int abscisse,int ordonnee){
		s.setAbscisse(abscisse);
		s.setOrdonnee(ordonnee);
	}
	
	/*
	 * Pour trouver les nouvelles coordonnées 
	 * new Abscisse = Abscisse + distance * cos(angle)
	 * new Ordonnee = Ordonnee + distance * sin(angle)
	 * */
	
	public static void execute(SymboleQuiDessine s,int n ){
		s.setAbscisse(s.getAbscisse()+ n * (int)Math.cos(s.getDirection()));
		s.setOrdonnee(s.getOrdonnee()+ n * (int)Math.sin(s.getDirection()));
	}

	@Override
	public void execute(String[] parametres, JPanel dessin,
			CurseurQuiDessine curseur) {
		// TODO Auto-generated method stub
		
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
