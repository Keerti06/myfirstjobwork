import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class SujeetFile {
	public static void main(String aa[]) throws IOException
	{
		
		//PrintWriter pw = new PrintWriter("D:\\file11.txt");
	 BufferedReader br1 = new BufferedReader(new FileReader("D:\\file11.txt"));
	 String line1 = br1.readLine();
	 StringBuilder  stringBuilder = new StringBuilder();
	    String ls = System.getProperty("line.separator");
	    stringBuilder.append(line1);
        stringBuilder.append(ls);
	 while(line1!=null)
	 {
		// BufferedReader br2 = new BufferedReader(new FileReader("D:\\file11.txt"));
		
	 }
}
}