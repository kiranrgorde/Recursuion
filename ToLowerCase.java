package Stringusingrecursion;

public class ToLowerCase
{

    public static void main(String[] args)
    {

	String s1 = "B H A V E S H";

	String s2 = "";
	s2 = loopi(0, s2, s1);
	System.out.println(s2);

    }

    private static String loopi(int i, String s2, String s1)
    {

	if (i < s1.length())
	{
	    if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')
	    {
		s2+=(char)(s1.charAt(i)+32);
	    }
	    else
	    {
		s2+=s1.charAt(i);
	    }
	    return loopi(++i, s2, s1);
	}
	return s2;
    }

}
