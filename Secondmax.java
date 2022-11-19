package recursion;

public class Secondmax
{

    public static void main(String[] args)
    {
	int[]a ={1,3,2,5,1,77,55,44};
	
	int fmax=0;
	int smax=0;
	
	smax=loopI(0,fmax,smax,a);
	System.out.println(smax);

    }

    private static int loopI(int i, int fmax, int smax, int[] a)
    {
	if(i<a.length)
	{
	    if(a[i]>fmax)
	    {
		smax=fmax;
		fmax=a[i];
	    }
	    if(a[i]>smax && a[i]!=fmax )
	    {
		smax=a[i];
	    }
	    
	    return loopI(++i, fmax, smax, a);
	}
	return smax;
    }

}
