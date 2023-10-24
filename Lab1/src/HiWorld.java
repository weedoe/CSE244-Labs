//To create a new project: File -> New -> Java Project
//To create a source file: Right click src -> New -> Class, add a name and check public static void main(String[] args)
//To run: Run -> Run -> OK
import java.util.Scanner;
public class HiWorld
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Please enter your name: ");
        String name = sc.nextLine ();
        //Take student name and assign to variable name
        System.out.println ("Please enter your college number: ");
        String number = sc.nextLine ();
        //Take college number and assign to variable number
        System.out.println ("Hello World, from: " + name);
        System.out.println("College number is: " + number);
        //Prints both the variables collected.
        sc.close();
        //Ends the scanner
    }
}