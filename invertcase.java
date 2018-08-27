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
		String str=sc.next();
		char[] charArray=str.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
		  if( Character.isUpperCase(charArray[i]) )
		  {
            		charArray[i]=Character.toLowerCase(charArray[i]);
            	  }
		  else if(Character.isLowerCase(charArray[i]))
		  {
            		charArray[i]=Character.toUpperCase(charArray[i]);
		  }    
		 }
		 str=new String(charArray);
		 System.out.println(str);
    
	}
}
