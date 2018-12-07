import java.util.Scanner;
public class Jayatri {
	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		String arr=s.next();
		char[] t = arr.toCharArray();
		for(int i=0;i<t.length-1;i++)
		{
			for(int j=i+1;j<t.length;j++)
			{
				a=i;
				b=j;
				while(t[a]==t[b])
				{
					if((b-a)==2||(b-a)==1)
					{
						for(int k=0;k<i;k++)
						{
							System.out.print(t[k]+" ");
						}

						System.out.print(" "+arr.substring(i,j+1)+" ");

						for(int k=j+1;k<arr.length();k++)
						{
							System.out.print(t[k]+" ");
						}
						System.out.println();
						break;
					}
					else 
					{
						a++;
						b--;
					}
				}
				a=0;
				b=0;
			}
		}
	}
}
