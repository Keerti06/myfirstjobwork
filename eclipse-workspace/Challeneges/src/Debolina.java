import java.util.Scanner;

public class Debolina {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int age=s.nextInt();
	int[] arr=new int[age];
	int count=0;
	for(int i=0;i<age;i++)
	{
		arr[i]=s.nextInt();
	}
	int max = arr[0];
	for(int i = 1; i < arr.length;i++)
	{
		if(arr[i] > max)
		{
			max = arr[i];
		}
	}
	for(int i = 1; i < arr.length;i++)
	{
		if(arr[i] == max)
		{
			count++;
		}
	}
	System.out.println(count);
	}

}
