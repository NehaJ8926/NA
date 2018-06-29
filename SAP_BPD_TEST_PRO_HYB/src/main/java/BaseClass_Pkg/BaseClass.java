package BaseClass_Pkg;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;


public class BaseClass {
	
	public static WebDriver driver;
	
 public static Logger logger
 
 /**
  * @author C5248154 (Neha Joshi)
  * This method is used to pass the browser as a parameter and the browser choice is given 
 in the config.properties file inside the data folder. 
  * @param propname
  * @return propvalue
  * @throws IOException
  */
	
 public static String getConfigData(String propname) throws IOException
 {
	 String propvalue= null;
	   
	 File f_obj= new File("./Data/config.properties");
	 FileInputStream fi_obj= new FileInputStream(f_obj);
	 
	 Properties prop_obj=new Properties();
	 
	 propvalue = prop_obj.getProperty(propname);
	 
	 return propvalue;
	 
 }
	
	
	
	public static void LauchBrowser() throws IOException, InterruptedException
	{
	 writeLogger("Browser is Launching");
	 
	 
	 
	 
	 
	}
	

}
