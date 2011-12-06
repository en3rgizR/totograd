package totograd;

import java.awt.*;

abstract class Construction 
{
	int cout_argent;
	Color color_construc;
	int longueur;
	int largeur;
	Case case_const;
	Case[] zonecase_const;
	boolean is_construit = true;


	Construction(int cout_argent, Color color_construc, int longueur, int largeur, Case case_const)
	{
		this.cout_argent = cout_argent;
		this.color_construc = color_construc;
		this.longueur = longueur;
		this.largeur = largeur;	
		this.case_const = case_const;
		if(case_const.getAire().getPartie().argent >= cout_argent)
		{

			payZone(case_const);

			if(longueur > 1 || largeur > 1 )
			{
				buildZone(case_const);
			}
			else
			{
				case_const.setConstruction(this);
				construire(case_const);
			}

		}
		else
		{
			is_construit = false;
			case_const.AfficheErreur("Vous n'avez pas assez d'argent", "Erreur");
		}

	}


	// On fera une decrementation de partie.argent.
	// Si partie.argent < 0 => on genera une erreur ( a voir dans la construction donc)
	public int construire(Case c)
	{
		int tmp;

		if(c.getAire().getPartie().argent > cout_argent)
		{
			if(c.getOccupe() == true)
				c.AfficheErreur("Construction impossible, case deja occupe", "Erreur");
			else
			{
				c.setOccupe(true);
				c.setBackground(color_construc);
			}
		}
		else
		{
			c.AfficheErreur("Vous n'avez plus assez d'argent !", "Erreur");
		}
		return cout_argent;
	}


	// On fera une incrementation de partie.argent !
	public int detruire(Case c)
	{
		int tmp;

		if(c.getAire().getPartie().argent > (cout_argent/4))
		{
			if(c.getOccupe() == false)
			{
				c.AfficheErreur("Impossible de detruire une case inoccupee", "Erreur");
			}
			else
			{
				c.setBackground(Color.green);
				c.setConstruction(null);
				c.setOccupe(false);
				if(c.getAire().getPartie().nbhabitants== 0)
				{
					c.getAire().getPartie().habitant_courant = 0;
					c.getAire().getPartie().getFenJeu().habitants.setText("0/0");
				}
			}	
		}
		else
		{
			c.AfficheErreur("Vous n'avez plus assez d'argent !", "Erreur");
		}

		return (cout_argent/4);
	}


	// Permet de recuperer les references des cases autour, lorsqu'on construit un batiment sur plusieurs cases.
	public Case[] buildZone(Case centre)
	{
		zonecase_const = new Case[longueur*largeur];
		int i,j;
		int cpt=0;

		for(i=0; i < longueur; i++)
		{
			for(j=0; j < largeur; j++)
			{
				if(centre.x + i >= centre.getAire().getLongueur()  ||  centre.y + j >= centre.getAire().getLargeur())
				{
					zonecase_const[i].AfficheErreur("Impossible de construire le batiment ici !", "Erreur");
					is_construit = false;
					return null;
				}

				zonecase_const[cpt]=centre.getAire().getCasePrecise(centre.x + i, centre.y + j);

				if(zonecase_const[cpt].getOccupe())
				{
					zonecase_const[cpt].AfficheErreur("Impossible de construction, la zone est deja occupe", "Erreur");
					is_construit = false;
					return null;
				}
				cpt++;
			}
		}

		// On remplit les cases de la reference de la construction de zone;
		for(i=0; i < cpt; i++)
		{
			zonecase_const[i].setConstruction(this);
			construire(zonecase_const[i]);
		}		

		case_const.getAire().getPartie().MajArgent(cout_argent, true);

		return zonecase_const;
	}
	
	public void payZone(Case case_const) 
	{
		buildZone(case_const);
		case_const.getAire().getPartie().MajArgent(cout_argent, true);
	}


	public void eraseZone()
	{
		int i;

		case_const.getAire().getPartie().MajArgent(cout_argent, false);
		case_const.getAire().getPartie().MajCapacite(this.getCapacite(), false);
		case_const.getAire().getPartie().setLoyerTotal(this.getLoyer(), false);

		for(i=0; i < zonecase_const.length; i++)
		{
			detruire(zonecase_const[i]);
		}
		case_const.getAire().getPartie().MajArgent(cout_argent, true);
	}


	public int getConstrLongueur()
	{
		return longueur;
	}

	public int getConstrLargeur()
	{
		return largeur;
	}

	abstract int getCapacite();
	abstract int getLoyer();
}