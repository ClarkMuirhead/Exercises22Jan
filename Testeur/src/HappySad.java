import java.util.Scanner;

public class HappySad
{

	public static void main(String[] args)
	{
		System.out.println("How are you doing today");
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		
		char []arr=s.toCharArray();
		int happy=0;
		int sad=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]==':')&&(arr[i+1]=='-'))
			{
				if(arr[i+2]==')')
						happy++;
				else
					if(arr[i+2]=='(')
						sad++;
			}
		}
		if((sad==0)&&(happy==0))
			System.out.println("N/A");
		else
			if(happy>sad)
				System.out.println("Happy");
			else
				if(sad>happy)
					System.out.println("Sad");
				else
						System.out.println("N/A");
		
		sc.close();
	}

}