package commande;

import ihm.PanelHistory;

import java.io.IOException;

import javax.swing.JPanel;

import objetQuiDessine.CurseurQuiDessine;
import objetQuiDessine.SymboleQuiDessine;

public class Turn implements Commande{
	
	@Override
	public void execute(String[] parametres, JPanel dessin,
			CurseurQuiDessine curseur) {
		// TODO Auto-generated method stub
		//curseur.setDirection(parametres[0]);
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
