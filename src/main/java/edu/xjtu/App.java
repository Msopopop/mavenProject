package edu.xjtu;

import edu.xjtu.Utils.PRIVILEGE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.InputMismatchException;


public class App
{
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )  {

        try(var in = new java.util.Scanner(System.in))
        {
            System.out.print(in.nextInt());
        }catch (InputMismatchException e)
        {
            var walker = StackWalker.getInstance();
            walker.forEach(System.out::println);
        }
    }
}
