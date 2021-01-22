import java.util.Scanner;

public class Magic {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
int row1 = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
int row2 = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
int row3 = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
int row4 = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();

if (row1==row2 && row1==row3 && row1==row4 && row1==34 )
	
	 
	System.out.println("Magic");
else
	System.out.println("Not Magic");


	}

}
