package com.github.jayuc.common;

import org.apache.log4j.Logger;

import com.github.jayuc.common.act.Log4jLogger;
import com.github.jayuc.common.act.Properties;
import com.github.jayuc.common.iter.ILogger;
import com.github.jayuc.common.iter.IProperties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        String path = "G:/Template/dbconfig.properties";
        //path = null;
        //path = "";
        
        IProperties p = new Properties(path);
        
        String driverClassName = p.getProperty("driverClassName");
        
        System.out.println("driverClassName: " + driverClassName);
        
        String logPath = "G:/Template/log4j.properties";
        //logPath = null;
        ILogger logger = new Log4jLogger(logPath);
        Logger log = (Logger) logger.getLogger(App.class);
        
        log.debug("生产力");
        
    }
}
