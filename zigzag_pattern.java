/*6. Zigzag Conversion

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
 

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"
 

Constraints:

1 <= s.length <= 1000
s consists of English letters (lower-case and upper-case), ',' and '.'.
1 <= numRows <= 1000   */



/* CODE */
class Solution {
    public String convert(String s, int numRows) {
        char[][] str = new char[numRows][s.length()]; // Correct array initialization

        int row = 0;
        int col = 0;
        int curr = 0;

        while (curr < s.length()) {
            while (row < numRows && curr < s.length()) {
                str[row++][col] = s.charAt(curr++); // Use charAt to access characters
            }
            row = Math.max(0, row - 2); // Use Math.max
            while (row > 0 && curr < s.length()) {
                str[row--][++col] = s.charAt(curr++);
            }
            col++;
        }

        String ans = "";
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (str[i][j] != '\u0000') { // Check for uninitialized cells
                    ans += str[i][j];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String s1 = "PAYPALISHIRING";
        int row1 = 3;
        int row2 = 4;
        int row3 = 1;

        System.out.println("The zigzag Pattern is: " + s.convert(s1, row1));
        System.out.println("The zigzag Pattern is: " + s.convert(s1, row2));
        System.out.println("The zigzag Pattern is: " + s.convert(s1, row3));
    }
}
