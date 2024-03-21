import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class RomanNumeral {
    private static final Map<Character, Integer> map; 

    static {
        // Creating a temporary HashMap.
        Map<Character, Integer> tempMap = new HashMap<>();
        // Putting a mapping of character 'I' to integer 1.
        tempMap.put('I', 1);
        // Putting a mapping of character 'V' to integer 5.
        tempMap.put('V', 5);
        // Putting a mapping of character 'X' to integer 10.
        tempMap.put('X', 10);
        // Putting a mapping of character 'L' to integer 50.
        tempMap.put('L', 50);
        // Putting a mapping of character 'C' to integer 100.
        tempMap.put('C', 100);
        // Putting a mapping of character 'D' to integer 500.
        tempMap.put('D', 500);
        // Putting a mapping of character 'M' to integer 1000.
        tempMap.put('M', 1000);
        // Making the map immutable using Collections.unmodifiableMap and assigning it to 'map'.
        map = Collections.unmodifiableMap(tempMap);
    }
    
    // Method to convert a Roman numeral to an integer.
    public int romanToInt(String s) {
        // Initializing the converted number as 0.
        int convertedNumber = 0;
        // Looping through each character of the input string.
        for (int i = 0; i < s.length(); i++) {
            // Getting the integer value corresponding to the current character.
            int currentNumber = map.get(s.charAt(i));
            // Getting the integer value of the next character, or 0 if there's no next character.
            int next = i + 1 < s.length() ? map.get(s.charAt(i + 1)) : 0;
            // Checking if the current number is greater than or equal to the next number.
            if (currentNumber >= next) {
                // Adding the current number to the converted number.
                convertedNumber += currentNumber;
            } else {
                // Subtracting the current number from the converted number.
                convertedNumber -= currentNumber;
            }
        }
        return convertedNumber;
    }

    public static void main(String[] args) {
        // Creating an instance of the RomanNumeral class.
        RomanNumeral romanConverter = new RomanNumeral();
        // Converting the Roman numeral "X" to an integer.
        int result = romanConverter.romanToInt("X");
        // Printing the result.
        System.out.println(result);
    }
}