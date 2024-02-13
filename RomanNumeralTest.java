public class RomanNumeralTest {
    @Test
    void singleDigit() {
        Assertions.assertEquals(1, new RomanNumeral().romanToInt("I"));
        Assertions.assertEquals(5, new RomanNumeral().romanToInt("V"));
        Assertions.assertEquals(10, new RomanNumeral().romanToInt("X"));
        Assertions.assertEquals(50, new RomanNumeral().romanToInt("L"));
        Assertions.assertEquals(100, new RomanNumeral().romanToInt("C"));
        Assertions.assertEquals(500, new RomanNumeral().romanToInt("D"));
        Assertions.assertEquals(1000, new RomanNumeral().romanToInt("M"));
    }
    @Test
    void repetition() {
        Assertions.assertEquals(2, new RomanNumeral().romanToInt("II"));
        Assertions.assertEquals(20, new RomanNumeral().romanToInt("XX"));
    }    
}