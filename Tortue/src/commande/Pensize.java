package commande;

import ihm.PanelHistory;

import java.io.IOException;

import javax.swing.JPanel;

import objetQuiDessine.CurseurQuiDessine;
import objetQuiDessine.SymboleQuiDessine;

public class Pensize implements Commande {

	@Override
	public void execute(String[] parametres, JPanel dessin,
			CurseurQuiDessine curseur) {
		// TODO Auto-generated method stub
		Object[] o;
		o=convertTo(parametres); 
		//curseur.setPensize((int)o[1]);
		
	}

	@Override
	public Object[] convertTo(String[] parametres) {
		// TODO Auto-generated method stub
		Integer i=Integer.parseInt(parametres[1]);
		return null;
	}

	@Override
	public void execute(String[] c, JPanel dessin, CurseurQuiDessine curseur,
			PanelHistory p) throws IOException {
		// TODO Auto-generated method stub
		
	}
}
