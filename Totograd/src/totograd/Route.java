package totograd;

import java.awt.*;

public class Route extends Construction
{
	private final static int cout = 100;
	private final static Color color_route=Color.BLACK;
	private final static int longueur = 1;
	private final static int largeur = 1;
	
	Route(Case c)
	{
		super(cout, color_route, longueur, largeur, c);
	}	
}
