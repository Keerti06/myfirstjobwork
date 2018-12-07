import java.util.Scanner;

public class Sutapa {

	public static int[] prime= {67,71,73,79,83,89};
	public static int c=0;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			int a=arr[i];
			for(int j=0;j<prime.length;j++)
			{
				if(a==prime[j])
				{
					c++;	
				}
			}
			if(c==0)
			{			
				check(a,i,arr);		
			}
			c=0;
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]);
		}
	}
	public static void check(int a,int i,char arr[])
	{
		if(a<67)
		{
			arr[i]=(char)(67);
		}
		else 
			if(a==90)
			{
				arr[i]=(char)(prime[5]);
			}
			else
			{
				for(int m=0;m<prime.length-1;m++)
				{
					if(prime[m]<a&&a<prime[m+1])
					{
						if(a-prime[m]>prime[m+1]-a)
						{			
							arr[i]=(char) (prime[m+1]);
						}
						else if(a-prime[m]<prime[m+1]-a)
						{					
							arr[i]=(char) (prime[m]);
						}
						else
						{					
							arr[i]=(char) (prime[m]);
						}
					}
				}
			}
	}
}
