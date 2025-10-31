package ihm;

import javax.swing.*;
import structdonnees.ArbreBinaire;
import java.awt.*;

public class TreeDraw<E extends Comparable<E>, T> extends JFrame {
	
	private TreeDrawing<E, T> td;

	/**
	 * Constructeur qui instancie un object graphique Canvas dans lequel sera affiché tout
	 * le contenu de l'arbre passé en paramètre
	 *  
	 * @param node Le noeud de l'arbre à partir duquel se fait l'affichage (i.e. root si l'on
	 * veut afficher l'arbre dans son entièreté)
	 */
	public TreeDraw (ArbreBinaire<E, T>.Noeud node) {
		
		this.td = new TreeDrawing<> ( node );
	}
	
	/**
	 * Ajout de l'objet Canvas dans la fenêtre graphique
	 */
	public void drawTree () {
		
		Container pane;
		setTitle ("Display Trees");
		setSize (800, 400);
		pane = getContentPane ();
		pane.setLayout(new GridLayout(1,1));

		JPanel treedrawing = new JPanel();
		treedrawing.setLayout(new GridLayout(1,1));
		treedrawing.add(this.td);                
		pane.add(treedrawing);
		setVisible(true);
		
		// Fermeture définitive de l'application lorsque la fenêtre se ferme
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
	}
}