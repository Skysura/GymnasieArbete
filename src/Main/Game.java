package Main;

import javax.swing.JFrame;

public class Game {


	private String TITLE = "Project Super Mega Figher 3000";
	
	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setContentPane(new GamePanel());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.pack();
		window.setResizable(false);
	}

}
