package totograd;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ControleCase extends JFrame implements MouseListener
{

	Case pancase;
	ControleCase(Case pancase)
	{
		this.pancase = pancase;
	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		System.out.println("click");
		if( pancase.getOccupe() )
		{
			if(pancase.getBackground() == Color.GRAY)
				JOptionPane.showMessageDialog(this, "Cette case est deja occupe par une foret (lol)","Attention", JOptionPane.WARNING_MESSAGE);
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) 
	{

	}

	@Override
	public void mouseExited(MouseEvent e) 
	{

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}


}
