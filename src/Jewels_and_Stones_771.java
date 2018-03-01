import java.util.ArrayList;

/**
 * @author Mert Ozer
 */
public class Jewels_and_Stones_771 {

    public static void main(String [] args)
    {
        Jewels_and_Stones_771 solution = new Jewels_and_Stones_771();
        System.out.println(solution.numJewelsInStones("aA", "aAAbbbb"));
    }
    public int numJewelsInStones(String J, String S) {
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
