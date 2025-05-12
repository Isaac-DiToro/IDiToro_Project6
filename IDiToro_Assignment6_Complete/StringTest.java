/*
 * Class: CMSC201
 * Instructor: Doctor Grinberg
 * Description: JUnit test class to test methods of the String class: length, charAt, substring, and indexOf.
 * Due: 05/12/25
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Isaac DiToro
 */

import static org.junit.Assert.*;
import org.junit.Test;

//StringTest uses JUnit to test the core methods of the String class.
public class StringTest {

    //Tests the length() method.
    @Test
    public void testLength() {
        String str = "CMSC201";
        assertEquals(7, str.length());
    }

    //Tests the charAt() method.
    @Test
    public void testCharAt() {
        String str = "Hello";
        assertEquals('H', str.charAt(0));
        assertEquals('o', str.charAt(4));
    }

    //Tests the substring() method.
    @Test
    public void testSubstring() {
        String str = "Welcome";
        assertEquals("Wel", str.substring(0, 3));
        assertEquals("come", str.substring(3));
    }

    //Tests the indexOf() method.
    @Test
    public void testIndexOf() {
        String str = "Hello World";
        assertEquals(6, str.indexOf("World"));
        assertEquals(-1, str.indexOf("Java"));
    }
}
