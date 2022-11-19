package Stringusingrecursion;

public class StartsWith
{

    public static void main(String[] args)
    {

	String s1 = "abcd";
	String s2 = "abc";
	
	if(s2.length()<=s1.length())
	{
	    int i=0;
	    int cnt=0;
	    cnt=loopw(i,s1,s2,cnt);
	    if(cnt==s2.length())
	    {
		System.out.println(true);
	    }
	    else
	    {
		System.out.println(false);
	    }
	    
	}
	else
	{
	    System.out.println(false);
	}

    }

    private static int loopw(int i, String s1, String s2, int cnt)
    {
	if(i<s2.length())
	{
	    if(s1.charAt(i)==s2.charAt(i))
	    {
		cnt++;
	    }
	    return loopw(++i, s1, s2, cnt);
	}
	return cnt;
    }

}
