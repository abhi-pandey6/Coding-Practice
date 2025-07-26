package javaIO;

import java.io.*;

public class createFile {
    public static void main(String[] args) {
        File f = new File ("C:\\Users\\abhij\\OneDrive\\Desktop\\abhii.txt");

        try{
            if(f.createNewFile())
            {
                System.out.println("file created");
            }
            else{
                System.out.println("file already exist");
            }
        }
         catch (IOException i)
         {
             System.out.println("Exception handling");
         }
    }
}
