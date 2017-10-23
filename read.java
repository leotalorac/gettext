import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class read {
  public static void main(String[] args) {
    File input = new File("AQuiones.htm");
    File output = new File("out.html");
    //if not exist the out
    System.out.println("starts");
    try{
      output.createNewFile();
    }catch (IOException ex){
      System.out.println("no es posible crear el archivo");
    }
    //scans
    try {
       Scanner sc = new Scanner(input);
       PrintStream es = new PrintStream(output);
       Boolean init = false;
       System.out.print(sc.hasNext());
       while(sc.hasNext()){
         String s = sc.next();
         System.out.println("print out" +s);
         //init
         if (s.startsWith ("<p")) {
           System.out.println("inicia");
           es.print(s +" ");
           init = true;
         }
         while(init){
           s = sc.next();
           es.print(s + " ");
           System.out.println(s);
           if(s.endsWith("</p>")){
             System.out.println("termina");
             es.println();
             init = false;
             break;
           }
         }
       }
       sc.close();
       es.close();
    }catch (FileNotFoundException ex) {
      Logger.getLogger(read.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
}
