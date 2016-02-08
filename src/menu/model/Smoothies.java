package menu.model;

import menu.view.MainMenuPanel;

public class Smoothies
	{
		private double allFruitPrice;
		private double raspberryBlitzPrice;
		private double sourSipPrice;
		private double awesomeAvacadoPrice;
		private double appleMyNapplePrice;
		private double wildStrawberryPrice;
		private double virginSurfPrice;
		private double beachPassionPrice;
		
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
