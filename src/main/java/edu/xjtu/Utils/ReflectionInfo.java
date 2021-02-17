package edu.xjtu.Utils;

import edu.xjtu.App;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ReflectionInfo {
    private static final Logger logger = LoggerFactory.getLogger(ReflectionInfo.class);
    public static void main(String[] args)
    {
        String inClassName = new Scanner(System.in).next();
        try {
            Class<?> c = Class.forName(inClassName);
            var t = c.getConstructor(String.class).newInstance("34");
            Class<?> superC = c.getSuperclass();
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) System.out.print(modifiers + " ");

            System.out.print("class " + c.getName());
            if (superC != Object.class)
                System.out.println(" extends " + superC.getName());

        } catch (ReflectiveOperationException e)
        {
            logger.error(e.toString());

        }



    }

}
