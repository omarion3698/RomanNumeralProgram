// Declaring a class named RomanNumeralTest for testing RomanNumeral class.
public class RomanNumeralTest { 
    @Test
    // Method to test single-digit Roman numerals.
    void singleDigit() {
        // Asserting that the Roman numeral "I" converts to integer 1.
        Assertions.assertEquals(1, new RomanNumeral().romanToInt("I"));
        // Asserting that the Roman numeral "V" converts to integer 5. 
        Assertions.assertEquals(5, new RomanNumeral().romanToInt("V"));
        // Asserting that the Roman numeral "X" converts to integer 10.
        Assertions.assertEquals(10, new RomanNumeral().romanToInt("X"));
        // Asserting that the Roman numeral "L" converts to integer 50.
        Assertions.assertEquals(50, new RomanNumeral().romanToInt("L"));
        // Asserting that the Roman numeral "C" converts to integer 100.
        Assertions.assertEquals(100, new RomanNumeral().romanToInt("C"));
        // Asserting that the Roman numeral "D" converts to integer 500.
        Assertions.assertEquals(500, new RomanNumeral().romanToInt("D"));
        // Asserting that the Roman numeral "M" converts to integer 1000.
        Assertions.assertEquals(1000, new RomanNumeral().romanToInt("M"));
    }

    @Test // Denoting that the following method is a test method.
    void repetition() { // Method to test repetition of Roman numerals.
        // Asserting that the Roman numeral "II" converts to integer 2.
        Assertions.assertEquals(2, new RomanNumeral().romanToInt("II"));
        // Asserting that the Roman numeral "XX" converts to integer 20.
        Assertions.assertEquals(20, new RomanNumeral().romanToInt("XX"));
    }    
}