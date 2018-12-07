import java.util.Scanner;

public class Rajdeep {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String date=s.nextLine();
		String[] str=date.split(":");
		String time=s.nextLine();
		if(Integer.parseInt(str[0])<=12 && Integer.parseInt(str[1])<=60 && Integer.parseInt(str[2])<=60)
		{
			if((time.equals("pm") || time.equals("PM")))
			{
				if(str[0].equals("12"))					
					System.out.print(date);
				else
				{			
					int a=Integer.parseInt(str[0])+12;	
					System.out.println(a+":"+ str[1]+":"+str[2]);
				}
			}
			else
			{
				if(str[0].equals("12") )				
					System.out.print("00:"+str[1]+":"+str[2]);			
				else
					System.out.println(date);	
			}
		}
		else
			System.out.println("invalid time");
	}
}