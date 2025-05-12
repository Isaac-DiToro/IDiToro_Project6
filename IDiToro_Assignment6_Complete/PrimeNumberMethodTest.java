/*
 * Class: CMSC201
 * Instructor: Doctor Grinberg
 * Description: JUnit test class to test the isPrime method.
 * Due: 05/12/25
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Isaac DiToro
 */

import static org.junit.Assert.*;
import org.junit.Test;

//PrimeNumberMethodTest uses JUnit to test the correctness of the isPrime method.
public class PrimeNumberMethodTest {

    //Checks whether a number is prime.
    //@param number the integer to check
    //@return true if the number is prime; false otherwise
    public static boolean isPrime(int number) {
        if (number <= 1) return false;

        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }

        return true;
    }

    //Tests prime numbers.
    @Test
    public void testPrimeNumbers() {
        assertTrue(isPrime(2));
        assertTrue(isPrime(3));
        assertTrue(isPrime(17));
        assertTrue(isPrime(97));
    }

    //Tests non-prime numbers.
    @Test
    public void testNonPrimeNumbers() {
        assertFalse(isPrime(0));
        assertFalse(isPrime(1));
        assertFalse(isPrime(4));
        assertFalse(isPrime(100));
    }
}
