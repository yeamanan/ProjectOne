package com.yeamanan.projectone;

import org.apache.log4j.Logger;

/**
 * ProjectOne class.
 *
 * @author Yeam Anan <yeamanan@gmail.com>
 */
public class ProjectOne {

    /**
     * Logger.
     */
    private static final Logger LOGGER = Logger.getLogger(ProjectOne.class);

    /**
     * Main() method.
     *
     * @param args arguments
     */
    public static void main(final String[] args) {
        LOGGER.info(write());
    }

    /**
     * write() method.
     *
     * @return some text
     */
    public static String write() {
        return "This is a sample project";
    }
}
