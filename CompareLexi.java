package Stringusingrecursion;

public class CompareLexi
{

    public static void main(String[] args)
    {
	String s1="abcad";
	String s2="";
	System.out.println(s1.compareTo(s2));
	System.out.println(mycomparelex(s1,s2,0));
    }

    private static int mycomparelex(String s1, String s2, int i)
    {
	if(i<s1.length()&& i<s2.length())
	{
	    if(s1.charAt(i)!=s2.charAt(i))
	    {
		return s1.charAt(i)-s2.charAt(i);
	    }
	    return mycomparelex(s1, s2, ++i);
	}
	return s1.length()-s2.length();
    }

}
