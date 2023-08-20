package Hello;
import java.util.Scanner;
public class WordCount 
{
	

	public static void main(String[] args)

	{
	
		Scanner sc=new Scanner(System.in);
	
		String str;
	
		System.out.print("Enter word: ");
		str=sc.nextLine();
	
	    int i = 0;
	    for(char c : str.toCharArray())
	   {
		System.out.print(c);
		i++;
	    }
	
	    System.out.println("\n Length: " + i);
	    sc.close(); 
	}
}