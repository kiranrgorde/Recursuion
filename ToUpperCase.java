package Stringusingrecursion;

public class ToUpperCase
{

    public static void main(String[] args)
    {
	String s = "hefshine";
	String s2 = "";
	s = toUppercase(s, s2, 0);
	System.out.println(s);

    }

    private static String toUppercase(String s, String s2, int i)
    {
	if (i < s.length())
	{
	    char ch = s.charAt(i);
	    if (ch >= 'a' && ch <= 'z')
		ch = (char) (ch - 32);
	    s2 += ch;
	    i++;
	    return toUppercase(s, s2, i);
	}
	return s2;

    }

}
