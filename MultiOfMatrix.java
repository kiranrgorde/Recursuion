package recursion;

public class MultiOfMatrix
{

    public static void main(String[] args)
    {
	int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	
	int[][]c=new int[a.length][b[0].length];
	
	iloop(0,a,b,c);
	print1(0,c);
	
    }

    private static void print1(int i, int[][] c)
    {
	if(i<c.length)
	{
	    print2(i,0,c);
	    System.out.println();
	    print1(++i, c);
	}
	
    }

    private static void print2(int i, int j, int[][] c)
    {
	if(j<c.length)
	{
	    System.out.print(c[i][j]+" ");
	    print2(i, ++j, c);
	}
	
    }

    private static void iloop(int i, int[][] a, int[][] b, int[][] c)
    {
	if(i<c.length)
	{
	    jloop(i,0,a,b,c);
	    iloop(++i, a, b, c);
	}
	
    }

    private static void jloop(int i, int j, int[][] a, int[][] b, int[][] c)
    {
	if(j<c.length)
	{
	    kloop(i,j,0,a,b,c);
	    jloop(i, ++j, a, b, c);
	}
	
    }

    private static void kloop(int i, int j, int k, int[][] a, int[][] b, int[][] c)
    {
	if(k<b.length)
	{
	    c[i][j]=c[i][j]+a[i][k]*b[k][j];
	    kloop(i, j, ++k, a, b, c);
	}
	
    }

}
