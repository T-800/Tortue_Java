package commande;

import javax.swing.JPanel;

import objetQuiDessine.CurseurQuiDessine;

public class Redo implements Commande {
	
	//refait la commande qui a �t� annul�e

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
	}