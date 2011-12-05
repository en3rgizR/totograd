package totograd;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ControleCase implements MouseListener
{

	Case pancase;
	ControleCase(Case pancase)
	{
		this.pancase = pancase;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) 
	{
		System.out.println("("+pancase.x+", "+pancase.y+")");
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
