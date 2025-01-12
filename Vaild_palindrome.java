class Vaild_palindrome {
    public boolean isPalindrome(String s) {
        // Remove all non-alphanumeric characters and convert to lowercase
        String str1 = s.replaceAll("[^a-zA-Z0-9]", "");
        String str = str1.toLowerCase();
        
        int start = 0;
        int end = str.length() - 1;

        // Check characters from both ends
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }

        // If no mismatch is found, the string is a palindrome
        return true;
    }

    public static void main(String[] args) {
        Vaild_palindrome s = new Vaild_palindrome();
        
        String s1 = "A man, a plan, a canal: Panama";
        System.out.println("Is this a palindrome? " + s.isPalindrome(s1)); 
        
        String s2 = "race a car";
        System.out.println("Is this a palindrome? " + s.isPalindrome(s2)); 
    }
}
