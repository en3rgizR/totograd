package totograd;

import java.awt.*;

import javax.swing.*;

public class AiredeJeu extends JPanel
{
	private Case quadrillage[][];
	private GridLayout grille;
	private int largeur;
	private int longueur;
	
	public AiredeJeu(int largeur,int longueur)
	{
		this.largeur=largeur;
		this.longueur= longueur;
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
				quadrillage[j][i] = new Case(Color.GREEN, j, i);
				this.add(quadrillage[j][i]);
			}
		}
	}

}
