package recursion;

public class AdditionOfMatrix
{

    public static void main(String[] args)
    {
	int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	
	int[][]c=new int[a.length][b.length];
	
	loopI(0,a,b,c);
	print(0,c);
    }

    private static void print(int i, int[][] c)
    {
	if(i<c.length)
	{
	    
	    print2(0,i,c);
	    System.out.println();
	    print(++i, c);
	}
	
    }

    private static void print2(int j, int i, int[][] c)
    {
	if(j<c.length)
	{
	    System.out.print(c[i][j]+" ");
	    
	   print2(++j, i, c);
	}
	
    }

    private static void loopI(int i, int[][] a, int[][] b, int[][] c)
    {
	if(i<a.length)
	{
	    loopJ(0,i,a,b,c);
	    loopI(++i, a, b, c);
	}
	
    }

    private static void loopJ(int j, int i, int[][] a, int[][] b, int[][] c)
    {
	if(j<a.length)
	{
	    c[i][j]=a[i][j]+b[i][j];
	    loopJ(++j, i, a, b, c);
	}
	
    }

}
