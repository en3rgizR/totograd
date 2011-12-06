package totograd;

import java.awt.event.*;

public class ControleConstr implements ActionListener {
	
	private FenetreConstructions constr;
	private String bat;
	private Case c;
	
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
				new Maison(c);
			}
			else if (s.equals("HLM"))
			{
				new HLM(c);
			}
			else if (s.equals("Villa"))
			{
				new Villa(c);
			}
			else if (s.equals("Mairie"))
			{
				//new Mairie(c);
			}
			else if (s.equals("Caserne de pompiers"))
			{
				
			}
			else if (s.equals("Hôpital"))
			{
				
			}
			else if (s.equals("Route"))
			{
				new Route(c);
			}
		}
	}

}
