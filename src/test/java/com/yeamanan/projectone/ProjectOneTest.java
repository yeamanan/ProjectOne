package com.yeamanan.projectone;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * ProjectOneTest class.
 *
 * @author Yeam Anan (<yeamanan@gmail.com>)
 */
public class ProjectOneTest {

    /**
     * test() test method.
     */
    @Test
    public final void test() {
        assertEquals("This is ok", ProjectOne.write(), "This is a sample project");
    }
}
