package totograd;

import java.awt.*;

import javax.swing.*;

public class AiredeJeu extends JPanel
{
	private Case quadrillage[][];
	private GridLayout grille;
	private int largeur;
	private int longueur;
	private Partie partie;
	
	public AiredeJeu(int largeur,int longueur, Partie partie)
	{
		this.largeur=largeur;
		this.longueur= longueur;
		this.partie=partie;
		this.quadrillage = new Case[largeur][longueur];
		grille = new GridLayout(longueur, largeur);
		this.setLayout(grille);
		Initialize();
		
	}
	
	public void Initialize()
	{
		int i, j;
		for(i=0; i < largeur; i++)
		{
			for(j=0; j < longueur; j++)
			{
				quadrillage[j][i] = new Case(Color.GREEN, j, i, this);
				this.add(quadrillage[j][i]);
			}
		}
		
		// On va generer des cases occupes aleatoires (5% au plus des cases totale d'une partie)
		int nbre_random = (int)(Math.random()*((longueur*longueur) * 5/100));
		int randomx, randomy;
		for(i=0; i < nbre_random; i++)
		{
			randomx = (int) (Math.random()*longueur);
			randomy = (int) (Math.random()*longueur);
			quadrillage[randomx][randomy].setBackground(Color.GRAY);
			quadrillage[randomx][randomy].setOccupe(true);
		}
	}
	
	public Partie getPartie()
	{
		return partie;
	}
	
	// Retourne la capacite totale de la partie en cours
	public int getCapaciteTotale()
	{
		int i, j;
		int capacite_totale=0;
		Habitations tmp;
		for(i=0; i < largeur; i++)
		{
			for(j=0; j < longueur; j++)
			{
				// Toutes les cases n'ont pas forcement de construction... donc peuvent etre null !
				try
				{
					tmp = (Habitations) quadrillage[j][i].getConstruction();
					capacite_totale += tmp.getCapacite();
				}
				catch(NullPointerException npe){ }
			}
		}
		return capacite_totale;
	}
	
	public Case getCasePrecise(int x, int y)
	{
		return quadrillage[x][y];
	}
	

}
