package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    public static Properties properties;
    static{
        try {
            FileInputStream fis=new FileInputStream("configuration.properties");
            properties=new Properties();
            properties.load(fis);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static  String getProperties(String key){


 return properties.getProperty(key);   }
}
