class Solution {
    public boolean isPalindrome(String s) {
         s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        
        // Step 2: reverse
        String reverse = new StringBuilder(s).reverse().toString();
        
        // Step 3: compare
        return s.equals(reverse);
        
    }
}
