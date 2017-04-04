package FileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterdemo {

	public static void main(String[] args) throws IOException {
		FileWriter f=new FileWriter("automation");
		f.write("hello");
		f.write('\n');
		f.write("how are u");
		f.write('\n');
		f.write(36);
		f.flush();
		f.close();
		
		
		
		FileWriter f1=new FileWriter("automation");
		BufferedWriter bw=new BufferedWriter(f1);
		bw.write("i am from bufferredreader");
		bw.newLine();
		bw.write("where r u");
		bw.newLine();
		bw.write(36);
		bw.flush();
		bw.close();
		
		
		FileWriter f2=new FileWriter("selenium");
		PrintWriter pw= new PrintWriter(f2);
		pw.println("i am from printwriter");
		pw.println("encapsulation");
		pw.println(36);
		pw.flush();
		pw.close();
		
		

	}

}
