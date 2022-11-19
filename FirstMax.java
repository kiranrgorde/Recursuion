package recursion;

public class FirstMax
{

    public static void main(String[] args)
    {
	int[]a= {4,6,2,9,1,6,3};
	int max=Integer.MIN_VALUE;
	max=iloop(0,a,max);
	System.out.println(max);
	

    }

    private static int iloop(int i, int[] a, int max)
    {
	if(i<a.length)
	{
	    if(a[i]>max)
	    {
		max=a[i];
	    }
	    return iloop(++i, a, max);
	}
	return max;
    }

}
