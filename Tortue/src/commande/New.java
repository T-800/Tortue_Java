package commande;

import ihm.PanelHistory;

import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JPanel;

import objetQuiDessine.CurseurQuiDessine;


public class New implements Commande {

	@Override
	public void execute(String[] parametres, JPanel dessin,
			CurseurQuiDessine curseur) {
		// TODO Auto-generated method stub
		JOptionPane boite = new JOptionPane();
		int option = JOptionPane.showConfirmDialog(null, "Voulez vous enregistrer votre dessin",
				"Tortue", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		
		if (option == JOptionPane.YES_OPTION){
			//Save.execute();
		}
		if (option == JOptionPane.NO_OPTION){
		
		}
		if (option == JOptionPane.CANCEL_OPTION){
			
		}
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

	//Faire un appel � save
	/*
	 * L'appel a SAVE doit ouvrir une fenetre pop up
	 * propose s'il veut sauvergarder ou non,
	 * s'il veut annuler sa commande 
	 * alors la commande new est annul�
	 * 
	 */
	
	
}
