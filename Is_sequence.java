/*     A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

 

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
 

Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.
 

Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 109, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?      */



class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
 
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++; 
            }
            j++; 
        }
    
        return i == s.length();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String str1 = "ahbgdc";
        String sub1 = "abc";
        System.out.println("Is subsequence? " + sol.isSubsequence(sub1, str1)); 
        
        String str2 = "ahbgdc";
        String sub2 = "axc";
        System.out.println("Is subsequence? " + sol.isSubsequence(sub2, str2));
    }
}
