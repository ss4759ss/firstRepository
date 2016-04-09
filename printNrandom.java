import java.util.Scanner;
import java.util.Random;

public class printNrandom {
public static void main (String [] args )
{
	Scanner kb = new Scanner(System.in);
	Random rd = new Random();
	System.out.println ( " type in any number   :   " );

	int N = kb.nextInt();
	
	
	for( int i = 0; i <N; i++)
{
	System.out.println( rd.nextDouble ());
}
}
} 
