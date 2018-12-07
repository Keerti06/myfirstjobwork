import java.util.Arrays;
import java.util.Scanner;

public class Abhishek {
	static Scanner s=new Scanner(System.in);
	static String str=s.nextLine();
	static int p,q,count=0,len,max;
	static int[] l=new int[2000];
	static char a,b,m=0;
	public static void main(String[] args) {
		repeat();
		Arrays.sort(l);
		max=l[l.length-1];
		System.out.println(max);
		repeat();
	}

	static void repeat()
	{
		for(int i=0;i<str.length();i++)
		{
			for(int j=str.length()-1;j>i;j--)
			{
				p=i;
				q=j;
				while((str.charAt(p)==str.charAt(q)) && p<q) 
				{
					q--;
				}
				a=str.charAt(p);
				b=str.charAt(q);
				len=(q-p)+1;			
				while((str.charAt(p)==a || str.charAt(p)==b) && (p!=q))
				{
					count++;
					p++;
				}
				if(count+1==len)
				{
					l[m]=len;
					m++;
					if(len==max)
					{					
						System.out.println(max);
						for(int k=i;k<=j;k++)
						{
							System.out.print(str.charAt(k));
						}
						System.out.println();				
					}
				}
				count=0;
			}
		}
	}
}	
