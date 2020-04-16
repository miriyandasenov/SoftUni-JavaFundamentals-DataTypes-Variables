import java.util.Scanner;

public class Lab2
{

	public static void main(String[] args)
	{
		
			Scanner sc = new Scanner(System.in);
			
			double pounds = Double.parseDouble(sc.nextLine());
			double dollars = pounds * 1.31;
			
			System.out.printf("%.3f", dollars);
	}

}