package menu.view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class OperationPanel extends JPanel
	{
		private SpringLayout baseLayout;
		private JButton firstButton;
		
		public OperationPanel()
		{
			baseLayout = new SpringLayout();
			firstButton = new JButton("Right Panel");
			
			buildPanel();
		}
		
		private void buildPanel()
		{
			setPreferredSize(new Dimension(200,900));
			setBackground(new Color(187, 243, 185));
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
