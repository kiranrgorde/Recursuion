package Stringusingrecursion;

public class EndsWith
{

    public static void main(String[] args)
    {
	String s1 = "abcdefghi";
	String s2 = "abcd";

	boolean result1 = s1.endsWith(s2);
	System.out.println(result1);


	int i = s1.length() - 1;
	int j = s2.length() - 1;
	
	
	boolean result2 = loopw(i,j,s1,s2);
	System.out.println(result2);
   


    }

    private static boolean loopw(int i, int j, String s1, String s2)
    {
	if (s2.length() > s1.length())
	{
	    return false;
	}
	if(j>=0)
	{
	    if (s1.charAt(i) != s2.charAt(j))
	    {
		return false;
	    }
	    i--;
	    j--;
	    return loopw(i, j, s1, s2);
	}
	return true;
	
    }
}
