// Declaring a class named RomanNumeralTest for testing RomanNumeral class.
public class RomanNumeralTest {
    
    @Test // Denoting that the following method is a test method.
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

    @Test
    // Method to test repetition of Roman numerals.
    void repetition() { 
        // Asserting that the Roman numeral "II" converts to integer 2.
        Assertions.assertEquals(2, new RomanNumeral().romanToInt("II"));
        // Asserting that the Roman numeral "XX" converts to integer 20.
        Assertions.assertEquals(20, new RomanNumeral().romanToInt("XX"));
    }

    @Test
    // Method to test subtraction in Roman numerals.
    void subtraction() {
        // Asserting that the Roman numeral "IV" converts to integer 4.
        Assertions.assertEquals(4, new RomanNumeral().romanToInt("IV"));
        // Asserting that the Roman numeral "IX" converts to integer 9.
        Assertions.assertEquals(9, new RomanNumeral().romanToInt("IX"));
        // Asserting that the Roman numeral "XL" converts to integer 40.
        Assertions.assertEquals(40, new RomanNumeral().romanToInt("XL"));
        // Asserting that the Roman numeral "XC" converts to integer 90.
        Assertions.assertEquals(90, new RomanNumeral().romanToInt("XC"));
        // Asserting that the Roman numeral "CD" converts to integer 400.
        Assertions.assertEquals(400, new RomanNumeral().romanToInt("CD"));
        // Asserting that the Roman numeral "CM" converts to integer 900.
        Assertions.assertEquals(900, new RomanNumeral().romanToInt("CM"));
    }    
    
    @Test
    // Method to test complex Roman numerals.
    void complexNumbers() {
        // Asserting that the Roman numeral "XLIX" converts to integer 49.
        Assertions.assertEquals(49, new RomanNumeral().romanToInt("XLIX"));
        // Asserting that the Roman numeral "MMMCMXCIX" converts to integer 3999.
        Assertions.assertEquals(3999, new RomanNumeral().romanToInt("MMMCMXCIX"));
    }  
    
}