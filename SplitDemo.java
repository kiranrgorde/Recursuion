package Stringusingrecursion;

public class SplitDemo
{

    public static void main(String[] args)
    {
	String s1="chetan bhavesh kiran vikas";
	
	int cnt=0;
	cnt=iloop(cnt,0,s1);

    }

    private static int iloop(int cnt, int i, String s1)
    {
	if(i<s1.length())
	{
	    if(s1.charAt(i)==' ')
	    {
		cnt++;
	    }
	    return iloop(cnt, ++i, s1);
	}
	return cnt;
    }

}
