import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    String s = input.nextLine();
	    String s1 = input.nextLine();
	    String res = " ";
	    int v=0;
	    for(int i=0;i<s.length();i++)
	    {
	        for(int j=v;j<s1.length();j++)
	        {
	            if(s.charAt(i)==s1.charAt(j))
	            {
	                res+=s.charAt(i);
	                v=j+1;
	            }
	        }
	    }
	    System.out.println(res.trim());
	    if(res.equals(s1))
	    {
	        System.out.println("true");
	    }
	    else
	    {
	        System.out.println("false");
	    }
	
	}
}
