package Collection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertydemo {

	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		FileInputStream f=new FileInputStream("myfirstfile");
		p.load(f);
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("user name"));
		System.out.println(p.getProperty("password"));
		
		
		

	}

}
