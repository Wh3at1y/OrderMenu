package menu.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class OperationPanel extends JPanel
	{
		private SpringLayout baseLayout;
		private JButton opButton;
		private JButton changeSizeButton;
		private JButton changeIngredientButton;
		private JButton editButton;
		private JButton discountButton;
		private JButton pastBuysButton;
		private JButton payButton;
		
		public OperationPanel()
		{
			baseLayout = new SpringLayout();
			opButton = new JButton("Operator Options");
			changeSizeButton = new JButton("Change Size");
			changeIngredientButton = new JButton("Change Ingredients");
			editButton = new JButton("More Edits");
			discountButton = new JButton("Discounts");
			pastBuysButton = new JButton("Past Buys");
			payButton = new JButton("Pay");
			
			buildPanel();
			buildPlacements();
			buildListeners();
		}
		
		private void buildPanel()
		{
			setPreferredSize(new Dimension(200,700));
			setBackground(new Color(187, 243, 185));
			setLayout(baseLayout);
			
			add(opButton);
			add(changeSizeButton);
			add(changeIngredientButton);
			add(editButton);
			add(discountButton);
			add(pastBuysButton);
			add(payButton);
		}
		
		private void buildPlacements()
		{
			baseLayout.putConstraint(SpringLayout.NORTH, payButton, 6, SpringLayout.SOUTH, discountButton);
			baseLayout.putConstraint(SpringLayout.WEST, payButton, 0, SpringLayout.WEST, opButton);
			baseLayout.putConstraint(SpringLayout.SOUTH, payButton, 92, SpringLayout.SOUTH, discountButton);
			baseLayout.putConstraint(SpringLayout.EAST, payButton, 0, SpringLayout.EAST, opButton);
			baseLayout.putConstraint(SpringLayout.NORTH, pastBuysButton, 6, SpringLayout.SOUTH, changeSizeButton);
			baseLayout.putConstraint(SpringLayout.SOUTH, pastBuysButton, -420, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.NORTH, changeIngredientButton, 6, SpringLayout.SOUTH, pastBuysButton);
			baseLayout.putConstraint(SpringLayout.WEST, pastBuysButton, 0, SpringLayout.WEST, opButton);
			baseLayout.putConstraint(SpringLayout.EAST, pastBuysButton, -10, SpringLayout.EAST, this);
			baseLayout.putConstraint(SpringLayout.NORTH, discountButton, 6, SpringLayout.SOUTH, editButton);
			baseLayout.putConstraint(SpringLayout.WEST, discountButton, 0, SpringLayout.WEST, opButton);
			baseLayout.putConstraint(SpringLayout.SOUTH, discountButton, 92, SpringLayout.SOUTH, editButton);
			baseLayout.putConstraint(SpringLayout.EAST, discountButton, 0, SpringLayout.EAST, opButton);
			baseLayout.putConstraint(SpringLayout.NORTH, editButton, 6, SpringLayout.SOUTH, changeIngredientButton);
			baseLayout.putConstraint(SpringLayout.WEST, editButton, 0, SpringLayout.WEST, opButton);
			baseLayout.putConstraint(SpringLayout.SOUTH, editButton, 92, SpringLayout.SOUTH, changeIngredientButton);
			baseLayout.putConstraint(SpringLayout.EAST, editButton, -10, SpringLayout.EAST, this);
			baseLayout.putConstraint(SpringLayout.WEST, changeIngredientButton, 10, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.SOUTH, changeIngredientButton, -328, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.EAST, changeIngredientButton, 0, SpringLayout.EAST, opButton);
			baseLayout.putConstraint(SpringLayout.NORTH, changeSizeButton, 6, SpringLayout.SOUTH, opButton);
			baseLayout.putConstraint(SpringLayout.WEST, changeSizeButton, 0, SpringLayout.WEST, opButton);
			baseLayout.putConstraint(SpringLayout.SOUTH, changeSizeButton, -512, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.EAST, changeSizeButton, -10, SpringLayout.EAST, this);
			baseLayout.putConstraint(SpringLayout.NORTH, opButton, 10, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, opButton, 10, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.SOUTH, opButton, -604, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.EAST, opButton, -10, SpringLayout.EAST, this);
		}
		
		private void buildListeners()
		{
			
		}
	}
