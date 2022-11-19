package Stringusingrecursion;

import java.util.Arrays;

public class SplitUsingRecursion
{

    public static void main(String[] args)
    {
	String s1 = "abc    pres  jkl   xyz";
	
	int cnt = 0;
	cnt = iloop(s1, 0, cnt);
	String[] sa=new String[cnt+1];
	String temp="";
	int index=0;
	iloop2(sa,temp,index,0,s1);
	System.out.println(Arrays.toString(sa));

    }

    private static void iloop2(String[] sa, String temp, int index, int i,String s1)
    {
	if(i<s1.length())
	{
	    if(s1.charAt(i)!=' ')
	    {
	
		temp+=s1.charAt(i);
	    }
	    else
	    {
		sa[index++]=temp;
		temp="";
	    }
	    sa[index]=temp;

	    iloop2(sa, temp, index, ++i, s1);
	}
	
	
    }

    private static int iloop(String s1, int i, int cnt)
    {
	if (i < s1.length())
	{
	    if (s1.charAt(i) == ' ')
	    {
		cnt++;
	    }
	    return iloop(s1, ++i, cnt);
	}
	return cnt;
    }

}
