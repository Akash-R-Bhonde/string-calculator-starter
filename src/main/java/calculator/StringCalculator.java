package calculator;

class StringCalculator {

    public int add(String input) {
    	 int returnValue = 0;
    	    String[] numbersArray = input.split(",");
    	    for (String number : numbersArray) {
    	        if (!number.trim().isEmpty()) { // After refactoring
    	            returnValue += Integer.parseInt(number);
    	        }
    	    }
    	    return returnValue;
    }

}