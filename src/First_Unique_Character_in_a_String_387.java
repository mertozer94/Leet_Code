/**
 * @author Mert Ozer
 *
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
 */
public class First_Unique_Character_in_a_String_387 {
    public static void main(String[] args){
        System.out.println(firstUniqChar("leetcode"));
        System.out.println(firstUniqChar("loveleetcode"));
        System.out.println(firstUniqChar("cc"));
    }
    public static int firstUniqChar(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++)
            count[s.charAt(i) -'a'] += 1;
        for (int j = 0; j < s.length(); j++){
            if (count[s.charAt(j) -'a'] == 1)
                return j;
        }
        return -1;
    }
}

