import java.util.Scanner;

public class DistanceVilles 
{

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int[] dist=new int[4];
	int [] villes= new int[5];
	
	for (int i=0; i<4; i++)
	{
		dist[i]=sc.nextInt();
	}
    villes[0]=0;
    for (int i=1;i<5;i++)
    {
    	villes[i]=villes[i-1]+dist[i-1];
    	System.out.println("-");
    	System.out.println(villes[i]);
    }
    for (int i=0;i<5;i++)
    {
    	for(int j=0;j<5;j++)
    	{
    		int distVille=Math.abs(villes[i]-villes[j]);
    		System.out.println(distVille);
    		System.out.println(" ");
    	}
    
    }
	}

}
