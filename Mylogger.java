package com.techno.loggerexample;

import java.io.IOException;
import java.util.Formatter;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Mylogger {

	public static final Logger LOGGER = Logger.getLogger(Mylogger.class.getName());

	public static void main(String[] args) throws Exception, IOException {
		// ConsoleHandler consoleHandler = new ConsoleHandler();
		// consoleHandler.setLevel(Level.SEVERE);
		//
		// LOGGER.addHandler(consoleHandler);

		FileHandler fileHandler = new FileHandler("C:\\Users\\LENOVO\\Desktop\\logger\\log.log");
		MyFormatter myFormatter = new MyFormatter();
		fileHandler.setFormatter(myFormatter);
		LOGGER.addHandler(fileHandler);
		//
		LOGGER.setLevel(Level.FINE);

		LOGGER.finest("im from finest");
		LOGGER.finer("im from finer");
		LOGGER.fine("im from fine");
		LOGGER.config("im from config");
		LOGGER.info("IM FROM INFO");// level info
		LOGGER.warning("im from warning");
		LOGGER.severe("im from severs");
	}

}
