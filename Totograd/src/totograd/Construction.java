package totograd;

import java.awt.Color;


abstract class Construction 
{
	int cout_argent;
	Color color_construc;
	int longueur;
	int largeur;
	Case case_const;
	Case[] zonecase_const;

	Construction(int cout_argent, Color color_construc, int longueur, int largeur, Case case_const)
	{
		this.cout_argent = cout_argent;
		this.color_construc = color_construc;
		this.longueur = longueur;
		this.largeur = largeur;	
		this.case_const = case_const;
		if(longueur > 1 || largeur > 1 );
			this.zonecase_const = buildZone(longueur, largeur, case_const);
	}


	// On fera une decrementation de partie.argent.
	// Si partie.argent < 0 => on genera une erreur ( a voir dans la construction donc)
	public int construire()
	{
		int tmp;

		if(case_const.getAire().getPartie().argent > cout_argent)
		{

			if(case_const.getOccupe() == true)
				case_const.AfficheErreur("Construction impossible, case deja occupe", "Erreur");
			else
			{
				case_const.setBackground(color_construc);
				case_const.setOccupe(true);
			}
			tmp = case_const.getAire().getPartie().argent - cout_argent;
			case_const.getAire().getPartie().argent = tmp;
			case_const.getAire().getPartie().getFenJeu().argent.setText(""+tmp);
		}
		else
		{
			case_const.AfficheErreur("Vous n'avez plus assez d'argent !", "Erreur");

		}
		return cout_argent;

	}

	// On fera une incrementation de partie.argent !
	public int detruire()
	{
		int tmp;
		if(case_const.getOccupe() == false)
			case_const.AfficheErreur("Impossible de detruire une case inoccupee", "Erreur");
		else
		{
			case_const.setBackground(Color.green);
			tmp = case_const.getAire().getPartie().argent - ((int)cout_argent/4);
			case_const.getAire().getPartie().argent = tmp;
			case_const.getAire().getPartie().getFenJeu().argent.setText(""+tmp);
		}
		return (cout_argent/4);
	}

	
	// Permet de recuperer les references des cases autour, lorsqu'on construit un batiment sur plusieurs cases.
	public Case[] buildZone(int longueur, int largeur, Case centre)
	{
		
		Case[] zone = new Case[longueur*largeur];
		int i,j;
		int cpt=0;

		int lon_arr, lon_avt;
		int larg_arr, larg_avt;


		if((longueur%2) == 0)
		{
			lon_arr= (longueur/2)-1;
			lon_avt= longueur/2;
		}
		else
		{
			lon_arr = lon_avt = (int) Math.floor(longueur);
		}

		if((largeur%2) == 0)
		{
			larg_arr= (largeur/2)-1;
			larg_avt= largeur/2;
		}
		else
		{
			larg_arr = larg_avt = (int) Math.floor(largeur);
		}

		// On balaye les cases arrieres
		for(i=0; i <= lon_arr; i++)
		{
			for(j=0; j <= larg_arr; j++)
			{
				zone[cpt]=centre.getAire().getCasePrecise(centre.x - i, centre.y - j);
				cpt++;
			}
		}

		// On balaye les cases avant
		for(i=0; i <= lon_avt; i++)
		{
			for(j=0; j <= larg_avt; j++)
			{
				// On ne reprend pas la position (0,0)
				if(i!= 0 && j!=0)
				{
					zone[cpt]=centre.getAire().getCasePrecise(centre.x - i, centre.y - j);
					cpt++;
				}
			}
		}
		return zone;
	}

}
