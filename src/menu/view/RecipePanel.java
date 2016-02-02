package menu.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class RecipePanel extends JPanel
	{
		private SpringLayout baseLayout;
		
		private static JList showRecipe;
		private JButton printButton;
		private JButton deleteButton;
		
		public RecipePanel()
		{
			baseLayout = new SpringLayout();
			
			showRecipe = new JList();
			
			printButton = new JButton("Print Recipe");
			deleteButton = new JButton("Delete Item");
			
			buildPanel();
			buildPlacements();
			buildListeners();
		}
		
		private void buildPanel()
		{
			setPreferredSize(new Dimension(300,900));
			setBackground(new Color(190, 234, 249));
			setLayout(baseLayout);
			
			add(showRecipe);
			add(printButton);
			add(deleteButton);
		}
		
		private void buildPlacements()
		{
			baseLayout.putConstraint(SpringLayout.NORTH, deleteButton, 605, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, deleteButton, -142, SpringLayout.EAST, this);
			baseLayout.putConstraint(SpringLayout.SOUTH, deleteButton, -230, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.EAST, deleteButton, -10, SpringLayout.EAST, this);
			baseLayout.putConstraint(SpringLayout.NORTH, printButton, -295, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, printButton, 10, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.SOUTH, printButton, -230, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.EAST, printButton, 142, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.EAST, showRecipe, 0, SpringLayout.EAST, deleteButton);
			baseLayout.putConstraint(SpringLayout.SOUTH, showRecipe, -6, SpringLayout.NORTH, printButton);
			baseLayout.putConstraint(SpringLayout.NORTH, showRecipe, 10, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, showRecipe, 10, SpringLayout.WEST, this);
		}
		
		private void buildListeners()
		{
			
		}
		
		public static void setRecipeText(String addToRecipe)
		{
			showRecipe.add(addToRecipe);
		}
	}
