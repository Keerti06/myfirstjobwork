import java.util.Scanner;
public class SuyashDays {
	static String[] week= {"mon","tues","wed","thur","fri","sat","sun"};
	static int[] count=new int[7];
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int day=s.nextInt();
		String firstDay=s.next();
		s.close();
		String weekday=new String(firstDay);
		int flag=0;
		while(day--!=0 && flag==0)
		{
			switch(weekday)
			{
			case "mon":
			{
				count[0]++;
				weekday =new  String(week[1]);
				break;
			}
			case "tues":
			{
				count[1]++;
				weekday = new String(week[2]);
				break;
			}
			case "wed":
			{
				count[2]++;
				weekday = new String(week[3]);
				break;
			}
			case "thur":
			{
				count[3]++;
				weekday = new String(week[4]);
				break;
			}
			case "fri":
			{
				count[4]++;
				weekday = new String(week[5]);
				break;
			}
			case "sat":
			{
				count[5]++;
				weekday = new String(week[6]);
				break;
			}
			case "sun":
			{
				count[6]++;
				weekday = new String(week[0]);
				break;
			}
			default:
			{System.out.println("invalid input");
			flag=1;
			break;
			}
			}	
		}
		for(int i=0;i<7;i++)
		{
			System.out.print(count[i]+" ");
		}
	}
}
