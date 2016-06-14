package TitleScreen;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Title t = new Title();
		f.add(t);
		f.setSize(1600, 1600);
		f.setVisible(true);

	}

}
