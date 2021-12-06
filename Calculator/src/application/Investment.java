package application;

public class Investment {
	double CalculateAmount(double am, double ints, double dur)
	{
		double temp=ints/100;
		temp=1+temp;
		double res=Math.pow(temp, dur);
		res=res-1;	
		return am*res;
	}
}
