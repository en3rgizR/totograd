package totograd;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;


class Case extends JPanel
{ 
	/**
	 * 
	 */
	private final Color couleur;
	private boolean click;
	private static boolean clicked=false;
	public final int x,y;
	private static Case destination=null;
	private boolean occupe=false;
	private ControleCase ctrlcase;
	

	public Case(Color c, int x, int y)
	{
		// setBackground affecte la couleur de fond
		setBackground(c);	
		// setPreferredSize et setSize permettent de fixer
		// les dimensions de la case
		setSize(getPreferredSize());
		setBorder(BorderFactory.createLineBorder(Color.black));
		// les �v�nements souris sur la case sont �cout�s par la case elle-m�me
		ctrlcase = new ControleCase(this);
		addMouseListener(ctrlcase);

		couleur=c;
		click=false;
		this.x=x;
		this.y=y;
	}

	// cette fonction remet la case � sa couleur d'origine
	public void ResetColor()
	{
		setBackground(couleur);
	}




	// la m�thode paintComponent g�re 
	// l'affichage de la case
	public void paintComponent(Graphics g)
	{
		// on affiche d'abord la case
		super.paintComponent(g); 
	}

}