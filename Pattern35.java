package recursion;

public class Pattern35
{
    
    public static void main(String[] args)
    {
	int i = 0;
	iloop(i);

    }
    static int cnt=0;
    private static void iloop(int i)
    {
	if (i < 5)
	{
	    int j = 0;
	    jloop(i, j);
	    System.out.println();
	    i++;
	    iloop(i);
	}
    }

    private static void jloop(int i, int j)
    {
	if (j < 5)
	{
	    if (j - i <= 0)
	    {
		System.out.print((char)(cnt++ +65));
	    } else
	    {
		System.out.print(" ");
	    }
	    j++;
	    jloop(i, j);
	}

    }

}
