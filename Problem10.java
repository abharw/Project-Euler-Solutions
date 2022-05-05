import java.math.BigInteger;

// answer is 142913828922
// the program takes a while to finish and may crash your computer

public class Problem10 {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.valueOf(0);
        int num = 2;
        while(num <= 2_000_000) {
            if(isprime(num)) {
                sum = sum.add(BigInteger.valueOf(num));
                System.out.println("prime number found: " + num);
            }
            num++;
        }
        System.out.println(sum);
    }

    public static boolean isprime(int num) {
        boolean flag = false;
        int i = 2;
        while (i <= num / 2) {
        // condition for nonprime number
        if (num % i == 0) {
            flag = true;
            break;
        }
        i++;
        }
        return !flag;
    }
}
