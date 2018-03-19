import java.util.ArrayList;

/**
 * @author Mert Ozer
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.
 * Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters.
Letters are case sensitive, so "a" is considered a different type of stone from "A".
 */
public class Jewels_and_Stones_771 {

    public static void main(String [] args)
    {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }
    public static int numJewelsInStones(String J, String S) {
        int num = 0;
        ArrayList list = new ArrayList();
        for (char j:J.toCharArray())
            list.add(j);
        for (char s: S.toCharArray()){
            if(list.contains(s))
                num++;
        }
        return num;
    }
}
