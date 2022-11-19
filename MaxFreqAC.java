package Stringusingrecursion;

public class MaxFreqAC
{
    public static void main(String[] args)
    {
	String s1 = "aabcbaasb";
	int max = Integer.MIN_VALUE;
	char ch = 0;
	Pair pair=null;
	pair=iloop(0, s1, max, ch);
	System.out.println(pair.ch +" "+pair.max);

    }

    private static Pair iloop(int i, String s1, int max, char ch)
    {
	if (i < s1.length())
	{
	    int cnt = 0;
	    cnt = jloop(i, 0, cnt, s1);
	    if (cnt == 0)
	    {
		int freq = 0;
		freq = jloop2(freq, 0, i, ch, max, s1);
		if (freq > max)
		{
		    max = freq;
		    ch = s1.charAt(i);
		}
	    }
	    return iloop(++i, s1, max, ch);
	}	
	Pair pair=new Pair(max,ch);
	return pair;
    }
    private static int jloop2(int freq, int j, int i, char ch, int max, String s1)
    {
	if (j < s1.length())
	{
	    if (s1.charAt(i) == s1.charAt(j))
	    {
		freq++;
	    }
	    return jloop2(freq, ++j, i, ch, max, s1);

	}
	return freq;
    }
    private static int jloop(int i, int j, int cnt, String s1)
    {
	if (j < i)
	{
	    if (s1.charAt(i) == s1.charAt(i))
	    {
		cnt++;
	    }
	    return jloop(i, ++j, cnt, s1);
	}
	return cnt;
    }
}

class Pair
{
    int max=0;
    char ch=0;
    public Pair(int max, char ch)
    {
	super();
	this.max = max;
	this.ch = ch;
    }
 }
