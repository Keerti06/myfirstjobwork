import java.util.Scanner;

public class Factorial {
	
int a=0;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		Factorial o=new Factorial();
		int r=o.fact(a,b,c);
		System.out.println(r);
	
}
	
	
	public int fact(int a,int b,int c)
	 {
		return a>b?(b>c ? b : (a>c ? c : a)):(b>c?(a>c?a:c):b);
	 }
	

}
