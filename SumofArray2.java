package recursion;

public class SumofArray2
{

    static int sum=0;
    static int[] a= {1,2,3,5};
    public static void main(String[] args)
    {
	arraysum(0);
	System.out.println(sum);

    }
    private static void arraysum(int i)
    {
	if(i<a.length)
	{
	    sum+=a[i];
	    i++;
	    arraysum(i);
	}
	
    }

}
