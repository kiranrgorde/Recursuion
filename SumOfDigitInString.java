package Stringusingrecursion;

public class SumOfDigitInString
{

    public static void main(String[] args)
    {
	String s1="fsfljfs0erre";
	int sum=0;
	sum=loopi(s1,sum,0);
	if(sum==0)
	{
	    System.out.println("no number");
	}
	else
	{
	    System.out.println(sum);
	}

    }

    private static int loopi(String s1, int sum, int i)
    {
	if(i<s1.length())
	{
	    if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
	    {
		sum+=s1.charAt(i)-48;
	    }
	    return loopi(s1, sum, ++i);
	}
	return sum;
	
    }

}
