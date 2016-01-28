package menu.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class RecipePanel extends JPanel
	{
		private SpringLayout baseLayout;
		private JButton firstButton;
		
		public RecipePanel()
		{
			baseLayout = new SpringLayout();
			firstButton = new JButton("This in the top panel");
			buildPanel();
		}
		
		private void buildPanel()
		{
			setPreferredSize(new Dimension(300,900));
			setBackground(new Color(190, 234, 249));
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
