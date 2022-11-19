package Stringusingrecursion;

import java.math.BigInteger;

public class ToGetCharAtGivenIndex
{

    public static void main(String[] args)
    {

	String s1 = "abcd";
	int index = 3;
	char ch = 0;
	ch = loopi(0, s1, index,ch);
	//System.out.println(ch);

    }

    private static char loopi(int i, String s1, int index,char ch)
    {

	if (i < s1.length())
	{
	    if(i==index)
	    {
		return ch=s1.charAt(i);
	    }
	    return loopi(++i, s1, index, ch);
	}
	
	return ch;
    }

}
