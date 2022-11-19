package recursion;

public class LinearSearch
{

    public static void main(String[] args)
    {
	int[]a= {1,2,3,4,4,5,6};
	int ele=4;
	int cnt=0;
	int[] temp=new int[2];
	temp=iloop(0,a,ele,temp,cnt);
	if(temp[0]==0)
	{
	    System.out.println("not found");
	}
	else
	{
	    System.out.println("found element at index "+temp[1]);
	}

    }

    private static int[] iloop(int i, int[] a, int ele, int[] temp, int cnt)
    {
	if(i<a.length)
	{
	    if(a[i]==ele)
	    {
		cnt++;
		temp[0]=cnt;
		temp[1]=i;
		return temp;
		
	    }
	    temp=iloop(++i, a, ele, temp, cnt);
	}
	return temp;
    }

}
