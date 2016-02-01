package menu.view;

import javax.swing.JFrame;

public class MainMenuFrame extends JFrame
	{
		private MainMenuPanel basePanel;
		private ItemSelectionPanel selectionItems;
		
		public MainMenuFrame()
		{
			basePanel = new MainMenuPanel();
			selectionItems = new ItemSelectionPanel();
			buildFrame();
		}
		
		private void buildFrame()
		{
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			this.setResizable(false);
			this.setContentPane(basePanel);
			this.setSize(1100,700);
			this.setTitle("Main Menu");
			this.setVisible(true);
		}
	}
