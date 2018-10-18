package factory;

import java.io.IOException;
import java.util.Properties;

public class LoggerFactory {
    public boolean isFileLoggingEnabled(){
        Properties properties = new Properties();
        try{
            properties.load(ClassLoader.getSystemResourceAsStream("Logger.properties"));
            String fileLogging = properties.getProperty("FilreLogging");

            return fileLogging.equalsIgnoreCase("ON") == true;

        } catch (IOException e){
            return false;
        }
    }
}
