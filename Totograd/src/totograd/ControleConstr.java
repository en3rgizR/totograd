package totograd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControleConstr implements ActionListener{
	
	private FenetreConstructions constr;
	private String bat;
	
	public ControleConstr(FenetreConstructions constr)
	{
		this.constr=constr;
		bat = "";
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if (!s.equals("Ok") && !s.equals("Annuler"))
		{
			//new HLM(cout_argent, color_construc, r_argent, r_personnes, nbcases_longueur, nbcases_largeur, capacite)
			
			/*if(!bat.equals(s))
			{
				bat = s;
				constr.setcb(bat);
			}
			else
			{
				bat="";
			}
			System.out.println(bat);*/
		}
		
	}

}
