import java.util.HashMap;

/**
 * @author Mert Ozer
 * Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

Note:
You may assume both s and t have the same length.
 */
public class Isomorphic_Strings_205 {
    public static void main(String[] args){

        System.out.println(isIsomorphic("paper","title"));
    }
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++){

            if (map.containsKey(s.charAt(i))){
                if (map.get(s.charAt(i)) != t.charAt(i))
                    return false;

            }
            else if (map.values().contains(t.charAt(i)))
                return false;
            else {
                map.put(s.charAt(i),t.charAt(i));
            }

        }
        return true;

    }
    /*
    *     bool isIsomorphic(string s, string t) {
        int m1[256] = {0}, m2[256] = {0}, n = s.size();
        for (int i = 0; i < n; ++i) {
            if (m1[s[i]] != m2[t[i]]) return false;
            m1[s[i]] = i + 1;
            m2[t[i]] = i + 1;
        }
        return true;
    }
    * */
}
