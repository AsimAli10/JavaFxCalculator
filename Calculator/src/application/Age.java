package application;

import java.util.StringTokenizer;

public class Age {
	int[] CalculateAge(String original, String current)
	{
		StringTokenizer st = new StringTokenizer(current);  
		int current_year=Integer.valueOf(st.nextToken("-"));
		int current_month=Integer.valueOf(st.nextToken("-"));
		int current_date=Integer.valueOf(st.nextToken("-"));
		StringTokenizer st2 = new StringTokenizer(original);
		int birth_year=Integer.valueOf(st2.nextToken("-"));
		int birth_month=Integer.valueOf(st2.nextToken("-"));
		int birth_date=Integer.valueOf(st2.nextToken("-"));
		int month[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (birth_date > current_date) 
		{
			current_month = current_month - 1;
			current_date = current_date + month[birth_month - 1];
		}
		if (birth_month > current_month)
		{
			current_year = current_year - 1;
			current_month = current_month + 12;
		}
		int calculated_date = current_date - birth_date;
		int calculated_month = current_month - birth_month;
		int calculated_year = current_year - birth_year;
		int[] finalarray=new int[3];
		finalarray[0]=calculated_date;
		finalarray[1]=calculated_month;
		finalarray[2]=calculated_year;
		for(int i=0;i<3;i++)
		{
			System.out.println(finalarray[i]);
		}
		return finalarray;
		
	}
}
