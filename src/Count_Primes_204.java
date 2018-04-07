/**
 * @author Mert Ozer
 * Description:

Count the number of prime numbers less than a non-negative number, n.


 */
public class Count_Primes_204 {
    public static void main(String[] args){
        System.out.println(countPrimes(4));
    }

    public static int countPrimes(int n) {
        if (n < 3)
            return 0;

        boolean[] notPrime = new boolean[n];

        notPrime[0] = true;
        notPrime[1] = true;

        for (int i = 2; i < Math.sqrt(n); i++){
            if (!notPrime[i])
            for(int j = 2; j * i < n; j++){
                notPrime[i*j] = true;
            }
        }

        int cnt = 0;
        for (int t = 0; t < notPrime.length; t++)
            if (!notPrime[t])
                cnt++;
        return cnt;
    }
}
