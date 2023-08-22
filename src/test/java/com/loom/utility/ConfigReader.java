package com.loom.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {


    //1 Create an object from properties class
    // make it "private" so we are limiting access to the object
    // "static" is to make sure it's created and loaded before everything else
    private static Properties properties = new Properties();

    static {

        try {

            //2 Open file using FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");
            //3 Load file into properties object
            properties.load(file);
            //close the file in the memory
            file.close();

        } catch (IOException e) {
            System.out.println("FILE NOT FOUND WITH GIVEN PATH!");
            e.printStackTrace();
        }
    }

    //4 Access the properties object to read from the file
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }



}
