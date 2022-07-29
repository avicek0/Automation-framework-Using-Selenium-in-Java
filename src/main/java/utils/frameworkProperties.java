package utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class frameworkProperties {
    private String result = "";
    private InputStream inputStream;

    public String getProperty(String key) {
        try {
            Properties properties = new Properties();
            String propFileName = "File Name";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if ( inputStream != null )
                properties.load(inputStream);
            else
                throw new FileNotFoundException("FILE_NOT_FOUND_EXCEPTION_MESSAGE");

            String propertyValue = properties.getProperty(key);
            this.result = propertyValue;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}


