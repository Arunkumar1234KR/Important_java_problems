/*problem: 14

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.

CODE:*/

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        Arrays.sort(strs);
     String first = strs[0];
     String second =strs[strs.length-1];
     if(strs.length == 1){
        return strs[0];
     }
     for(int i= 0;i< first.length();i++){
        if(first.charAt(i) == second.charAt(i)){
            prefix += first.charAt(i);
        }
        else{
            break;
        }
     } 
      return prefix;  
    }
    public static void main(String[] args){
        Solution sc = new Solution();
        String strs1[] = {"flower","flow","flight"};
        System.out.print("The prefix:"+sc.longestCommonPrefix(strs1));
        String strs2[] = {"dog","racecar","car"};
         System.out.print("The prefix:"+sc.longestCommonPrefix(strs2));
    }
}