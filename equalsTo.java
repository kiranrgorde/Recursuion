package Stringusingrecursion;

public class equalsTo
{

    public static void main(String[] args)
    {
	String s1 = "hefshine";
	String s2 = "hefshine";

	boolean result = iloop(0, s1, s2);
	System.out.println(result);

    }

    private static boolean iloop(int i, String s1, String s2)
    {
	if (s1.length() != s2.length())
	    return false;
	
	if (i < s1.length())
	{
	    if (s1.charAt(i) != s2.charAt(i))
		return false;

	    i++;
	    return iloop(i, s1, s2);
	}
	return true;
    }

}
