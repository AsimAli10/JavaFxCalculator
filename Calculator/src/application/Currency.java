package application;

public class Currency {
	double Convert(String from, String to, Double val)
	{
		double result=0;
		if(from.equals("PKR"))
		{
			if(to.equals("PKR"))
			{
				result=val;
				return result;
			}
			if(to.equals("USD"))
			{
				result=val/176.47;
				return result;
			}
			if(to.equals("EUR"))
			{
				result=val/199.35;
				return result;
			}
		}
		else if(from.equals("USD"))
		{
			if(to.equals("PKR"))
			{
				result=val*176.47;
				return result;
			}
			if(to.equals("USD"))
			{
				result=val;
				return result;
			}
			if(to.equals("EUR"))
			{
				result=val*0.89;
				return result;
			}
		}
		else if(from.equals("EUR"))
		{
			if(to.equals("PKR"))
			{
				result=val*199.36;
				return result;
			}
			if(to.equals("USD"))
			{
				result=val*1.13;
				return result;
			}
			if(to.equals("EUR"))
			{
				result=val;
				return result;
			}
		}
		return val;
	}
}
