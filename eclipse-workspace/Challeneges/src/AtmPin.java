import java.math.BigInteger;
import java.util.Scanner;

public class AtmPin {
	public static int count=0;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();

		/*	while((t--)!=0)
		{
			int n=s.nextInt();
			int[] arr=new int[n];
			BigInteger possible=new BigInteger("1");
			int q=10;
			while(n--!=0)
			{
				//possible=possible*10;
				 possible = possible.multiply(BigInteger.valueOf(q));
			}
			System.out.println(possible);

		}*/
while(t--!=0)
{
	int n=s.nextInt();
	int a=0,d=0;
	int[] arr=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=0;
	}
while(n--!=0)
{
while(a!=9)
{
	palindrome(arr,0,n);
	arr[d]=a++;
}


}

}


	}
	public static void palindrome(int arr[],int i,int n)
	{
		if(arr[i]==arr[n-1]&&(((n-1)-i)!=1)||(((n-1)-i)!=2))
		{
			if((((n-1)-i)!=1)||(((n-1)-i)!=2))
			{
				count++;
			}
			else
			{
			palindrome(arr,i+1,n-1);
		}
			}
		
			
	}
		

}
