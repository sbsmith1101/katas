package fizz_buzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Here are the rules for this kata:
 * <p>
 * -Write a method that takes an integer and returns a string. This represents the act of saying a number.
 * -The string should be the numerical characters that represent the value of the integer that was passed, EXCEPT:
 * -When the integer passed is a multiple of 3, the method should say Fizz.
 * -When the integer passed is a multiple of 5, the method should say Buzz.
 */
public class FizzBuzzTest {
    @Test
    public void whenGiven1FizzBuzzSays1() {
        FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(1);
        assertThat(spokenWord, is("1"));

    }
    @Test
    public void whenGiven3SayFizz() {
    	FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(3);
        assertThat(spokenWord, is("Fizz"));
    }
    @Test
    public void whenGiven5SayBuzz() {
    	FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(5);
        assertThat(spokenWord, is("Buzz"));
    }
    @Test
    public void whenGiven4Say4() {
    	FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(4);
        assertThat(spokenWord, is("4"));
    }
    @Test
    public void whenGiven6SayFizz() {
    	FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(6);
        assertThat(spokenWord, is("Fizz"));
    }
    @Test
    public void whenGiven7Say7() {
    	FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(7);
        assertThat(spokenWord, is("7"));
    }
    @Test
    public void whenGiven10SayBuzz() {
    	FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(10);
        assertThat(spokenWord, is("Buzz"));
    }
    @Test
    public void whenGiven15SayFizzBuzz() {
    	FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(15);
        assertThat(spokenWord, is("Fizz Buzz"));
    }
    @Test
    public void whenGiven30SayFizzBuzz() {
    	FizzBuzz underTest = new FizzBuzz();
        String spokenWord = underTest.say(30);
        assertThat(spokenWord, is("Fizz Buzz"));
    }
    
}
