package commande;



import ihm.PanelHistory;

import java.io.IOException;

import javax.swing.JPanel;

import objetQuiDessine.CurseurQuiDessine;
import objetQuiDessine.SymboleQuiDessine;


public class Clear implements Commande {
	
	//efface tout le dessin
	public static void execute(SymboleQuiDessine s){
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