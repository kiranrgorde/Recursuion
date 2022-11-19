package Stringusingrecursion;

public class SortLikeDictionary
{
    public static void main(String[] args)
    {
	String[] sa = { "bhavesh", "chetan", "amol", "kiran", "bandu", "anil", "vikas","wel","web" };
	iloop(0, sa);
	print(0, sa);
    }

    private static void print(int i, String[] sa)
    {
	if (i < sa.length)
	{
	    System.out.println(sa[i]);
	    print(++i, sa);
	}
    }

    private static void iloop(int i, String[] sa)
    {
	if (i < sa.length)
	{
	    int j = i + 1;
	    jloop(i, j, sa);
	    iloop(++i, sa);
	}
    }

    private static void jloop(int i, int j, String[] sa)
    {
	if (j < sa.length)
	{
	    if (iloop2(0, sa[i], sa[j]) > 0)
	    {
		String temp = sa[i];
		sa[i] = sa[j];
		sa[j] = temp;
	    }
	    jloop(i, ++j, sa);
	}
    }

    private static int iloop2(int i, String s1, String s2)
    {
	if (i < s1.length() && i < s2.length())
	{
	    if (s1.charAt(i) != s2.charAt(i))
	    {
		return s1.charAt(i) - s2.charAt(i);
	    }
	   return iloop2(++i, s1, s2);
	}
	return s1.length() - s2.length();
    }
}
