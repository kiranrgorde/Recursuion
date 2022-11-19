package Stringusingrecursion;

public class StringToArray
{

    public static void main(String[] args)
    {
	String s="hefShine";
	
	char[] ca=new char[s.length()];
	
	iloop(0,ca,s);
	print(ca,0);

    }

    private static void print(char[] ca, int i)
    {
	if(i<ca.length)
	{
	    System.out.print(ca[i]+" ");
	    i++;
	    print(ca, i);
	}
	
    }

    private static void iloop(int i, char[] ca, String s)
    {
	if(i<ca.length)
	{
	    ca[i]=s.charAt(i);
	    i++;
	    iloop(i, ca, s);
	}
	
    }

}
