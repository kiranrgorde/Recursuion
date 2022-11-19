package Stringusingrecursion;

public class RemoveDuplicate
{

    public static void main(String[] args)
    {
	String s1 = "bhaveshchakor";
	String s2 = "";

	s2 = isUniqueMethod(s1, s2, 0);
	System.out.println(s2);

    }

    private static String isUniqueMethod(String s1, String s2, int i)
    {
	if (i < s1.length())
	{
	    if (isunq(i, s1, 0))
	    {
		s2 += s1.charAt(i);
	    }
	    return isUniqueMethod(s1, s2, ++i);

	}
	return s2;
    }

    private static boolean isunq(int i, String s1, int j)
    {
	if (j < i)
	{
	    if (s1.charAt(i) == s1.charAt(j))
	    {
		return false;
	    }

	    return isunq(i, s1, ++j);
	}
	return true;
    }

}
