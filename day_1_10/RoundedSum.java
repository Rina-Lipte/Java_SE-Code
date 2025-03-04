package day_1_10;

public class RoundedSum {
    public static int sumOfRoundedValues(int num1,int num2,int num3)
    {
    	/*
    	if(num1%10>=5)
    	{
    		num1=(num1/10+1)*10;
    	}
    	else
    	{
    		num1 = num1/10*10;
    	}
    	if(num2%10>=5)
    	{
    		num2=(num2/10+1)*10;
    	}
    	else
    	{
    		num2 = num2/10*10;
    	}
    	if(num3%10>=5)
    	{
    		num3=(num3/10+1)*10;
    	}
    	else
    	{
    		num3 = num3/10*10;
    	}
    	 
    	return num1+num2+num3;
    	
    	*/
    	
    	num1=((num1/10)+(num1%10)/5)*10;
    	num2=((num2/10)+(num2%10)/5)*10;
    	num3=((num3/10)+(num3%10)/5)*10;
    	return num1+num2+num3;
    	
    	
    }
}
