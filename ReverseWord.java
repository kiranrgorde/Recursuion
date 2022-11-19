package Stringusingrecursion;

public class ReverseWord
{

    public static void main(String[] args)
    {
	String s1="bikas kiran bhavesh chetan";
	String[] sa=s1.split(" ");
	String newstr="";
	newstr=iloop(0,sa,newstr);
	System.out.println(newstr);
	
    }

    private static String iloop(int i, String[] sa, String newstr)
    {
	if(i<sa.length)
	{
	    String str=sa[i];
	    char[] ca=str.toCharArray();
	    
	    int j=0;
	    int k=ca.length-1;
	    ca= wloop(j,k,ca);
	    
	    String str1=new String(ca);
	    newstr+=str1+" ";
	   return iloop(++i, sa, newstr);
	}
	return newstr;
	
    }

    private static char[] wloop(int j, int k, char[] ca)
    {
	if(j<k)
	{
	    char temp=ca[j];
	    ca[j]=ca[k];
	    ca[k]=temp;
	   return wloop(++j, --k, ca);
	}
	return ca;
    }

}
