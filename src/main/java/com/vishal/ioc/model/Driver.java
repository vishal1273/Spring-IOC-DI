package com.vishal.ioc.model;

import java.util.Properties;
import java.util.Set;

public class Driver {
    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void displayProperties() {
        final Set<Object> keys = properties.keySet();
        for (Object key : keys) {
            System.out.println(key + "--->" + properties.getProperty((String) key));
        }

    }
}
