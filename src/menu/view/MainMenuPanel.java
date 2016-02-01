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
		
		public MainMenuPanel()
		{
			itemPanel = new ItemSelectionPanel();
			baseLayout = new SpringLayout();
			recipePanel = new RecipePanel();		
			moreOptions = new OperationPanel();
			foodPanel = new FoodButtonsPanel();

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
		}
		
		private void buildPlacements()
		{
			baseLayout.putConstraint(SpringLayout.WEST, itemPanel, 0, SpringLayout.EAST, recipePanel);
			baseLayout.putConstraint(SpringLayout.WEST, recipePanel, 0, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.WEST, foodPanel, 0, SpringLayout.EAST, recipePanel);
			baseLayout.putConstraint(SpringLayout.SOUTH, foodPanel, 0, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, moreOptions, 0, SpringLayout.EAST, itemPanel);
		}
		
		private void buildListeners()
		{
			
		}
	}
