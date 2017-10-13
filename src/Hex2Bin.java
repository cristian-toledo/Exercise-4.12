import java.util.Scanner;

/*
 * Chapter 4 Exercise 12:
 *
 * (Hex to binary)
 * Write a program that prompts the user to enter a hex digit
 * and displays its corresponding binary number.
 * Cristian Toledo
 * Due:10-15-17
 * CSC201
 */


public class Hex2Bin
{
    public static int hex2decimal(String s)
    {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
    public static void main(String args[])
    {
        String hexdecnum;
        int decnum, i=1, j;
        int binnum[] = new int[100];
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Hexadecimal Number : ");
        hexdecnum = scan.nextLine();

        /* converts the hexadecimal to decimal */

        decnum = hex2decimal(hexdecnum);

        /* converts the decimal to binary */

        while(decnum != 0)
        {
            binnum[i++] = decnum%2;
            decnum = decnum/2;
        }

        System.out.print("The binary equivalent is :\n");
        for(j=i-1; j>0; j--)
        {
            System.out.print(binnum[j]);
        }
    }
}