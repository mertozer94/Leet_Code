import java.util.Stack;

/**
 * @author Mert Ozer
 *
 * Given two strings S and T, return if they are equal when both are typed into empty text editors. # means a backspace character.

Example 1:

Input: S = "ab#c", T = "ad#c"
Output: true
Explanation: Both S and T become "ac".
Example 2:

Input: S = "ab##", T = "c#d#"
Output: true
Explanation: Both S and T become "".
Example 3:

Input: S = "a##c", T = "#a#c"
Output: true
Explanation: Both S and T become "c".
Example 4:

Input: S = "a#c", T = "b"
Output: false
Explanation: S becomes "c" while T becomes "b".
Note:

1 <= S.length <= 200
1 <= T.length <= 200
S and T only contain lowercase letters and '#' characters.
Follow up:

Can you solve it in O(N) time and O(1) space?
 */
public class Backspace_String_Compare_844 {
    public static void main(String[] args){
        System.out.println(backspaceCompare("ab##", "c#d#"));
    }
    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> s1 = createStack(S);
        Stack<Character> s2 = createStack(T);
        StringBuilder str1 = new StringBuilder("a");
        StringBuilder str2 = new StringBuilder("a");
        while(!s1.isEmpty())
            str1.append(s1.pop());
        while(!s2.isEmpty())
            str2.append(s2.pop());


        return str1.toString().equals(str2.toString());
    }
    public static Stack<Character> createStack(String S){
        Stack<Character> stack = new Stack();
        for(Character c: S.toCharArray()){
            if (c == '#'){
                if(stack.isEmpty())
                    continue;
                else
                    stack.pop();
            }
            else
                stack.push(c);
        }
        return stack;
    }
}
