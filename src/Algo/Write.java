package Algo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Write {
	public static void write() {
		Scanner w=new Scanner(System.in);
         int z=0;
         boolean wenttocatch = false;
         do{
         	System.out.println("Wie viele Zahlen willst du erstellen?");
             if(w.hasNextInt()){
                 z = w.nextInt();
                 wenttocatch = true;
             }else{
                 w.nextLine();
                 System.out.println("Bitte geben Sie eine Zahl ein!");
             }
         }while(!wenttocatch);
         Scanner name=new Scanner(System.in);
         System.out.println("Wie soll Ihre Datei heiﬂen?");
         String n=name.nextLine();
         File file=new File(n+".txt");
         for (int j = 0; j < z; j++) {
         	try(FileWriter fw = new FileWriter(file, true);
     		    BufferedWriter bw = new BufferedWriter(fw);
     		    PrintWriter out = new PrintWriter(bw))
     		{
     			int r=(int) (Math.random()*z);
     		  	out.println(r);
     		} catch (IOException ef) {
     		    //exception handling left as an exercise for the reader
     		}
    	}
	}
}
