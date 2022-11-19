package Stringusingrecursion;

public class Freq
{

    public static void main(String[] args)
    {

	String s = "aabbcc";
	iloop(0, s);
    }

    private static void iloop(int i, String s)
    {
	if (i < s.length())
	{

	    int cnt = 0;
	    cnt = loopj(0, i, s, cnt);
	    if (cnt == 0)
	    {
		int count = 0;
		for (int j = 0; j < s.length(); j++)
		{
		    if (s.charAt(i) == s.charAt(j))
		    {
			count++;
		    }

		}
		System.out.println(s.charAt(i) + " " + count);
	    }
	    iloop(++i, s);
	}

    }

    private static int loopj(int j, int i, String s, int cnt)
    {
	if (j < i)
	{

	    if (s.charAt(i) == s.charAt(j))
	    {
		cnt++;

	    }
	    return loopj(++j, i, s, cnt);
	}
	return cnt;

    }

}
