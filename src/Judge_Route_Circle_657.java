/**
 * @author Mert Ozer
 */
public class Judge_Route_Circle_657 {
    public static void main(String[] args){

        System.out.println(judgeCircle("UWD"));
    }
    public static boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (Character c:moves.toCharArray()){
            if (c.equals('U'))
                y++;
            else if (c.equals('D'))
                y --;
            else if (c.equals('R'))
                x--;
            else if (c.equals('L'))
                x ++;
        }
        return(x == 0 && y == 0);
    }
}
