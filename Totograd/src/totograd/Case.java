package totograd;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.*;


class Case extends JPanel implements MouseListener
{ 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final Color couleur;
	private boolean click;
	private static boolean clicked=false;
	public final int x,y;
	private static Case destination=null;
	private boolean occupe=false;
	

	public Case(Color c, int x, int y, int dimx, int dimy)
	{
		// setBackground affecte la couleur de fond
		setBackground(c);	
		// setPreferredSize et setSize permettent de fixer
		// les dimensions de la case
		setPreferredSize(new Dimension(dimx, dimy)); 
		setSize(getPreferredSize());
		setBorder(BorderFactory.createLineBorder(Color.black));
		// les �v�nements souris sur la case sont �cout�s par la case elle-m�me
		addMouseListener(this);

		couleur=c;
		click=false;
		this.x=x;
		this.y=y;
	}

	// cette fonction remet la case � sa couleur d'origine
	public void ResetColor(){
		setBackground(couleur);
	}


	// lorsqu'on enclenche le clic sur la case
	public void mousePressed(MouseEvent e){
		click=true; // la case se souvient que la souris a cliqu� sur elle
		clicked=true; // on informe les autres cases que le clic est enclench�
		setBackground(Color.green);  // on change la couleur de la case
		destination=this; // on sauvegarde la r�f�rence de la case que la souris survole actuellement avec le clic enclench�
	}

	// �v�nement "sur clic" non utilis�
	public void mouseClicked(MouseEvent e) {}

	// lorsqu'on entre dans une case avec le clic enclench�
	public void mouseEntered(MouseEvent e) 
	{
		if(!click && clicked) setBackground(Color.cyan); // on change la couleur 
		if( clicked)  destination=this; // et on met � jour la destination
	}

	// �v�nement lorsqu'on rel�che le clic 
	// cet �v�nement est capt� par la case qui a subit le clic
	// c'est pourquoi on a besoin de la variable destination
	// elle permet de savoir o� est la souris lorsque le clic est rel�ch�
	public void mouseReleased(MouseEvent e) {
		// on remet la couleur d'origine de la case
		ResetColor();

		click=false;
		clicked=false;

		if(destination != null)
		{

			// on remet la couleur d'origine de la case destination
			destination.ResetColor();

			// si la case d'origine contient une pi�ce 
			// on essaie de bouger cette pi�ce vers la case destination
			// ce d�placement r�ussit si on respecte les contraintes
		}	
	}


	// �v�nement sur sortie de la souris d'une case
	public void mouseExited(MouseEvent e) {
		if(!click) ResetColor();
		destination=null;
	}

	// la m�thode paintComponent g�re 
	// l'affichage de la case

	public void paintComponent(Graphics g)
	{
		// on affiche d'abord la case
		super.paintComponent(g); 
	}

}