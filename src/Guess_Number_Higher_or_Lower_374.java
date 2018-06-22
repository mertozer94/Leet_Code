/**
 * @author Mert Ozer
 * We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I'll tell you whether the number is higher or lower.

You call a pre-defined API guess(int num) which returns 3 possible results (-1, 1, or 0):

-1 : My number is lower
1 : My number is higher
0 : Congrats! You got it!
Example:
n = 10, I pick 6.

Return 6.
 */
public class Guess_Number_Higher_or_Lower_374 {
    public int guessNumber(int n) {
        return helper(1, n);
    }
    public int helper(int lo, int hi){
        while(lo <= hi){
            int me = lo + (hi-lo)/2 ;
            if (guess(me) == 0)
                return me;
            else if (guess(me) == 1)
                lo = me + 1;
            else
                hi = me;
        }
        return 0;
    }
    public int guess(int i){return 0;}
}
