package recursion;

public class SumOfArrayEle
{

    public static void main(String[] args)
    {
	int[] a= {1,2,3,5};
	
	int sum=0;
	int i=0;
	sum=arraySum(a,i,sum);
	System.out.println(sum);

    }

    private static int arraySum(int[] a, int i, int sum)
    {
	if(i<a.length)
	{
	    sum+=a[i];
	    i++;
	    return arraySum(a,i,sum);
	}
	return sum;
    }

}
