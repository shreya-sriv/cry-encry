import java.io.*;
import java.util.Scanner;
import java.io.File;

public class file {
    public static void main(String args[])
    {
        String s="myfile.txt";
        File myfile=new File(s);
    //     try{
    //         myfile.createNewFile();
    //     }
    //     catch(IOException e){
    //     System.out.println("unable to create");
    //     e.printStackTrace();
    // }
    try{
        Scanner sc=new Scanner(myfile);
        while(sc.hasNextLine())
        {
            String line=sc.nextLine();
            System.out.println(line);
        }
        sc.close();
    }
    catch(IOException e){
            System.out.println("unable to read");
         e.printStackTrace();
    }
}
}
