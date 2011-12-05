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
import javax.swing.JOptionPane;

public class ControleCase extends JFrame implements MouseListener
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



}
