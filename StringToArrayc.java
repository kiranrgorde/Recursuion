package Stringusingrecursion;

public class StringToArrayc
{

    public static void main(String[] args)
    {
	String s1="hallo";
	char[]ch=new char[s1.length()];
	
	loopi(0,s1,ch);
	print(ch,0);

    }

    private static void print(char[] ch, int i)
    {
	if(i<ch.length)
	{
	    System.out.print(ch[i]+" ");
	    print(ch, ++i);
	}
	
    }

    private static void loopi(int i, String s1, char[] ch)
    {
	if(i<s1.length())
	{
	    ch[i]=s1.charAt(i);
	    loopi(++i, s1, ch);
	}
	
    }

}
