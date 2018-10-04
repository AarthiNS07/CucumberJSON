package org.cucumber.Flipkart;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader 
{
	private Properties prop;
	BufferedReader reader;
	private final String path="C:\\Users\\N S AARTHI\\Downloads\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\Cucumber\\Flipkart\\src\\main\\java\\config.properties";
	public ConfigFileReader() 
	{
		
		try {
			reader = new BufferedReader(new FileReader(path));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		prop=new Properties();
		try 
		{
			prop.load(reader);
			reader.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public String getApplicationUrl() {
		String appurl=prop.getProperty("url");
		if(appurl!=null)
		{
		return appurl;
		}
		else
			throw new RuntimeException("URL is not found");
	}
	public String getDriverPath() {
		String path=prop.getProperty("driverPath");
		if(path!=null)
		{
			return path;
		}
		else
			throw new RuntimeException("Please set the driver path");
	}
	
}
