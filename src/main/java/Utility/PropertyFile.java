package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFile {

	public static String ReadProperty(String value) throws Exception
	{
		Properties pro=new Properties();
		
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Myntra\\DataBase\\Config.properties");
	
	pro.load(file);
	
	return pro.getProperty(value);
	}
	
}
