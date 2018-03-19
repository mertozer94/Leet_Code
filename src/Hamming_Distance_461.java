/**
 * @author Mert Ozer
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.
 */
public class Hamming_Distance_461 {

    public static void main(String [] args)
    {
        System.out.println(hammingDistance(1, 15));
    }
    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
