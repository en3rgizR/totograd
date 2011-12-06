package totograd;

import java.awt.Color;

import javax.swing.BorderFactory;

public class Route extends Construction
{
	private final static int cout = 100;
	private final static Color color_route=Color.BLACK;
	
	
	Route(Case caseroute, int longueur, int largeur )
	{
		super(cout, color_route, longueur, largeur, caseroute);
	}
	
	
}
