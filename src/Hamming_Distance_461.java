/**
 * @author Mert Ozer
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
