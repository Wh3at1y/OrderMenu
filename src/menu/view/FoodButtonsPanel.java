package menu.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class FoodButtonsPanel extends JPanel
	{
		private SpringLayout baseLayout;
		private JButton firstButton;
		
		public FoodButtonsPanel()
		{
			baseLayout = new SpringLayout();
			firstButton = new JButton("Middle Panel");
			buildPanel();
		}
		
		private void buildPanel()
		{
			setPreferredSize(new Dimension(600,700));
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
