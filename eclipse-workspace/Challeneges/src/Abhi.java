import java.util.Scanner;

public class Abhi {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char[] arr=str.toCharArray();
		int c=0;
		for(int i=0;i<arr.length-1;i++)
		{
			c=0;
			int a=arr[i];
			if(arr[i]<10 && arr[i+1]<10 ) {
				if((arr[i]+arr[i+1])%2==0)
			{				
				c++;
			}	}		
			else if(a>=65 && a<=90 && (arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U' || arr[i]=='Y' ))
			{
				c++;				
				}
			else
			{
				c=10;
				break;
			}
			
		}
		if(c==10)
		{
			System.out.println("invalid");
		}
		else
		{
			System.out.println("valid");
		}		
	}	
}
