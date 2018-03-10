package utilities;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ConfigurationDemo {
public static void main(String[] args) throws IOException {
	//. mean the home folder of the project
	//String path="./configuration.properties"; lo mismo
	String path="/Users/cybertek/Documents/workspace/A_UI-Functional-Tests/configuration.properties";
// this class is needed so that java can read the file
	//Java can only read the input stream. it cannot
	FileInputStream input = new FileInputStream(path);
	//properties is class that read properties files
Properties properties= new Properties();
//load the values 
properties.load(input);
//properties can give the values based on the keys passed
String val= properties.getProperty("test");//if you just try to get something that doesnt exits is bad
System.out.println(val);
}
}
