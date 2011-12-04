package totograd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.FeatureDescriptor;

public class ControleJeu implements ActionListener
{

	private FenetreJeu jeu;
	private FenetreCreaPartie partie;
	private FenetreHighScores high;
	private FenetreConstructions constr;

	
	public ControleJeu(FenetreJeu jeu)
	{
		this.jeu = jeu;
	}
	
	
	public void actionPerformed(ActionEvent e) 
	{
		String source = e.getActionCommand();
		
		
		if (source.equals("Jouer une partie"))
		{
			System.out.println("jouer !");
			partie = new FenetreCreaPartie(jeu);
			
		}
		else if (source.equals("High Scores"))
		{
			high = new FenetreHighScores(jeu);
		}
		else if (source.equals("Construire"))
		{
			
		}
		else if(source.equals("Quitter"))
		{
			jeu.dispose();
		} 

	}

}
