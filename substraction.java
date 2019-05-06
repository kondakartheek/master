import java.util.Scanner;
class substraction
{
public static void main(String args[])
{
int p, q, r;
System.out.println("Enter two integers to calculate their substraction: ");

p = Integer.parseInt(args[0]);//scan data for input of integer value 
q = Integer.parseInt(args[1]);
r = p - q;
System.out.println("substraction of entered integers = "+r);
}
}
