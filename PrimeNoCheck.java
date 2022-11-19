package recursion;

public class PrimeNoCheck
{

    public static void main(String[] args)
    {
	int num=9;
	int cnt=0;
	cnt=iloop(num,cnt,2);
	if(cnt==0)
	    System.out.println("prime");
	else
	    System.out.println("not prime");

    }

    private static int iloop(int num, int cnt, int i)
    {
	if(i<num)
	{
	    if(num%i==0)
	    {
		cnt++;
		
	    }
	    cnt=iloop(num, cnt, ++i);
	}
	
	return cnt;
    }

}
