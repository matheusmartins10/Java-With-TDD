package br.martins;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class FizzBuzzTest {
    /**
     * Rigorous Test.
     */
    private FizzBuzz eu;
    @Before
    public void setup(){
        eu = new FizzBuzz();
    }
    @Test
    public void testConcat() {
        final String resp = eu.concat(1);

        assertEquals("Mensagem 1", "1", resp);
    }

    @Test

    public void testFizz(){
        final String resp = eu.concat(3);

        assertEquals("O valor 3 precisa emitir: Fizz ","Fizz", resp);
    }

    @Test

    public void testBuzz(){
        final String resp = eu.concat(5);

        assertEquals("O valor 5 precisa emitir: Buzz ","Buzz", resp);
    }

    @Test

    public void testFizzBuzz(){
        final String resp = eu.concat(15);

        assertEquals("O valor 5 precisa emitir: Buzz ","FizzBuzz", resp);
    }

    @Test

    public void testFizzBuzzNegativo(){
        final String resp = eu.concat(-1);

        assertEquals("Os valore precisam ser positivo ","", resp);
    }
}

