package commande;

import ihm.PanelHistory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

import javax.swing.filechooser.FileFilter;

import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

import objetQuiDessine.CurseurQuiDessine;

public class Open implements Commande {

	JFileChooser open = new JFileChooser();
	BufferedReader reader;
	//
   
	public Open(){
		
		FileFilter filter1 = new ExtensionFileFilter("Fichier texte", new String[] { "txt"});
	    open.setFileFilter(filter1);
		open.setApproveButtonText("Choix du fichier"); //intitulé du bouton
	}
	
	public void execute(String[] parametres, JPanel dessin,CurseurQuiDessine curseur, PanelHistory hist) throws IOException{
		

		int ret = open.showDialog(null, "Open file");

	    if (ret == JFileChooser.APPROVE_OPTION) {
	      File fileTxt = open.getSelectedFile();
	      System.out.println(fileTxt);
	      
	      /*
	       * lecture du fichier
	       */
	      
	      try {
				reader = new BufferedReader(new FileReader(fileTxt));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	      HashTable h = new HashTable();
	        String ligne = reader.readLine(); 
	        System.out.println("Ligne n° "+1+" :" +ligne);
	        int i=2;
	        while (ligne != null){ 
	            
	        	try {
	        		 hist.addTexte(ligne);
					h.hgj(ligne, curseur, dessin,hist);
				} catch (NullPointerException e1) {
					// TODO Auto-generated catch block
					hist.addError(ligne);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	            System.out.println("Ligne n° "+i+" :" +ligne);
	            ligne = reader.readLine(); 
	            i++;
	            
	        }
	      
	      
	      
	    }
		
		
	}
	public void execute(String[] parametres, JPanel dessin,CurseurQuiDessine curseur) throws IOException{
		
	      
	    
		
	}

	@Override
	public Object[] convertTo(String[] parametres) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	
	
	
	class ExtensionFileFilter extends FileFilter {
		  String description;

		  String extensions[];

		  public ExtensionFileFilter(String description, String extension) {
		    this(description, new String[] { extension });
		  }

		  public ExtensionFileFilter(String description, String extensions[]) {
		    if (description == null) {
		      this.description = extensions[0];
		    } else {
		      this.description = description;
		    }
		    this.extensions = (String[]) extensions.clone();
		    toLower(this.extensions);
		  }

		  private void toLower(String array[]) {
		    for (int i = 0, n = array.length; i < n; i++) {
		      array[i] = array[i].toLowerCase();
		    }
		  }

		  public String getDescription() {
		    return description;
		  }

		  public boolean accept(File file) {
		    if (file.isDirectory()) {
		      return true;
		    } else {
		      String path = file.getAbsolutePath().toLowerCase();
		      for (int i = 0, n = extensions.length; i < n; i++) {
		        String extension = extensions[i];
		        if ((path.endsWith(extension) && (path.charAt(path.length() - extension.length() - 1)) == '.')) {
		          return true;
		        }
		      }
		    }
		    return false;
		  }
		}









}
