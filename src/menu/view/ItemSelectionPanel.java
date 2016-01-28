package menu.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class ItemSelectionPanel extends JPanel
	{
		private SpringLayout baseLayout;
		private JButton firstButton;
		
		public ItemSelectionPanel()
		{
			baseLayout = new SpringLayout();
			firstButton = new JButton("This in the top panel");
			buildPanel();
		}
		
		private void buildPanel()
		{
			setPreferredSize(new Dimension(800,100));
			setBackground(new Color(123, 234, 227));
			
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
