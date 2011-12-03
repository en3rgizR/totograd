package totograd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControleJeu implements ActionListener
{

	private FenetreCreaPartie partie;
	private FenetreHighScores high;
	private FenetreConstructions construct;
	private FenetreJeu jeu;
	
	public ControleJeu(FenetreJeu jeu, FenetreCreaPartie partie, FenetreHighScores high, FenetreConstructions construct)
	{
		this.partie = partie;
		this.high = high;
		this.construct = construct;
		this.jeu = jeu;
	}
	
	
	public void actionPerformed(ActionEvent e) 
	{
		String source = e.getActionCommand();
		
		if (source.equals("Jouer une partie")){
			partie.createInterface();
			partie.setVisible(true);
		} else if (source.equals("High Scores")){
			high.createInterface();
			high.setVisible(true);
		}else if(source.equals("Quitter")){
			jeu.dispose();
		} else if (source.equals("Construire")){
			construct.setVisible(true);
		}

	}

}
