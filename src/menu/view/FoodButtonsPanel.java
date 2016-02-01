package menu.view;

import java.awt.*;

import javax.swing.*;

public class FoodButtonsPanel extends JPanel
	{
		private GridLayout baseLayout;
		private JButton firstButton;
		
		public FoodButtonsPanel()
		{
			baseLayout = new GridLayout();
			firstButton = new JButton("Middle Panel");
			
			buildPanel();
		}
		
		private void buildPanel()
		{
			setPreferredSize(new Dimension(600,600));
			setBackground(new Color(156, 246, 210));
			
			setLayout(baseLayout);
			add(firstButton);
		}
		
		private void buildPlacements()
		{
			
		}
		
		private void buildListeners()
		{
			
		}
	}
