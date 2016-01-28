package menu.view;

import java.awt.*;

import javax.swing.*;

public class MainMenuPanel extends JPanel
	{
		private SpringLayout baseLayout;
		private ItemSelectionPanel itemPanel;
		private RecipePanel recipePanel;
		private OperationPanel moreOptions;
		private FoodButtonsPanel foodPanel;
		private JButton firstButton;
		
		public MainMenuPanel()
		{
			itemPanel = new ItemSelectionPanel();
			baseLayout = new SpringLayout();
			
			recipePanel = new RecipePanel();
			
			moreOptions = new OperationPanel();
			foodPanel = new FoodButtonsPanel();
			baseLayout.putConstraint(SpringLayout.NORTH, foodPanel, 0, SpringLayout.SOUTH, itemPanel);
			baseLayout.putConstraint(SpringLayout.WEST, foodPanel, 0, SpringLayout.EAST, recipePanel);
			firstButton = new JButton("This in the main panel");

			buildPanel();
			buildPlacements();
		}
		
		private void buildPanel()
		{
			setBackground(Color.black);
			setLayout(baseLayout);
			add(foodPanel);
			add(recipePanel);
			add(moreOptions);
			add(itemPanel);
			add(firstButton);
		}
		
		private void buildPlacements()
		{
			baseLayout.putConstraint(SpringLayout.EAST, moreOptions, 0, SpringLayout.EAST, this);
			baseLayout.putConstraint(SpringLayout.WEST, itemPanel, 0, SpringLayout.EAST, recipePanel);
		}
		
		private void buildListeners()
		{
			
		}
	}
