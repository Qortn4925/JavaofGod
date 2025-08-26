package leetcode.p383;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
        public boolean canConstruct(String ransomNote, String magazine) {
            // Create a map to count the frequency of each character in the magazine
            Map<Character, Integer> map = new HashMap<>();

            // Fill the map with characters from the magazine
            for (char ch : magazine.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            // Check if we can construct the ransom note using the characters from the magazine
            for (char ch : ransomNote.toCharArray()) {
                if (!map.containsKey(ch) || map.get(ch) == 0) {
                    return false; // If the character is not present or exhausted, return false
                }
                map.put(ch, map.get(ch) - 1); // Use one instance of the character
            }

            return true; // If all characters can be matched, return true
        }
    }
