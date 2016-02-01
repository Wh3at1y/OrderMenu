package menu.view;

import java.awt.*;

import javax.swing.*;

public class FoodButtonsPanel extends JPanel
	{
		private SpringLayout baseLayout;
		
		private JTextArea showPrice;
		private JButton secretMenuButton;
		
		public FoodButtonsPanel()
		{
			baseLayout = new SpringLayout();
			
			showPrice = new JTextArea();
			secretMenuButton = new JButton("Secret Menu");
			
			
			buildPanel();
			buildPlacements();
		}
		
		private void buildPanel()
		{
			setPreferredSize(new Dimension(600,600));
			setBackground(new Color(156, 246, 210));
			setLayout(baseLayout);
			
			add(showPrice);
			add(secretMenuButton);
		}
		
		private void buildPlacements()
		{
			baseLayout.putConstraint(SpringLayout.NORTH, secretMenuButton, 0, SpringLayout.NORTH, showPrice);
			baseLayout.putConstraint(SpringLayout.WEST, secretMenuButton, 10, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.SOUTH, secretMenuButton, 0, SpringLayout.SOUTH, showPrice);
			baseLayout.putConstraint(SpringLayout.EAST, secretMenuButton, 273, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.NORTH, showPrice, -87, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, showPrice, -273, SpringLayout.EAST, this);
			baseLayout.putConstraint(SpringLayout.SOUTH, showPrice, -10, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.EAST, showPrice, -10, SpringLayout.EAST, this);
		}
		
		private void buildListeners()
		{
			
		}
	}
