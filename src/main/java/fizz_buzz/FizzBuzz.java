package fizz_buzz;

public class FizzBuzz {
    public static String say(Integer number) {
    	String Answer = Integer.toString(number);
    	if(number % 15 == 0) {
    		return "Fizz Buzz";
    	}
    	else if(number  % 3 == 0) {
    		return "Fizz";
    	}
    	else if(number % 5 == 0) {
    		return "Buzz";
    	}
    	else 
        return Answer;
    }
}
