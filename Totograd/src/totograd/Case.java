package totograd;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Case extends JPanel
{ 
	/**
	 * 
	 */
	private final Color couleur;
	private boolean click;
	private static boolean clicked = false;
	public final int x,y;
	private static Case destination = null;
	private boolean occupe=false;
	private ControleCase ctrlcase;
	private JPopupMenu popup;
	private JMenuItem construire;
	private JMenuItem detruire;
	private AiredeJeu aire;
	private Construction construction;

	public Case(Color c, int x, int y, AiredeJeu aire)
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
		this.aire=aire;
		creerMenuContextuel();
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

	public boolean getOccupe()
	{
		return occupe;
	}

	public void setOccupe(boolean status) 
	{
		this.occupe = status;
	}
	
	public void AfficheErreur(String error_msg, String error_title)
	{
		JOptionPane.showMessageDialog(this , error_msg , error_title, JOptionPane.WARNING_MESSAGE);

	}
	
	public void creerMenuContextuel()
	{
		popup = new JPopupMenu();
		construire = new JMenuItem("Construire un batiment");
		detruire = new JMenuItem("Detruire le batiment");
		popup.add(construire);
		popup.add(detruire);
		construire.addActionListener(ctrlcase);
		detruire.addActionListener(ctrlcase);
	}
	
	public JPopupMenu getPopup()
	{
		return popup;
	}
	
	public JMenuItem getConstruire()
	{
		return construire;
	}
	
	public JMenuItem getDetruire()
	{
		return detruire;
	}
	
	public AiredeJeu getAire()
	{
		return aire;
	}
	
	public void setConstruction(Construction c)
	{
		this.construction = c;
	}
	
	public Construction getConstruction()
	{
		return construction;
	}
	
	
}