package calculator;

class StringCalculator {

    public int add(String input) {
        if(input.isEmpty())
    	return 0;
        else if(input.length()==1) return Integer.parseInt(input);
        else {
        	String[] s=input.split(",");
        	return Integer.parseInt(s[0])+Integer.parseInt(s[1]);
        }
    }

}