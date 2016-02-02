package menu.view;

import java.awt.*;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.event.*;

public class FoodButtonsPanel extends JPanel
	{
		private DefaultFont setFont;
		private SpringLayout baseLayout;
		
		private JTextArea showPrice;
		private JButton secretMenuButton;
		private JButton allFruitSmoothieButton;
		private JButton raspberryBlitzButton;
		private JButton sourSipSmoothieButton;
		private JButton awesomeAvacadoButton;
		private JButton appleMyNappleButton;
		private JButton wildStrawberryButton;
		private JButton virginSurfButton;
		private JButton beachPassionButton;
		private JButton cholocateYumButton;
		private JButton smoothMangoButton;
		private JButton berryBlueButton;
		private JButton pineappleSlickButton;
		
		public FoodButtonsPanel()
		{
			setFont = new DefaultFont();
			setFont.setUIFont(new FontUIResource(new Font("Corbel", 0, 19)));
			
			baseLayout = new SpringLayout();
			
			showPrice = new JTextArea();
			showPrice.setText("\nTotal Amount : ");
			
			secretMenuButton = new JButton("Secret Menu");
			secretMenuButton.setOpaque(true);
			secretMenuButton.setForeground(Color.red);
			
			allFruitSmoothieButton = new JButton("All-Fruit Smoothie");
			raspberryBlitzButton = new JButton("Raspberry Blitz");
			sourSipSmoothieButton = new JButton("Sour-Sip Smoothie");
			awesomeAvacadoButton = new JButton("Awesome Avacado");
			appleMyNappleButton = new JButton("Apple-my-Napple");
			wildStrawberryButton = new JButton("Wild Strawberry");
			virginSurfButton = new JButton("Virgin Surf");
			beachPassionButton = new JButton("Beach Passion");
			cholocateYumButton = new JButton("Chocloate Yum");
			smoothMangoButton = new JButton("Smooth Mango");
			berryBlueButton = new JButton("Berry Blue");
			pineappleSlickButton = new JButton("Pineapple Slick");
			
			
			buildPanel();
			buildPlacements();
			buildListeners();
		}
		
		private void buildPanel()
		{
			setPreferredSize(new Dimension(600,600));
			setBackground(new Color(156, 246, 210));
			setLayout(baseLayout);
			
			add(showPrice);
			add(secretMenuButton);
			add(allFruitSmoothieButton);
			add(raspberryBlitzButton);
			add(sourSipSmoothieButton);
			add(awesomeAvacadoButton);
			add(appleMyNappleButton);
			add(wildStrawberryButton);
			add(virginSurfButton);
			add(beachPassionButton);
			add(cholocateYumButton);
			add(smoothMangoButton);
			add(berryBlueButton);
			add(pineappleSlickButton);
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
			baseLayout.putConstraint(SpringLayout.NORTH, sourSipSmoothieButton, 23, SpringLayout.SOUTH, pineappleSlickButton);
			baseLayout.putConstraint(SpringLayout.WEST, pineappleSlickButton, 10, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.EAST, pineappleSlickButton, -234, SpringLayout.WEST, smoothMangoButton);
			baseLayout.putConstraint(SpringLayout.NORTH, pineappleSlickButton, 25, SpringLayout.SOUTH, beachPassionButton);
			baseLayout.putConstraint(SpringLayout.SOUTH, pineappleSlickButton, -279, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, berryBlueButton, 24, SpringLayout.EAST, beachPassionButton);
			baseLayout.putConstraint(SpringLayout.EAST, berryBlueButton, -208, SpringLayout.EAST, this);
			baseLayout.putConstraint(SpringLayout.WEST, cholocateYumButton, 25, SpringLayout.EAST, berryBlueButton);
			baseLayout.putConstraint(SpringLayout.SOUTH, appleMyNappleButton, -28, SpringLayout.NORTH, berryBlueButton);
			baseLayout.putConstraint(SpringLayout.NORTH, berryBlueButton, 1, SpringLayout.NORTH, beachPassionButton);
			baseLayout.putConstraint(SpringLayout.SOUTH, berryBlueButton, -391, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.NORTH, smoothMangoButton, 25, SpringLayout.SOUTH, cholocateYumButton);
			baseLayout.putConstraint(SpringLayout.SOUTH, smoothMangoButton, -279, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.NORTH, raspberryBlitzButton, 0, SpringLayout.NORTH, smoothMangoButton);
			baseLayout.putConstraint(SpringLayout.SOUTH, raspberryBlitzButton, 0, SpringLayout.SOUTH, smoothMangoButton);
			baseLayout.putConstraint(SpringLayout.WEST, smoothMangoButton, 210, SpringLayout.WEST, appleMyNappleButton);
			baseLayout.putConstraint(SpringLayout.EAST, smoothMangoButton, 0, SpringLayout.EAST, showPrice);
			baseLayout.putConstraint(SpringLayout.SOUTH, cholocateYumButton, -391, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.NORTH, cholocateYumButton, 1, SpringLayout.NORTH, beachPassionButton);
			baseLayout.putConstraint(SpringLayout.EAST, cholocateYumButton, -10, SpringLayout.EAST, this);
			baseLayout.putConstraint(SpringLayout.EAST, allFruitSmoothieButton, 0, SpringLayout.EAST, beachPassionButton);
			baseLayout.putConstraint(SpringLayout.NORTH, beachPassionButton, 123, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.SOUTH, beachPassionButton, -391, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, beachPassionButton, 0, SpringLayout.WEST, secretMenuButton);
			baseLayout.putConstraint(SpringLayout.EAST, beachPassionButton, -407, SpringLayout.EAST, showPrice);
			baseLayout.putConstraint(SpringLayout.NORTH, virginSurfButton, 0, SpringLayout.NORTH, sourSipSmoothieButton);
			baseLayout.putConstraint(SpringLayout.WEST, virginSurfButton, 0, SpringLayout.WEST, awesomeAvacadoButton);
			baseLayout.putConstraint(SpringLayout.SOUTH, virginSurfButton, -82, SpringLayout.NORTH, showPrice);
			baseLayout.putConstraint(SpringLayout.EAST, virginSurfButton, 0, SpringLayout.EAST, showPrice);
			baseLayout.putConstraint(SpringLayout.NORTH, wildStrawberryButton, 0, SpringLayout.NORTH, sourSipSmoothieButton);
			baseLayout.putConstraint(SpringLayout.WEST, wildStrawberryButton, 0, SpringLayout.WEST, raspberryBlitzButton);
			baseLayout.putConstraint(SpringLayout.SOUTH, wildStrawberryButton, 0, SpringLayout.SOUTH, sourSipSmoothieButton);
			baseLayout.putConstraint(SpringLayout.EAST, wildStrawberryButton, 0, SpringLayout.EAST, raspberryBlitzButton);
			baseLayout.putConstraint(SpringLayout.WEST, raspberryBlitzButton, 0, SpringLayout.WEST, appleMyNappleButton);
			baseLayout.putConstraint(SpringLayout.EAST, raspberryBlitzButton, 0, SpringLayout.EAST, appleMyNappleButton);
			baseLayout.putConstraint(SpringLayout.NORTH, appleMyNappleButton, 9, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, appleMyNappleButton, 24, SpringLayout.EAST, allFruitSmoothieButton);
			baseLayout.putConstraint(SpringLayout.EAST, appleMyNappleButton, -25, SpringLayout.WEST, awesomeAvacadoButton);
			baseLayout.putConstraint(SpringLayout.SOUTH, awesomeAvacadoButton, -504, SpringLayout.SOUTH, this);
			baseLayout.putConstraint(SpringLayout.NORTH, allFruitSmoothieButton, 0, SpringLayout.NORTH, awesomeAvacadoButton);
			baseLayout.putConstraint(SpringLayout.SOUTH, allFruitSmoothieButton, 0, SpringLayout.SOUTH, awesomeAvacadoButton);
			baseLayout.putConstraint(SpringLayout.NORTH, awesomeAvacadoButton, 9, SpringLayout.NORTH, this);
			baseLayout.putConstraint(SpringLayout.WEST, awesomeAvacadoButton, 417, SpringLayout.WEST, this);
			baseLayout.putConstraint(SpringLayout.EAST, awesomeAvacadoButton, 0, SpringLayout.EAST, showPrice);
			baseLayout.putConstraint(SpringLayout.WEST, sourSipSmoothieButton, 0, SpringLayout.WEST, secretMenuButton);
			baseLayout.putConstraint(SpringLayout.SOUTH, sourSipSmoothieButton, -82, SpringLayout.NORTH, secretMenuButton);
			baseLayout.putConstraint(SpringLayout.EAST, sourSipSmoothieButton, -417, SpringLayout.EAST, this);
			baseLayout.putConstraint(SpringLayout.WEST, allFruitSmoothieButton, 0, SpringLayout.WEST, secretMenuButton);
		}
		
		private void buildListeners()
		{
			allFruitSmoothieButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent click)
					{
						//RecipePanel news = new RecipePanel();
						RecipePanel.setRecipeText(allFruitSmoothieButton.getText());
					}
				});
		}
	}
