package com.optum.jenkins;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App {
	public static final Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) throws IOException {
		logger.info("===Jenkins build success===");
		createTestFile("test-file.txt");
	}

	private static void createTestFile(String path) throws IOException {
		// TODO Auto-generated method stub
		File file = new File(path);
		FileWriter writer = new FileWriter(file);
		writer.write("Jenkins Test : "+new Date() + " ==> Writing : " + Math.random());
		writer.flush();
		writer.close();
	}
}
