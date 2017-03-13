package sketchPad;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Window extends JPanel {
	
	public Window() {
		setToolTipText("It's a Window!!!! WOAH!!!!!");
	}
	
	public Dimension getPreferredSize() {
        return new Dimension(512,512);
    }
	
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
	
}
