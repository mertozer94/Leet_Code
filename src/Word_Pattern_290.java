import java.util.HashMap;

/**
 * @author Mert Ozer
 * Given a pattern and a string str, find if str follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Examples:
pattern = "abba", str = "dog cat cat dog" should return true.
pattern = "abba", str = "dog cat cat fish" should return false.
pattern = "aaaa", str = "dog cat cat dog" should return false.
pattern = "abba", str = "dog dog dog dog" should return false.
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.


 */
public class Word_Pattern_290 {
    public static void main(String[] args){
        System.out.println(wordPattern("abba","dog cat cat dog"));
        System.out.println(wordPattern("abba","dog cat cat fish"));
        System.out.println(wordPattern("aaaa","dog cat cat dog"));
        System.out.println(wordPattern("abba","dog dog dog dog"));
    }
    public static boolean wordPattern(String pattern, String str) {
        //split once ofc
        if (pattern.length() != str.split(" ").length)
            return false;
        HashMap<Character, String> map = new HashMap<>();
        int i = 0 ;

        for (String word:str.split(" ")){
            Character c = pattern.charAt(i);
            if (map.containsKey(c)){
                if (!map.get(c).equals(word))
                    return false;
            }
            else{
                if (map.values().contains(word))
                    return false;
                else
                    map.put(c,word);
            }
            i++;
        }
        return true;
    }
}
