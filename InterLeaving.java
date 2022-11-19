package recursion;

import java.util.Arrays;

public class InterLeaving
{

    public static void main(String[] args)
    {
	int[] a = { 1, 2, 4, 4, 1 };
	int unqcnt = 0;
	unqcnt = loopi(0, unqcnt, a);
	int[] b = new int[unqcnt];
	int index = 0;
	loopi2(0,a,b,index);
	System.out.println(Arrays.toString(b));
    }

    private static void loopi2(int i, int[] a, int[] b,int index)
    {
	if(i<a.length)
	{
	    int cnt = 0;
	    int j=0;
	    cnt= loop2(i,j,a,cnt);
	    if (cnt == 0)
		b[index++] = a[i];
	    i++;
	    loopi2(i, a, b, index);
	}
	
    }

    private static int loop2(int i, int j, int[] a, int cnt)
    {
	if(j<i)
	{
	   if (a[i] == a[j])
		    cnt++;
	   j++;
	   return loop2(i, j, a, cnt);
	}
	return cnt;
    }

    private static int loopi(int i, int unqcnt, int[] a)
    {
	if (i < a.length)
	{
	    int cnt = 0;
	    int j=0;
	    cnt = loopj(i, j, a, cnt);
	    if (cnt == 0)
		unqcnt++;
	    i++;
	    return loopi(i, unqcnt, a);
	}
	return unqcnt;
    }

    private static int loopj(int i, int j, int[] a, int cnt)
    {
	if (j < i)
	{
	    if (a[i] == a[j])
	    {
		cnt++;
		return cnt;
	    }
	    j++;
	    return loopj(i, j, a, cnt);

	}
	return cnt;
    }

}
