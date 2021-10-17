package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {

    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    @Test
    void string_with_two_number_should_return_sum_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(5, stringCalculator.add("2,3"));
    }
    @Test
    public final void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() {
    	 StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3+6+15+18+46+33, stringCalculator.add("3,6,15,18,46,33"));
    }
    @Test
    public final void whenNewLineIsUsedBetweenNumbersThenReturnValuesAreTheirSums() {
    	StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3+6+15, stringCalculator.add("3,6\n15"));
    }
    @Test
    public final void whenDelimiterIsSpecifiedThenItIsUsedToSeparateNumbers() {
    	StringCalculator stringCalculator = new StringCalculator();
        assertEquals(3+6+15, stringCalculator.add("//;\n3;6;15"));
    }
    @Test
    public final void whenNegativeNumberIsUsedThenRuntimeExceptionIsThrown() {
    	StringCalculator stringCalculator = new StringCalculator();
        assertThrows(RuntimeException.class,()->stringCalculator.add("3,-6,15,18,46,33"));
    }
    @Test
    public final void whenNegativeNumbersAreUsedThenRuntimeExceptionIsThrown() {
        RuntimeException exception = null;
        try {
            StringCalculator.add("3,-6,15,-18,46,33");
        } catch (RuntimeException e) {
            exception = e;
        }
        assertNotNull(exception);
        assertEquals("Negatives not allowed: [-6, -18]", exception.getMessage());
    }
}
