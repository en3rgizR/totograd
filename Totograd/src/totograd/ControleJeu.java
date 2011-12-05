package totograd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.FeatureDescriptor;

public class ControleJeu implements ActionListener
{

	private FenetreJeu fenjeu;
	private FenetreCreaPartie fenpartie;
	private FenetreHighScores high;
	private FenetreConstructions constr;


	public ControleJeu(FenetreJeu fenjeu)
	{
		this.fenjeu = fenjeu;
	}


	public void actionPerformed(ActionEvent e) 
	{
		String source = e.getActionCommand();


		if (source.equals("Jouer une partie"))
		{
			// On arrete le timer de la partie précédente pour eviter des problemes de thread
			try
			{
				fenpartie.getControleur().tps.timer.cancel();
			}
			catch(NullPointerException npe){} // Si aucune partie n'a deja etre cree..

			fenpartie = new FenetreCreaPartie(fenjeu);			
		}
		else if (source.equals("High Scores"))
		{
			high = new FenetreHighScores(fenjeu);
		}
		else if (source.equals("Construire"))
		{
			constr = new FenetreConstructions(fenjeu);
			constr.setVisible(true);
		}
		else if(source.equals("Quitter"))
		{
			fenjeu.dispose();
			fenpartie.getControleur().tps.timer.cancel(); // ne pas oublier de fermer le thread
		} 

	}

}
