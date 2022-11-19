package recursion;

public class FirstMax2D
{

    public static void main(String[] args)
    {
	int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	
	int max=0;
	max=loopI(0,a,max);
	System.out.println(max);
	

    }

    private static int loopI(int i, int[][] a, int max)
    {
	if(i<a.length)
	{
	    max=loopJ(0,i,a,max);
	    
	   return loopI(++i, a, max);
	}
	return max;
    }

    private static int loopJ(int j,int i, int[][] a, int max)
    {
	if(j<a.length)
	{
	    if(a[i][j]>max)
	    {
		max=a[i][j];
	    }
	  return loopJ(++j,i, a, max);
	}
	return max;
    }

}
