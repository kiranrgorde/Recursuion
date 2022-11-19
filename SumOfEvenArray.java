package recursion;

public class SumOfEvenArray
{

    public static void main(String[] args)
    {
	int[] a= {6,4,2,5,4,6};
	int sum=0;
	sum=arraySum(a,0,sum);
	System.out.println(sum);

    }

    private static int arraySum(int[] a, int i, int sum)
    {
	if(i<a.length)
	{
	    if(a[i]%2!=0)
		return sum;
	    sum+=a[i];
	    i++;
	    return arraySum(a,i,sum);
	}
	return sum;
    }

}
