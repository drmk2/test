package sketchPad;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

public class Canvas extends JPanel {
	
	private int mouseX;
	private int mouseY;
	
	public Canvas() {
		setToolTipText("It's a Window!!!! WOAH!!!!!");
		
		addMouseListener(new MouseAdapter() {
        	public void mousePressed(MouseEvent e) {
        		mouseX = e.getX();
        		mouseY = e.getY();
        		repaint();
        	}
        });
	}
	
	public Dimension getPreferredSize() {
        return new Dimension(250,200);
    }
	
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(50, 50, mouseX, mouseY);
        
    }
	
}