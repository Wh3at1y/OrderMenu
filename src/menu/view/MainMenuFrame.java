package menu.view;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class MainMenuFrame extends JFrame
	{
		private MainMenuPanel basePanel;
		private DefaultLookAndFeel setLook;
		private ItemSelectionPanel selectionItems;
		
		public MainMenuFrame()
		{
			setLook = new DefaultLookAndFeel();
			basePanel = new MainMenuPanel();
			selectionItems = new ItemSelectionPanel();
			buildFrame();
		}
		
		private void buildFrame()
		{
			this.setLook.setTheLook();
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			this.setResizable(false);
			this.setContentPane(basePanel);
			this.setSize(1100,700);
			this.setTitle("Main Menu");
			this.setVisible(true);
		}
	}
