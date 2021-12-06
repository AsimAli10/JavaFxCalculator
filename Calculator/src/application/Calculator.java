package application;

public class Calculator {
	public float calculator(float n1, float n2, String operator)
	{
		switch(operator)
		{
		case"+":
			return n1+n2;
		case"-":
			return n1-n2;
		case"x":
			return n1*n2;
		case"/":
			if(n2==0)
				return 0;
			return n1/n2;
		default:
			return 0;
		}
		
	}
}
