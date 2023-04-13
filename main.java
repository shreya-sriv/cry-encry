import java.io.*;
import java.util.Scanner;
public class main{
long pass=0;
String ans,backup;
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    long a,i=0,temp,len;
    String str;
    char x;
    while(true)
    {
        i=0,pass=0;
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        //formatting title
        System.out.println("\t\t\t DATA ENCRYPTION/DECRYPTION SOFTWARE v1.00\n\n\n");
        System.out.println("Choose from one of the options below : \n\n\n");
        System.out.println(" 1. Encryption of a text \n");
        System.out.println(" 2. Decryption of a text \n");
        System.out.println(" 3. Exit \n\n\n\t");
        a=sc.nextLong();
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        if(a==1)
        {
            System.out.println("Choose from one of the options below : \n\n\n");
            System.out.println(" 1. Enter a text \n");
            System.out.println(" 2. Choose a .txt or .dat (binary) file by giving its name and extension \n\n\n \t");

            a=sc.nextLong();
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
            if(a==1)
            {
                System.out.println("Enter your text below : \n");
                str=sc.nextLine();
                ans=encrypt(str);
            }
            else if(a==2)
            {
                String f;
                System.out.println("Enter the Filename(with extension).\n\n\t");
                f=sc.nextLine();
                
            }
        }

    }
}
}