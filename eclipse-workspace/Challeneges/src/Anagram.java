import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	static Scanner s=new Scanner(System.in);
	static String str1=s.next();
	static char[] str=str1.toCharArray();
	static int r=s.nextInt();
	static String[] rot=new String[2*r];
	static char temp;
	static int n=0,count=0;;
	static char[] ana=new char[r];
	public static void main(String[] args) {

		for(int i=0;i<2*r;i++)
		{
			rot[i]=s.next();
		}
		for(int j=0;j<2*r;j++)
		{
			switch(rot[j])
			{
			case "L" :
			{
				ana[n]=leftRotate(str,j,rot);
				j++;
				n++;
				break;
			}

			case "R" :
			{
				ana[n]=rightRotate(str,j,rot);
				j++;
				n++;
				break;
			}
			}
		}
		if(ana.length==str.length)
		{
			Arrays.sort(str);
			Arrays.sort(ana);
			for(int i=0;i<str.length;i++)
			{
				if(str[i]==ana[i])
				{
					count++;
				}
			}
			if(count==str.length)
				System.out.println("yes");
			else
				System.out.println("no");
		}
		else
			System.out.println("no");
	}
	public static char leftRotate(char str[],int j,String rot[])
	{
		for(int k=0;k<Integer.parseInt(rot[j+1]);k++)
		{
			for(int m=0;m<str.length;m++)
			{
				if(m==0) {
					temp=str[str.length-1];
					str[str.length-1]=str[m];
				}
				else if(m==str.length-1)
					str[m-1]=temp;
				else
					str[m-1]=str[m];
			}

		}
		return str[0];
	}
	public static char rightRotate(char str[],int j,String rot[])
	{
		for(int k=0;k<Integer.parseInt(rot[j+1]);k++)
		{
			for(int m=str.length-1;m>0;m--)
			{
				if(m==str.length-1) {
					temp=str[0];
					str[0]=str[str.length-1];
				}
				else if(m==1) {
					str[m+1]=str[m];
					str[m]=temp;
				}
				else
					str[m+1]=str[m];
			}			
		}
		return str[0];
	}
}
