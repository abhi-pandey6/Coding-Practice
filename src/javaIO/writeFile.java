package javaIO;
import java.io.*;
public class writeFile {



        public static void main(String[] args) {
            try {
                FileWriter f = new FileWriter("C:\\Users\\abhij\\OneDrive\\Desktop\\abhii.txt");
                try {
                    f.write("Java Programming is the best Language..!");
                } finally {
                    f.close();
                }
                System.out.println("Successfully Data wrote in File");
            } catch (IOException i) {
                System.out.println(i);
            }
        }
    }


