package sketchPad;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

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
		
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				mouseX = e.getX();
        		mouseY = e.getY();
        		repaint();
			}
			public void mouseDragged(MouseEvent e) {
				mouseX = e.getX();
        		mouseY = e.getY();
        		repaint();
			}
		});
		
	}
	
	public Dimension getPreferredSize() {
        return new Dimension(500,500);
    }
	
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(getPreferredSize().width/2, getPreferredSize().height/2, mouseX, mouseY);
        
    }
	
}