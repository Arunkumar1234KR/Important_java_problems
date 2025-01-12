
/*Understanding Character Encoding:
What Does 'e' - 'a' Represent?

'e' - 'a' calculates the index of the letter 'e' in the alphabet, starting from 0 for 'a'.
'a' has an ASCII value of 97, and 'e' has an ASCII value of 101.
'e' - 'a' = 101 - 97 = 4
So, 'e' is the 5th letter of the alphabet, and its 0-based index is 4.

In Java, characters are internally stored as integers (ASCII or Unicode values).
For example:
'a' = 97, 'b' = 98, 'c' = 99, and so on (in ASCII).
Mapping Characters to an Index:

To map 'a' to the first position (index 0), you subtract its own value ('a' = 97) from the character's value:
'a' - 'a' = 97 - 97 = 0
'b' - 'a' = 98 - 97 = 1
'c' - 'a' = 99 - 97 = 2
Prime Array Indexing:

The prime array contains a mapping of the 26 lowercase English letters to their corresponding prime numbers:
java
Copy code
int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
To correctly access the prime number corresponding to each letter:
'a' → prime[0] = 2
'b' → prime[1] = 3
'c' → prime[2] = 5
'z' → prime[25] = 101

Step-by-Step Visualization
Example 1: Processing "eat"
Calculate product for "eat":

Prime values for 'e', 'a', 't' are 11, 2, and 71.
11×2×71=1562.
Check if map contains the key 1562:
Processing "tea":
Calculate product:


product = 71 * 11 * 2 = 1562
Check if key exists in the map:


map.containsKey(1562) → false (map is empty).
Create a new list:


List<String> newList = new ArrayList<>();
newList.add("eat"); // Add the word to the new list
Add the list to the map with product as the key:


map.put(1562, newList);
Map now looks like:


{ 1562: ["eat"] }
 map.containsKey(1562) → true
The key 1562 already exists, so the value (list) for this key is retrieved:

map.get(1562) → ["eat"]
Add "tea" to the list:

map.get(1562).add("tea");
Map after adding "tea":

{ 1562: ["eat", "tea"] }

 */


import java.util.*; // Importing necessary classes

public class Groupanagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) 
            return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);

            
            map.putIfAbsent(sortedKey, new ArrayList<>());
            map.get(sortedKey).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Groupanagram g = new Groupanagram();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(g.groupAnagrams(strs));
    }
}
