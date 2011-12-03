package totograd;

import java.awt.Dimension;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class FenetreConstructions extends JDialog{
	
	private static FenetreConstructions instance;
	private JTabbedPane tp;
	private JPanel pHabitations;
	private JPanel pServicesPubliques;
	private JPanel pMagasins;

	/**
	 * 
	 * @param owner
	 * @return
	 */
	public static FenetreConstructions getInstance(JFrame owner) {	
        if (null == instance) {
            instance = new FenetreConstructions(owner);
        }
        return instance;
    }
	
	private FenetreConstructions(JFrame owner){
		super(owner);
		setTitle("Construire");
		createInterface();
		setLocationRelativeTo(null);
	}
	
	public void createInterface(){
		setSize(500,500);
		tp = new JTabbedPane(SwingConstants.TOP);
		pHabitations = new JPanel();
		pHabitations.setPreferredSize(new Dimension(300, 80));
		tp.addTab("Habitations", pHabitations);
		pMagasins = new JPanel();
		pMagasins.setPreferredSize(new Dimension(300, 80));
		tp.addTab("Societes", pMagasins);
		pServicesPubliques = new JPanel();
		pServicesPubliques.setPreferredSize(new Dimension(300, 80));
		tp.addTab("Services Publiques", pServicesPubliques);
		tp.setOpaque(true);
		add(tp);
	}
	
}

