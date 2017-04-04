package FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Printreader {

	public static void main(String[] args) throws IOException {
  FileReader fr=new FileReader("Manualtesting");
  int  a=fr.read();
  
  while (a!=-1){
	  System.out.println((char) a);
	  a=fr.read();
  }
   fr.close();
  
  
  
  FileReader f=new FileReader("Manualtesting");
  BufferedReader bw=new BufferedReader(f);
 String  b=bw.readLine();
  
   while(b!=null){
   System.out.println(b);
   b=bw.readLine();}
	}
        
}
