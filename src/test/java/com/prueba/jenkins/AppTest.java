/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.prueba.jenkins;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testSuma(){
        App a = new App();
        int n1=3;
                int n2=3;
                int expected = 6;
                int result=a.suma(n1, n2);
                assertEquals(expected, result);
                
    }
    
    
    
    
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
