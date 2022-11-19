package recursion;

public class FindUniquePair
{

    public static void main(String[] args)
    {
	int[] a = { 1, 2, 3, 2, 3 };

	int unqcnt = 0;
	unqcnt = iloop(0, a, unqcnt);
	int[] b = new int[unqcnt];
	int index = 0;
	index = iloop2(0, a, b, index);
	print(0, b);
    }

    private static void print(int i, int[] b)
    {
	if (i < b.length)
	{
	    print2(i,0,b);
	    print(++i, b);
	}

    }

    private static void print2(int i, int j, int[] b)
    {
	if(j<b.length)
	{
	    System.out.println(b[i]+" "+b[j]);
	    print2(i, ++j, b);;
	}
    }

    private static int iloop2(int i, int[] a, int[] b, int index)
    {
	if (i < a.length)
	{
	    int cnt = 0;
	    int j = 0;
	    cnt = jloop2(i, j, a, b, cnt);
	    if (cnt == 0)
	    {
		b[index++] = a[i];
	    }
	    return iloop2(++i, a, b, index);
	}
	return index;
    }

    private static int jloop2(int i, int j, int[] a, int[] b, int cnt)
    {
	if (j < i)
	{
	    if (a[i] == a[j])
	    {
		cnt++;
	    }
	    return jloop2(i, ++j, a, b, cnt);
	}
	return cnt;
    }

    private static int iloop(int i, int[] a, int unqcnt)
    {
	if (i < a.length)
	{
	    int cnt = 0;
	    int j = 0;
	    cnt = jloop(i, j, a, cnt);
	    if (cnt == 0)
	    {
		unqcnt++;
	    }
	    return iloop(++i, a, unqcnt);
	}
	return unqcnt;
    }

    private static int jloop(int i, int j, int[] a, int cnt)
    {
	if (j < i)
	{
	    if (a[i] == a[j])
	    {
		cnt++;
	    }
	    return jloop(i, ++j, a, cnt);
	}

	return cnt;
    }

}
