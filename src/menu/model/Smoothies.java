package menu.model;

import menu.view.MainMenuPanel;

public class Smoothies
	{
		private double allFruitPrice;
		
		public Smoothies(MainMenuPanel mainPanel)
		{
			allFruitPrice = 5.25;
		}

		public double getAllFruitPrice()
			{
				return allFruitPrice;
			}

		public void setAllFruitPrice(double allFruitPrice)
			{
				this.allFruitPrice = allFruitPrice;
			}
	}
