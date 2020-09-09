import java.util.Scanner;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		
		int input = 0;
		
		System.out.println("Enter a number and I will print a perfect diamond for you!\n[-1 to exit]");
		Scanner cin = new Scanner(System.in);
		
		
		while(input != -1)
		{
		System.out.println("Enter a number: ");
		input = cin.nextInt();
		Diamond diamond = new Diamond(input);
		}
	}
}