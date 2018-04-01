import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Mert Ozer
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Note:
Assume the length of given string will not exceed 1,010.

Example:

Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
public class Longest_Palindrome_409 {
    public static void main(String[] args){

        String[] test = {"ab","aa","aba","Aba","dcAbc","dcaabc","c","","abcde","aaabbbc","aabbccddeeffg"};
        for (String s:test)
            System.out.println(longestPalindrome(s));
    }
    public static int longestPalindrome(String s) {
        if(s==null || s.length()==0) return 0;
        HashSet<Character> hashSet = new HashSet<Character>();
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(hashSet.contains(s.charAt(i))){
                hashSet.remove(s.charAt(i));
                count++;
            }else{
                hashSet.add(s.charAt(i));
            }
        }
        if(!hashSet.isEmpty())
            return count*2+1;
        return count*2;
    }
}
