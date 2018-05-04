package com.optum.jenkins;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
	public static final Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
		logger.info("===Jenkins build success===");
	}
}
