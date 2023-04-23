import java.io.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class main{
 static int pass=0;
static String ans,backup;

public static String decrypt(String backup)
{
    int len=backup.length(),i=0;
    int temp;
    char ans2[]=new char[len];
    char x;
    while(i<len)
    {
        if(pass>50)
        {
            pass=0;
        }
       temp=backup.charAt(i);
       temp-=pass;
       x=(char)temp;
       ans2[i]=x;
       i++;
       pass++;

    }
    // ans2[len]='\0';
    return new String(ans2);

}
public static String decryptv2()
{
    Scanner sc=new Scanner(System.in);
    String f;
    System.out.println("Enter the name(with extension) of file you want to open.\n\n\t");
    f=sc.nextLine();
    // sc.close();
    File newfile=new File(f);
    try{
        Scanner sc1=new Scanner(newfile);
        while(sc1.hasNextLine())
        {
            String line=sc1.nextLine();
            // sc1.close();
           return decrypt(line);
            //*********************************/
            
        }
        
       
        
    }
    catch(IOException e){
            System.out.println("unable to read");
         e.printStackTrace();
    }
    
    return f;
   

}
public static void save(String backup)
{
    Scanner sc=new Scanner(System.in);
    String f;
    System.out.println("Enter the name of the file(with extension)\n\n\t");
    f=sc.nextLine();
    File myfile=new File(f);
        try{
            FileWriter fileWriter = new FileWriter(myfile);
            fileWriter.write(backup);
            fileWriter.close();
        }
        catch(IOException e){
        System.out.println("unable to create");
        e.printStackTrace();

    }
System.out.println("The text is succesfully saved in a file named \""+f+"\""+(char)24+"\n\n\t");
// sc.close();

}
public static void save2(String backup)
{
    Scanner sc=new Scanner(System.in);
    String f;
    System.out.println("Enter the name of the file(with extension)\n\n\t");
    f=sc.nextLine();
    File myfile=new File(f);
    try{
        FileWriter fileWriter = new FileWriter(myfile);
        fileWriter.write(backup);
        fileWriter.close();
    }
    catch(IOException e){
    System.out.println("unable to create");
    e.printStackTrace();

}
System.out.println("The text is succesfully saved in a file named \""+f+"\""+(char)24+"\n\n\t");
// sc.close();
}
public static String encrypt(String str)
{
    int len,i=0,temp;
    len=str.length();
    // str[len]='\0';
    char enc[]=new char[len];
    char x;
    while(i<len)
    {
        if(pass>50)
        {
            pass=0;
        }
        temp=str.charAt(i);
        temp+=pass;
        x=(char)temp;
        enc[i]=x;
        i++;
        pass++;
    }
    // enc[len]='\0';
    i=0;
  pass=0;
  backup=new String(enc);
  return new String(enc);
}
public static void encryptv2()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Filename(with extension).\n\n\t");
    String str;
    str=sc.nextLine();
    File newfile=new File(str);
    try{
        // Scanner sc=new Scanner(newfile);
        while(sc.hasNextLine())
        {
            String line=sc.nextLine();
           encrypt(line);
            //*********************************/
            
        }
        // sc.close();
    }
    catch(Exception e){
            System.out.println("unable to read");
         e.printStackTrace();
    }



} 

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
        // System.out.flush();  
        //formatting title
        System.out.println("\t\t\t DATA ENCRYPTION/DECRYPTION SOFTWARE v1.00\n\n\n");
        System.out.println("Choose from one of the options below : \n\n\n");
        System.out.println(" 1. Encryption of a text \n");
        System.out.println(" 2. Decryption of a text \n");
        System.out.println(" 3. Exit \n\n\n\t");
        
        a=sc.nextInt();
        sc.nextLine();
        System.out.print("\033[H\033[2J");  
        // System.out.flush();  
        if(a==1)
        {
            System.out.println("Choose from one of the options below : \n\n\n");
            System.out.println(" 1. Enter a text \n");
            System.out.println(" 2. Choose a .txt or .dat (binary) file by giving its name and extension \n\n\n \t");

            a=sc.nextInt(); 
            sc.nextLine();
            System.out.print("\033[H\033[2J");  
            // System.out.flush(); 
            
            if(a==1)
            {
                // Scanner abc=new Scanner(System.in);
                
                System.out.println("Enter your text below : \n");
                str=sc.nextLine();
                // System.out.println(f);
                // abc.close();
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
            // Scanner abc=new Scanner(System.in);
            a=sc.nextInt();
            sc.nextLine();
            if(a==1)
            {
                System.out.println("The text is succesfully saved in a variable named \"backup\" which is printed above, you can note it down "+(char)24+"\n\n\t");
                sc.nextLine();
            }
            else if (a==2)
            {
                save(ans);
            }
            // abc.close();

        }
        else if(a==2)
        {
            System.out.println("Choose from one of the options below : \n\n\n");
            System.out.println("1. Paste the text here and decrypt it.\n2. Decrypt the text saved to a file .\n\n\t");
            a=sc.nextInt();
            sc.nextLine();
            if(a==1)
            {
                System.out.println("\nPaste your text below "+(char)25+"\n\n\t");
                str=sc.nextLine();
                ans=encrypt(str);
                System.out.print("\nDecrypted text is below "+(char)25+"\n\n\t"+decrypt(str));
                System.out.print("\n\nTHIS IS YOUR DECRYPTED TEXT \n Choose an option from below : \n \t1. Manually copy this text. \n \t2. Save this text to a file. \n\n");
                a=sc.nextInt();
                sc.nextLine();
                if(a==1)
                {
                    System.out.print("The text is succesfully saved in a variable named \"backup\" which is printed above, you can note it down "+(char)24+"\n\n\t");
                    sc.nextLine();
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
                System.out.println("\n\nTHIS IS YOUR DECRYPTED TEXT \n Choose an option from below : \n \t1. Manually copy this text. \n \t2. Save this text to a file. \n\n");
                a=sc.nextInt();
                sc.nextLine();
                if(a==1)
                {
                    backup=ans;
                    System.out.println("\nThe text is succesfully saved in a variable named \"backup\" which is printed above, you can note it down "+(char)24+"\n\n\t");
                    
                }
                else if(a==2)
                {
                    save2(ans);
                }
            }

        }
        else if(a==3)
        {
            break;
        }
            
         else{
            System.out.println("Enter a Valid Option. \n \n");
         }       
            
    }

}
}
