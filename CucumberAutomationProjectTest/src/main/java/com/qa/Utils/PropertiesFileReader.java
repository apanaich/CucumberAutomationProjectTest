package com.qa.Utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileReader {

public Properties getProperty() throws Exception{
    FileInputStream inputStream = null;
    Properties properties = new Properties();
    properties.load(new FileInputStream(".\\src\\test\\resources\\config\\browser-config.properties"));

    return properties;
}



}
