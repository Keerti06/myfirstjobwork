

import java.util.Scanner;

public class suyash {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of cups");
		int n=s.nextInt();
		System.out.println("Enter where coin is stored");
		int a=s.nextInt();
		System.out.println("Enter no of passes");
		int b=s.nextInt();
		s.close();
		int m=a;
		int p=0;
		
		if(a<=n && a!=0)
		{
			if(b!=0) {
				for(int i=0;i<b;i++) {
					int z=getRandomDoubleBetweenRange(1,n);
					System.out.println(i+1+": "+z);
					p=z;
					z=m;
					m=p;
					p=0;
				}
				System.out.println("Now coin is under "+m+" cup");
			}
			else {
				System.out.println("Now coin is under "+a+" cup");
			}
		}
		else {
			System.out.println("enter a valid cup");
		}
	}
	
	
public static int getRandomDoubleBetweenRange(int min, int max)
{
  int x =(int)((Math.random()*((max-min)+1))+min);
    return x;
}
	

}
