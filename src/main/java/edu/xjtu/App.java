package edu.xjtu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App
{
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = "Javc";
        String s4 = "Aava";
        logger.warn("1");
        logger.info(s1 == s3?"true":"false");
        logger.info(String.valueOf(s1.compareTo(s3)));
        logger.info(String.valueOf(s1.compareTo(s4)));

    }
}
