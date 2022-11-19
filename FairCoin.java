package recursion;

public class FairCoin
{

    public static void main(String[] args)
    {
	int[]a = {1,2,3};
	int n=4;
	int cnt=meMeth(a,n,0,0,0);
	System.out.println(cnt);

    }

    private static int meMeth(int[] a, int n, int i, int cnt,int sum)
    {
	
	for (int j = i; j < a.length; j++)
	{
	    int sum2=sum+a[j];
	    if(sum2==n)
	    {
		cnt++;
		
	    }
	    else if(sum2>n)
		continue;
	    else
	    {
		cnt=meMeth(a, n, j, cnt, sum2);
	    }
	    
	}
	
	return cnt;
    }

}
