package totograd;

import java.awt.Color;

import javax.swing.BorderFactory;

public class Route extends Construction
{
	private int ressources;
	private Case caseroute;
	private final static int cout = 100;
	private final static Color color_route=Color.BLACK;
	
	Route(int ressources, Case caseroute)
	{
		super(cout, color_route);
		this.ressources = ressources;
		this.caseroute = caseroute;
	}
	
	
}
