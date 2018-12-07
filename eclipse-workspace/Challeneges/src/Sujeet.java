public class Sujeet {

	public static void main(String[] args) {
		int[] arr= {2,4,4,5,4,1};
		int sum1=0,sum2=0;
		for(int i=0;i<arr.length;i++)
		{
			sum1=sum1+arr[i];
			for(int j=arr.length-1;j>i;j--)
			{
				sum2=sum2+arr[j];			
				if(sum1==sum2)
				{
					System.out.println(i);
				}			
			}
			sum2=0;
		}
	}
}
