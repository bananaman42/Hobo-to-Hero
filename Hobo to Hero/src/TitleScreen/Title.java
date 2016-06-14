package TitleScreen;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Title extends JPanel {

	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		this.setBackground(Color.MAGENTA);
		
		g.setColor(Color.WHITE);
		g.fillRect(300, 500, 1000, 150);
		g.fillRect(300, 725, 1000, 150);
		
		Font titleFont = new Font("Monospaced", Font.BOLD, 125);
		g.setFont(titleFont);
		g.drawString("Hobo to Hero", 350, 250);
		
		Font subTitleFont = new Font("Monospaced", Font.PLAIN, 100);
		g.setFont(subTitleFont);
		g.setColor(Color.MAGENTA);
		g.drawString("Play", 675, 600);
		g.drawString("Tutorial", 575, 825);
		
	}
	
}
