package Stringusingrecursion;

public class EndsWithPP
{

    public static void main(String[] args)
    {
	String s1 = "abcd";
	String s2 = "d";
	if (s2.length() <= s1.length())
	{
	    int i = 0;
	    int j = s1.length() - 1;
	    int k = s2.length() - 1;
	    int cnt=0;
	    cnt=loopw(i,j,k,s1,s2,cnt);
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

    private static int loopw(int i, int j, int k, String s1, String s2, int cnt)
    {
	if(i<s2.length())
	{
	    if(s1.charAt(j)==s2.charAt(k))
	    {
		cnt++;
	    }
	    
	    return loopw(++i, --j, --k, s1, s2, cnt);
	}
	return cnt;
    }

}
