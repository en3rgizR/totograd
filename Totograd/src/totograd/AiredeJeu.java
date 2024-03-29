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
	private int loyer_tot;

	public AiredeJeu(int largeur,int longueur, Partie partie)
	{
		this.largeur=largeur;
		this.longueur= longueur;
		this.partie=partie;
		this.quadrillage = new Case[largeur][longueur];
		this.loyer_tot = 0;
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
		int nbre_random_foret = (int)(Math.random()*((longueur*longueur) * 5/100));
		int random_foret_x, random_foret_y;
		for(i=0; i < nbre_random_foret; i++)
		{
			random_foret_x = (int) (Math.random()*longueur);
			random_foret_y = (int) (Math.random()*longueur);
			quadrillage[random_foret_x][random_foret_y].setBackground(Color.GRAY);
			quadrillage[random_foret_x][random_foret_y].setOccupe(true);
		}
		int nbre_random_lac = (int)(Math.random()*((longueur*longueur) * 5/100));
		int random_lac_x, random_lac_y;
		for(i=0; i < nbre_random_lac; i++)
		{
			random_lac_x = (int) (Math.random()*longueur);
			random_lac_y = (int) (Math.random()*longueur);
			quadrillage[random_lac_x][random_lac_y].setBackground(Color.CYAN);
			quadrillage[random_lac_x][random_lac_y].setOccupe(true);
		}
	}

	public Partie getPartie()
	{
		return partie;
	}

	// Retourne la capacite totale de la partie en cours
	public int getLoyerTotal()
	{
		return loyer_tot;
	}


	public void setLoyerTotale(int l)
	{
		loyer_tot += l;
	}

	public Case getCasePrecise(int x, int y)
	{
		return quadrillage[x][y];
	}

	public int getLongueur()
	{
		return longueur;
	}

	public int getLargeur()
	{
		return largeur;
	}

}
