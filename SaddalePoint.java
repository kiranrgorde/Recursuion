package recursion;

public class SaddalePoint
{

    public static void main(String[] args)
    {
	int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

	iloop(0, a);

    }

    private static void iloop(int i, int[][] a)
    {
	if (i < a.length)
	{
	    jloop(i, 0, a);

	    iloop(++i, a);
	}

    }

    private static void jloop(int i, int j, int[][] a)
    {
	if (j < a.length)
	{
	    boolean smallinRow = true;
	    smallinRow = rowloop(0, a, i, j, smallinRow);
	    boolean larginCol = true;
	    larginCol = colLoop(0, a, i, j, larginCol);
	    if (smallinRow == true && larginCol == true)
	    {
		System.out.println(a[i][j]);
	    }

	    jloop(i, ++j, a);
	}

    }

    private static boolean colLoop(int row, int[][] a, int i, int j, boolean larginCol)
    {
	if (row < a.length)
	{
	    if (a[i][j] < a[row][j])
	    {
		return false;
	    }
	    return colLoop(++row, a, i, j, larginCol);
	}
	return true;
    }

    private static boolean rowloop(int col, int[][] a, int i, int j, boolean smallinRow)
    {
	if (col < a.length)
	{
	    if (a[i][j] > a[i][col])
	    {
		return false;
	    }

	    return rowloop(++col, a, i, j, smallinRow);
	}
	return true;
    }

}
