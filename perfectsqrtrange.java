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
		int l=sc.nextInt();
		int r=sc.nextInt();
		int c=0;
		for(int i=l;i<=r;i++)
		{
			int s=(int)Math.sqrt(i);
			if(s*s==i)
			c=c+1;
		}
		System.out.println(c);
	}
}
