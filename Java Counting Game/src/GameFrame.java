import javax.swing.JFrame;

/**
 * This class is only concerned with creating the GameFrame
 * using a single call to the GamePanel.
 * @author Ervin & Gurmehar
 *
 */
public class GameFrame extends JFrame{
	
	/**
	 * default serial ID
	 */
	private static final long serialVersionUID = 1L;
	GamePanel gamePanel; 
	
	GameFrame(){
		
		super("Welcome to the Counting Game!");

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1005, 705);
		
		gamePanel = new GamePanel();
		add(gamePanel);
		

		setResizable(false);
		setVisible(true);
	}
}
