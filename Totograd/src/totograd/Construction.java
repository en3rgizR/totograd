package totograd;

import java.awt.Color;


abstract class Construction 
{
	int cout_argent;
	Color color_construc;
	
	Construction(int cout_argent, Color color_construc)
	{
		this.cout_argent = cout_argent;
		this.color_construc = color_construc;
	}
	// On fera une decrementation de partie.argent.
	// Si partie.argent < 0 => on genera une erreur ( a voir dans la construction donc)
	public int construire(Case _case)
	{
		if(_case.getOccupe() == true)
			_case.AfficheErreur("Construction impossible, case deja occupe", "Erreur");
		else
		{
			_case.setBackground(color_construc);
			_case.setOccupe(true);
		}
		return cout_argent;
		
	}
	
	// On fera une incrementation de partie.argent !
	public int detruire(Case _case)
	{
		if(_case.getOccupe() == false)
			_case.AfficheErreur("Impossible de detruire une case inoccupee", "Erreur");
		else
		{
			_case.setBackground(Color.green);
			return cout_argent/2;
		}
		return 0;

	}
	
}
