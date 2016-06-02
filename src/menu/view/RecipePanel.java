package menu.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class RecipePanel extends JPanel
	{
		
		private DefaultFont setFont;
		private SpringLayout baseLayout;

		private ArrayList<String> recipeList;
		private JTextArea showRecipe;
		private JButton printButton;
		private JButton deleteButton;
		
		public RecipePanel(MainMenuPanel mainPanel)
		{
			
			setFont = new DefaultFont();
			setFont.setUIFont(new FontUIResource(new Font("Century Gothic", 0, 20)));
			
			baseLayout = new SpringLayout();

			recipeList = new ArrayList<String>();			
			showRecipe = new JTextArea("Order:");
			showRecipe.setEditable(false);
			
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
		
		public void setRecipeText(String addToRecipe)
		{
			recipeList.add(addToRecipe);
			showRecipe.setText("Order:\n");
			for(String printWords : recipeList)
				{
					showRecipe.append(printWords + "\n");
				}
		}
	}
