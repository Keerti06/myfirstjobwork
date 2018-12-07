

import java.util.Scanner;

public class NeuralNetwork {
public static int o;
	public static void main(String[] args) {
		int even=0,odd=0,f;
	Scanner s=new Scanner(System.in);
	System.out.println("enter min user");
	int usermin=s.nextInt();
	System.out.println("enter max user");
	int usermax=s.nextInt();
	System.out.println("enter no of layers");
	int layer=s.nextInt();
	int[] weight=new int[layer];
	int[] bais=new int[layer];
	int[] output=new int[(usermax-usermin)+1];
	for(int i=0;i<layer;i++)
	{
		System.out.println("enter weight of "+i+" layer");
		weight[i]=s.nextInt();
		System.out.println("enter bais of "+i+" layer");
		bais[i]=s.nextInt();
	}
f=usermin;
	o=usermin;
	
	for(int j=0;j<(usermax-usermin)+1;j++)
	{
		
		for(int k=0;k<layer;k++)
		{
			
		o=network(o,weight[k],bais[k]);
		}
		output[j]=o;
		
		o=++f;
		
	}
	for(int z=0;z<(usermax-usermin)+1;z++)
	{
		if(output[z]%2==0)
		{
			even++;
		}
		else
		{
			odd++;
		}
	}
	System.out.println("even: "+even+"");
	System.out.print("odd: "+odd+"");
	s.close();
	}
public static int network(int a,int b,int c)
{
	o=a*b + c;
	return o;

}

}
