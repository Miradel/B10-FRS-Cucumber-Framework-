package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    // to use the value from the properties file

    private static Properties properties;

    static {

        String path = "configuration.properties";
        /*
        Java can't read files directly, so we need to use FileinputStream class to read,
        it need location/path of the file as a constructor
         */


        try {
            FileInputStream fileInputStream = new FileInputStream(path);

            // properties is use to read only properties files, file with key-value pairs:
            properties = new Properties();

            properties.load(fileInputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    another way of creating this method


    private static Properties properties;

	public static String getProperty(String key){
		String path = "configuration.properties";

		try {
			FileInputStream stream = new FileInputStream(path);
			properties = new Properties();
			properties.load(stream);
			stream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties.getProperty(key);
	}



     */

    public static String getProperty(String property){

        return properties.getProperty(property);
    }
}
