package beta;

import org.apache.logging.log4j.*;

public class Demo1 {

	private static Logger log = LogManager.getLogger(Demo1.class.getName());

	public static void main(String[] args) {
		log.debug("i am debug message");
		log.info("this is info");
		log.error("this is an error");
		log.fatal("this is fatal");
	}
}
