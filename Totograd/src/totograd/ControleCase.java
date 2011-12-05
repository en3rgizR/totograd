package totograd;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class ControleCase extends JFrame implements MouseListener, ActionListener
{

	Case pancase;
	
	ControleCase(Case pancase)
	{
		this.pancase = pancase;
	}

	
	public void mouseClicked(MouseEvent e) 
	{
		if( pancase.getOccupe() )
		{
			if(pancase.getBackground() == Color.GRAY)
				pancase.AfficheErreur("Cette case est deja occupe par une foret (lol)", "Attention");
		}
		else
		{
			pancase.getConstruire().setEnabled(true);
			pancase.getDetruire().setEnabled(true);
			if(e.getButton() == e.BUTTON3)
			{
				pancase.getPopup().show(pancase, e.getX(), e.getY());
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) 
	{
		pancase.setBorder(BorderFactory.createLineBorder(Color.RED));
	}

	@Override
	public void mouseExited(MouseEvent e) 
	{
		pancase.setBorder(BorderFactory.createLineBorder(Color.BLACK));

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}



	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		String source = ae.getActionCommand();
		if(source.equals("Construire un batiment"))
		{
			new FenetreConstructions();
		}
		else if(source.equals("Detruire le batiment"))
		{
			
		}
	}

}
