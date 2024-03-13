package day13;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class C02Log4j {

// The important thing here is the log4j message levels:
// All – Logs everything, enabling all log entries. (Opens all logs)
// DEBUG – Prints debugging information to assist in the development process.
// INFO – Prints informational messages highlighting the progress of the application.
// WARN – Logs information about unexpected and faulty system behavior.
// ERROR – Logs an error message that may allow the system to continue.
// FATAL – Logs critical information that leads to the application's crash.
// OFF – No logging.

    public static void main(String[] args){
        Logger logger = LogManager.getLogger(C02Log4j.class.getName());

        logger.trace("This is a trace message");
        logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");
    }

}
