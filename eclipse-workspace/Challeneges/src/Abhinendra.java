import java.util.Scanner;

public class Abhinendra {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char[] arr=str.toCharArray();
		int sum=0;
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			int a=arr[i];
			if(arr[i]<10 && arr[i+1]<10)
			{
				sum=arr[i]+arr[i+1];
				flag=checkEven(sum);
				if(!flag)
				{
					System.out.println("invalid");
					break;
				}
			}			
			if(a>=65 && a<=90)
			{
				flag=checkVowel(arr,i);

				if(!flag)
				{
					System.out.println("invalid");
					break;
				}}
		}
		if(flag)
		{
			System.out.println("valid");
		}
	}
	public static boolean checkEven(int s)
	{
		if(s%2==0)
		{
			return true;
		}
		else
			return false;
	}
	public static boolean checkVowel(char arr[],int i)
	{
		if(arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U' || arr[i]=='Y' )
		{
			return true;
		}
		else
			return false;
	}
}
