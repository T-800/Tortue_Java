package commande;
import history.*;
import java.io.IOException;

import history.HistoryTortue;
import ihm.PanelHistory;

import javax.swing.JPanel;

import objetQuiDessine.CurseurQuiDessine;


public class Undo implements Commande {

	//Commande UNDO : annule la denriere commande executer
	
	@Override
	public void execute(String[] parametres, JPanel dessin,CurseurQuiDessine curseur) throws IOException {
		history.removeToHistory();
		
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
