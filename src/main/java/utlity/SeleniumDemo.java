package utlity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SeleniumDemo {

    public static void main(String[] args) throws IOException {

        // 1. read the file
        FileInputStream fis = new FileInputStream("Config/Config.properties");

        // 2. Create the object of the properties class
        Properties prop = new Properties();

        // 3 . load the file object with properties object
        prop.load(fis);

        //4. Read the value of key
        System.out.println(prop.getProperty("password"));

    }


}
