package FileIO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filereaderdemo {

	public static void main(String[] args) throws IOException {
	 FileReader fr=new FileReader("selenium");
	int k=fr.read();
	 while (k!=-1){
		 System.out.println((char)k);
		 k=fr.read();
	 }
	 
	 FileReader f=new FileReader("selenium");
	 BufferedReader br=new BufferedReader(f);
	 String i=br.readLine();
	 while (i!=null){
		 System.out.println(i);
		 i=br.readLine();
	 }
		 
	 
	 
	 
	 
	}

}
