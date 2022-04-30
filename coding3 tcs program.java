import java.util.Scanner;  //given matrix and find the absolute matrix.

public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int r = input.nextInt();
	    int c = input.nextInt();
	    int[][]arr = new int[r][c];
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	        {
	            arr[i][j]=input.nextInt();
	        }
	    }
	    int ans1=0;
	    int ans2=0;
	    
	    for(int i=0;i<r;i++)
	    {
	        for(int j=0;j<c;j++)
	        {
	            if(i==j)
	            {
	                ans1=ans1+arr[i][j];
	                ans2 = ans2+arr[i][c-1-i];
	                
	            }
	        }
	    }
	   
	    System.out.println(ans1);
	    System.out.println(ans2);
	    System.out.println(Math.abs(ans1-ans2));
	    
		
	}
}
