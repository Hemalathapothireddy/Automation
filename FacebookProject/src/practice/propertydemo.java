package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertydemo {

	public static void main(String[] args) throws IOException {
	Properties prop=new Properties();
	FileInputStream f=new FileInputStream("demo.properties");
	prop.load(f);
	System.out.println(prop.getProperty("url"));
	System.out.println(prop.getProperty("username"));
	System.out.println(prop.getProperty("password"));
	
	
		
	}

}
