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
		int c=1;
		for(int i=1;i<r;i++)
		{
			if((l%i==0)&&(r%i==0))
			{
				c=i;
			}
		}
		System.out.println(c);
	}
}
