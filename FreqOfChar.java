package Stringusingrecursion;
public class FreqOfChar
{
    // StartOfMainMethod
    public static void main(String[] args)
    {
	String s1 = "aabbcc";
	myCode(s1);
    }

    // EndOfMainMethod
    private static void myCode(String s1)
    {
	iloop(0, s1);
    }

    private static void iloop(int i, String s1)
    {
	if (i < s1.length())
	{
	    int cnt = 0;
	    int j = 0;
	    cnt = jloop(j, i, s1, cnt);
	    iloop(++i, s1);
	    if (cnt == 0)
	    {
		int freq = 0;
		freq = jloop2(0, i, s1, freq);
		System.out.println(s1.charAt(i) + " " + freq);
	    }
	}
    }

    private static int jloop(int j, int i, String s1, int cnt)
    {
	if (j < i)
	{
	    if (s1.charAt(i) == s1.charAt(j))
		cnt++;
	    return jloop(++j, i, s1, cnt);
	}
	return cnt;
    }

    private static int jloop2(int j, int i, String s1, int freq)
    {
	if (j < s1.length())
	{
	    if (s1.charAt(i) == s1.charAt(j))
	    {
		freq++;
	    }
	    return jloop2(++j, i, s1, freq);
	}
	return freq;
    }
}
