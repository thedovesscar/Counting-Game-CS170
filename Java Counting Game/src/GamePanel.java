import java.awt.Color;

import javax.swing.JPanel;

/**
 * @author Gurmehar
 */
public class GamePanel extends JPanel {
	
	/**
	 * default serial
	 */
	private static final long serialVersionUID = 1L;
	
	MenuPanel mpp;
	GameplayPanel gpp;
	ButtonPanel bpp;
	
	GamePanel(){
		mpp = new MenuPanel();
		gpp = new GameplayPanel();
		bpp = new ButtonPanel();
		
		setBackground(Color.GREEN);
		mpp.setBackground(Color.RED);
		gpp.setBackground(Color.BLUE);
		bpp.setBackground(Color.CYAN);
		
		add(mpp);
		add(gpp);
		add(bpp);
		
	} //end GAMEPANEL constructor
	
} //end class
