package totograd;

import java.awt.event.*;
import javax.swing.event.*;

public class ControleConstr implements ActionListener {
	
	private FenetreConstructions constr;
	private String bat;
	
	public ControleConstr(FenetreConstructions constr)
	{
		this.constr = constr;
		bat = "";
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		if (!s.equals("Annuler"))
		{
			if (s.equals("Maison"))
			{
				
			}
			else if (s.equals(""))
			{
				
			}
		}
	}

}
