import java.util.Scanner;


public class ScoreDeBaskette
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt() * 3 + sc.nextInt() * 2 + sc.nextInt();
		int b = sc.nextInt() * 3 + sc.nextInt() * 2 + sc.nextInt();
		
		if(a > b) 
			System.out.println("A");
		else
			if(b > a) System.out.println("B");
			else
				System.out.println("T");
		sc.close();

	}

}