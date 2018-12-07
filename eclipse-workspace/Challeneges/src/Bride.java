import java.util.Arrays;
import java.util.Scanner;

public class Bride {
	static Scanner s=new Scanner(System.in);
	static int m=s.nextInt();
	static int n=s.nextInt();
	static int[][] arr=new int[m][n];
	static int[][] c=new int[m][n];
	static int count=0,a,b,l=0,u=0,v=0,maxlen=8;
	static int[][] len=new int[3][m*n];
	public static void main(String[] args) {

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				arr[i][j]=s.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[i][j]==1)
				{
					count=0;
					c[i][j]=check(arr,i,j);
				}
			}
		}
		int max=c[0][0];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(c[i][j]>max)
					max=c[i][j];
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(c[i][j]==max)
				{
					len[u][v]=length(c,i,j);
					len[u+1][v]=i;
					len[u+2][v]=j;
					if(maxlen>len[u][v])
						maxlen=len[u][v];
					u=0;
					v++;
					l=0;
				}
			}
		}	
		for(int j=0;j<m*n;j++)
		{
			if(len[0][j]==maxlen)
			{
				System.out.println();
				System.out.println((len[1][j]+1)+":"+(len[2][j]+1)+":"+max);
			}
		}		
	}
	public static int length(int c[][],int p,int q)
	{
		while(p>0 && q>0)
		{
			l++;
			p--;
			q--;
		}
		while(p>0 && q==0)
		{
			l++;
			p--;
		}
		while(p==0 && q>0)
		{
			l++;
			q--;
		}
		return l;
	}
	public static int check(int arr[][],int i,int j)
	{
		if(i==m-1 && j==0) 
		{
			if(arr[i-1][j]==1)   {count++;}
			if(arr[i-1][j+1]==1) {count++;}
			if(arr[i][j+1]==1) {count++;}
		}
		else if(i==m-1 && j==n-1)
		{
			if(arr[i-1][j-1]==1) {count++;}
			if(arr[i-1][j]==1)   {count++;}
			if(arr[i][j-1]==1) {count++;}
		}
		else if(i==0 && j==m-1)
		{
			if(arr[i][j-1]==1) {count++;}
			if(arr[i+1][j-1]==1) {count++;}
			if(arr[i+1][j]==1) {count++;}
		}
		else if(i>0 && i<m-1 && j==0)
		{
			if(arr[i-1][j]==1)   {count++;}
			if(arr[i][j+1]==1) {count++;}
			if(arr[i+1][j]==1) {count++;}
			if(arr[i+1][j+1]==1) {count++;}
			if(arr[i-1][j+1]==1) {count++;}
		}
		else if(j>0 && j<n-1 && i==m-1)
		{
			if(arr[i-1][j]==1)   {count++;}
			if(arr[i][j-1]==1) {count++;}
			if(arr[i][j+1]==1) {count++;}
			if(arr[i-1][j+1]==1) {count++;}
			if(arr[i-1][j-1]==1) {count++;}
		}
		else if(j==n-1 && i>0 && i<m-1 )
		{
			if(arr[i][j-1]==1) {count++;}
			if(arr[i-1][j]==1) {count++;}
			if(arr[i+1][j]==1)   {count++;}
			if(arr[i-1][j-1]==1) {count++;}
			if(arr[i+1][j-1]==1) {count++;}
		}
		else if(i==0 && j>0 && j<n-1)
		{
			if(arr[i][j-1]==1) {count++;}
			if(arr[i+1][j]==1) {count++;}
			if(arr[i][j+1]==1) {count++;}
			if(arr[i+1][j-1]==1) {count++;}
			if(arr[i+1][j+1]==1) {count++;}
		}
		else if(i!=0 && j!=0){
			if(arr[i-1][j-1]==1) {count++;}
			if(arr[i-1][j]==1)   {count++;}
			if(arr[i-1][j+1]==1) {count++;}
			if(arr[i][j-1]==1) {count++;}
			if(arr[i][j+1]==1) {count++;}
			if(arr[i+1][j-1]==1) {count++;}
			if(arr[i+1][j]==1) {count++;}
			if(arr[i+1][j+1]==1) {count++;}
		}
		return count;
	}
}
