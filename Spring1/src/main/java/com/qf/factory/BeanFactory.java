package com.qf.factory;

import java.io.InputStream;
import java.util.Properties;

public class BeanFactory {
    private Properties properties = new Properties();
    public BeanFactory() {

    }
    public BeanFactory(String config) throws Exception {
        InputStream inputStream = BeanFactory.class.getResourceAsStream(config);
        properties.load(inputStream);
    }

    public Object getBean(String beanName) throws Exception {

        String property = properties.getProperty(beanName);
        Class clazz = Class.forName(property);
        Object o = clazz.newInstance();
        return o;
    }
}
