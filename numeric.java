import java.util.*;
import java.lang.*;
import java.io.*;

class numeric 
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        boolean numeric = true;

        try 
        {
            Double num = Double.parseDouble(str);
        } catch (NumberFormatException e) {
            numeric = false;
     }

        if(numeric)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
