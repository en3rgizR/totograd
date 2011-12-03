package totograd;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class FenetreHighScores extends JDialog implements ActionListener{
	
	private static FenetreHighScores instance;
	
	private JButton ok;
	private static FenetreJeu jeu = FenetreJeu.getInstance();
	private JPanel panelSco;
	private JPanel panel;
	
	/**
	 * 
	 * @param owner
	 * @return
	 */
	public static FenetreHighScores getInstance(JFrame owner) {
		
        if (null == instance) {
            instance = new FenetreHighScores(owner);
        }
        return instance;
    }
	
	/**
	 * 
	 * @param owner
	 */
	private FenetreHighScores(JFrame owner){
		super(owner);
		setTitle("Les meilleurs scores");
		setResizable(false);
		setLocationRelativeTo(null);
		//createInterface();
	}
	
	/**
	 * 
	 */
	public void createInterface(){
			this.setSize(250,400);
			panelSco = new JPanel(new GridLayout(10,1));
			
			for (Enumeration<String> e = jeu.getHT().keys() ; e.hasMoreElements() ;) {
		         JLabel j = new JLabel(e.nextElement().toString()+" : ");
		         panelSco.add(j);
		     }
			
			panel = new JPanel(new BorderLayout());
			panel.add(panelSco);
			ok = new JButton("Ok");
			ok.addActionListener(this);
			panel.add(ok, BorderLayout.SOUTH);
			setContentPane(panel);
	}

	/**
	 * 
	 */
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ok){
			this.setVisible(false);
		}	
	}

}
