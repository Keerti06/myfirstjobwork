import java.util.Scanner;

public class SuyashChapter {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		int flag=0,count=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}	
		for(int j=0;j<arr.length-1;j++)
		{
			if(arr[j+1]==arr[j]+1)
			{
				flag++;
			}
		}
		if(flag==arr.length-1)
		{
			System.out.println("invalid");
		}
		else
		{	
			for(int m=0;m<arr.length;m++)
			{
				count=0;			
				for(int p=0;p<arr.length;p++)
				{
					if(arr[p]==m+1)
					{
						count++;
					}
				}
				if(count==0)
				{
					System.out.println("invalid");
					break;
				}
			}
			if(count!=0)
			{
				System.out.println("valid");
			}
		}
	}
}
