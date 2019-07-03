package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	
	private static Logger Logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {

		System.out.println("\n Hello World...!   \n");
		
		Logger.trace("this is trace level");
		Logger.info("this is infomation message");
		Logger.error("this is error message");
		Logger.warn("this is warning message");
		Logger.fatal("this is fatal message");
		
		System.out.println("\n completed   \n");
		
		
		
	}

}
