package totograd;

import java.awt.BorderLayout;
import java.awt.event.*;

public class ControleCreaPartie implements ActionListener
{

	private FenetreCreaPartie crea;
	private Partie partie;
	Temps tps;

	public ControleCreaPartie(FenetreCreaPartie crea) 
	{
		this.crea = crea;
	}


	public void actionPerformed(ActionEvent e) 
	{
		String source = e.getActionCommand();
		if(source.equals("OK"))
		{
			if(crea.getType().getSelectedItem().equals("Libre"))
			{
				partie = new Partie(1000, 100, 0, crea.getNom().getText(), crea.getTaille().getSelectedItem(), crea.getOwner());
				tps = new Temps(0, 2, crea.getOwner(), partie);

			}
			else if(crea.getType().getSelectedItem().equals("Compte a rebours"))
			{
				partie = new Partie(1000, 100, 50, crea.getNom().getText(), crea.getTaille().getSelectedItem(), tps); // TODO : Compte a rebours
			}
			else
			{
				//partie = new Partie(1000, 100, 50, crea.getNom().getText(), crea.getTaille().getSelectedItem(), cre);
			}
			partie.afficherAire(crea.getOwner().panmain);
		}
		crea.dispose();
	}
}
