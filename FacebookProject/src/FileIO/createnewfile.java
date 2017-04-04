package FileIO;

import java.io.File;
import java.io.IOException;

public class createnewfile {

	public static void main(String[] args) throws IOException {
	  File f=new File("firstfile");
	  System.out.println(f.getAbsolutePath());
	
	 
	 
	 System.out.println(f.exists());
	 f.createNewFile();
	 System.out.println(f.exists());
	 File f1=new File("abc.text");
	 f1.mkdirs();
	String[] s= f1.list();
	for (String i:s){
		System.out.println();
		
	}

	//File f2=new File(f1,"automation");
	//f2.createNewFile();
	}

}
