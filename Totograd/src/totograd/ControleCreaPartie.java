package totograd;

import java.awt.BorderLayout;
import java.awt.event.*;

public class ControleCreaPartie implements ActionListener
{

	private FenetreCreaPartie crea;

	public ControleCreaPartie(FenetreCreaPartie crea) 
	{
		this.crea = crea;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Object source = e.getActionCommand();
		if(source.equals("Annuler")){
			crea.setVisible(false);
		}
		else if(source.equals("OK"))
		{
			crea.setVisible(false);
			AiredeJeu adj;
			if( crea.getTaille().getSelectedItem().equals("Petite") )
			{
				System.out.println("petite");
				adj = new AiredeJeu(50, 50);
			}
			else if (  crea.getTaille().getSelectedItem().equals("Moyenne")  )
				adj = new AiredeJeu(100, 100);
			else
				adj = new AiredeJeu(200, 200);

			adj.Initialize(10, 10);
			System.out.println("owner : "+crea.getOwner());
			crea.getOwner().panmain.add(adj);
			crea.getOwner().panmain.repaint();
		}
	}
}
