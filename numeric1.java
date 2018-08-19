import java.util.*;
import java.lang.*;
import java.io.*;

class numeric 
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        boolean num1 = true;

        try 
        {
            Double num = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            num1 = false;
     }

        if(num1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
