import java.util.Scanner;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    String s = input.nextLine();
	    System.out.println(s);
	    StringBuilder res = new StringBuilder();
	    res.append(s);
	    System.out.println(res.reverse());
	    
	    if(check(s))
	    {
	        System.out.println("Palindrome");
	    }
	    else
	    {
	        System.out.println("Not Palindrome");
	    }
		
	}
	public static boolean check(String s)
	{
	   List<Character> list = new ArrayList<Character>();
	   for(int i=0;i<s.length();i++)
	   {
	       if(list.contains(s.charAt(i)))
	       {
	           list.remove((Character)s.charAt(i));
	       }
	       else
	       {
	           list.add(s.charAt(i));
	       }
	   }
	   
	   if(s.length()%2==0 && list.isEmpty() ||  s.length()%2==1 && list.size()==1)
	   return true;
	  
	   else
	   {
	       return false;
	   }
	    
	    
	}
}
