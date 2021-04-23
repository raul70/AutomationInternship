package com.endava.helpers;

import java.util.ResourceBundle;

public enum ConfigHelper {
    INSTANCE;

    private String URL;

    private ResourceBundle testConfigFile = ResourceBundle.getBundle(System.getProperty("configFile"));

    ConfigHelper(){
        if (null != System.getProperty("URL")){
            setURL(System.getProperty("URL"));

        }
        else{
            setURL(testConfigFile.getString("URL"));
        }
    }
    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
