package com.SastaSundar.genricLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileLib
{
	public String getPropertiesValue(String key)
	{
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream("./src\\main\\java\\com\\SastaSundar\\commonData\\commonData.properties");
		} catch (FileNotFoundException e1) 
		{
			e1.printStackTrace();
		}
		Properties p = new Properties();
		try 
		{
			p.load(fis);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		return p.getProperty(key);
		
	}
}
