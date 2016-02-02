package menu.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class ItemSelectionPanel extends JPanel
	{
		private SpringLayout baseLayout;
		private JButton smoothieButton;
		private JButton foodButton;
		private JButton snackButton;
		private JButton otherButton;
		
		
		public ItemSelectionPanel()
		{
			baseLayout = new SpringLayout();
			smoothieButton = new JButton("Smoothies");
			foodButton = new JButton("Food");
			snackButton = new JButton("Snacks");
			otherButton = new JButton("Other");
			
			buildPanel();
			buildPlacements();
			buildListeners();
		}
		
		private void buildPanel()
		{
			setPreferredSize(new Dimension(600,100));
			setBackground(new Color(123, 234, 227));
			
			setLayout(baseLayout);
			add(smoothieButton);
			add(foodButton);
			add(snackButton);
			add(otherButton);
		}
		
		private void buildPlacements()
		{
			baseLayout.putConstraint(SpringLayout.NORTH, smoothieButton, 10, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, smoothieButton, 10, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.SOUTH, smoothieButton, -38, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, foodButton, 165, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.EAST, foodButton, -286, SpringLayout.EAST, this);
			baseLayout.putConstraint(SpringLayout.EAST, smoothieButton, -6, SpringLayout.WEST, foodButton);
			baseLayout.putConstraint(SpringLayout.NORTH, foodButton, 10, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.SOUTH, foodButton, 0, SpringLayout.SOUTH, smoothieButton);
			baseLayout.putConstraint(SpringLayout.NORTH, snackButton, 0, SpringLayout.NORTH, smoothieButton);
			baseLayout.putConstraint(SpringLayout.WEST, snackButton, 6, SpringLayout.EAST, foodButton);
			baseLayout.putConstraint(SpringLayout.SOUTH, snackButton, 0, SpringLayout.SOUTH, smoothieButton);
			baseLayout.putConstraint(SpringLayout.EAST, snackButton, -131, SpringLayout.EAST, this);
			baseLayout.putConstraint(SpringLayout.NORTH, otherButton, 0, SpringLayout.NORTH, smoothieButton);
			baseLayout.putConstraint(SpringLayout.WEST, otherButton, 6, SpringLayout.EAST, snackButton);
			baseLayout.putConstraint(SpringLayout.SOUTH, otherButton, 0, SpringLayout.SOUTH, smoothieButton);
			baseLayout.putConstraint(SpringLayout.EAST, otherButton, -10, SpringLayout.EAST, this);
		}
		
		private void buildListeners()
		{
			
		}
	}
