/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);	
	           	BufferdReader br=new BufferdReader(new InputstreamReader(System.in));
		System.out.println("enter the string");
		string s=br.readLine();
		char ch;
		1=s.length();
		for(int i=0;i<1;i++)
		{
			ch=s.charAt(i);
			if(Character.isuppercase(ch))
			       System.out.println(Character.toLowerCase(ch));
			else if(Character.isLowerCase(ch))
			      System.out.println(Character.toUppercase(ch));
			else
			     System.out.println(ch);
		}
			   
		}
		
}
