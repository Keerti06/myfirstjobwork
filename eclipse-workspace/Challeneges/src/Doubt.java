
class first {
	int a = 5;
	void g()
	{System.out.println("first class");}
	void nm()
	{System.out.println("second of first");}
}
class hello extends first
{
	static int a = 6;
	void g()
	{System.out.println("hello class");}

}

public class Doubt
{

	public static void main(String[] args) {
		first o=new hello();
		o.g();
		System.out.println(o.a);
	}
}

