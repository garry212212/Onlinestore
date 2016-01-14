package com.test1.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class JavaPropertiesFile {

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
     Properties testconfig=new Properties();
     testconfig.load(new FileInputStream("testconfig.properties"));
     System.out.println(testconfig.getProperty("browser"));
     System.out.println(testconfig.getProperty("baseurl"));
     
	}
}