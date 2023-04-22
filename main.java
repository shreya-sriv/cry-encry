import java.io.*;
import java.util.Scanner;
import java.io.File;
public class main{
 static long pass=0;
static String ans,backup;
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    long i=0,temp,len;
    int a=0;
    String str;
    char x;
    while(true)
    {
        i=0 ; pass=0;
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        //formatting title
        System.out.println("\t\t\t DATA ENCRYPTION/DECRYPTION SOFTWARE v1.00\n\n\n");
        System.out.println("Choose from one of the options below : \n\n\n");
        System.out.println(" 1. Encryption of a text \n");
        System.out.println(" 2. Decryption of a text \n");
        System.out.println(" 3. Exit \n\n\n\t");
        a=sc.nextInt();
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        if(a==1)
        {
            System.out.println("Choose from one of the options below : \n\n\n");
            System.out.println(" 1. Enter a text \n");
            System.out.println(" 2. Choose a .txt or .dat (binary) file by giving its name and extension \n\n\n \t");

            a=sc.nextInt();
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
                File file=new File(f);
                try
                {
                    Scanner scanner=new Scanner(file);
                   //********************************* */
                }
                catch(IOException e)
                {
                    System.out.println("Enter a valid file name");
                    e.printStackTrace();
                    break;
                }
            }
            System.out.println("\n_________________________________________________________________\n\n"+ ans+ "\n\n" );
            System.out.println("THIS IS YOUR ENCRYPTED TEXT \n\n Choose an option from below : \n \t1. Manually copy this text. \n \t2. Save this text to a file. \n\n");
            a=sc.nextInt();
            if(a==1)
            {
                System.out.println("The text is succesfully saved in a variable named \"backup\" which is printed above, you can note it down "+char(24)+"\n\n\t");

            }
            else if (a==2)
            {
                save(ans);
            }


        }
        else if(a==2)
        {
            System.out.println("Choose from one of the options below : \n\n\n");
            System.out.println("1. Paste the text here and decrypt it.\n2. Decrypt the text saved to a file .\n\n\t");
            a=sc.nextInt();
            if(a==1)
            {
                System.out.println("\nPaste your text below "+(char)25+"\n\n\t");
                str=sc.nextLine();
                ans=encrypt(str);
                System.out.print("\nDecrypted text is below "+(char)25+"\n\n\t"+decrypt(str));
                System.out.print("\n\nTHIS IS YOUR DECRYPTED TEXT \n Choose an option from below : \n \t1. Manually copy this text. \n \t2. Save this text to a file. \n\n");
                a=sc.nextInt();
                if(a==1)
                {
                    System.out.print("The text is succesfully saved in a variable named \"backup\" which is printed above, you can note it down "+char(24)+"\n\n\t");

                }
                else if(a==2)
                {
                    save2(str);
                }
            }
            else if(a==2)
            {
                ans=decryptv2();
                System.out.println("\nDecrypted text is below "+(char)25+"\n\n\t"+ans); 
            }
            

        }
            
                
            
    }

}
}
