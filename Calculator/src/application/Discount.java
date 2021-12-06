package application;

public class Discount {
	public float calculateDiscount(float amount, float percentage)
	{
		percentage=percentage/100;
		float temp=amount*percentage;
		return amount-temp;
	}
	public float calculateSavedAmount(float amount, float percentage)
	{
		percentage=percentage/100;
		float temp=amount*percentage;
		return temp;
	}
}
