package day;

/**
 * @ClassName Solution3
 * @Author tang
 * @Date 2020/4/18 0018 下午 3:12
 * @Version 1.0
 */
public class Solution3 {

    /**
     * 给出一个32位的有符号整数，你需要将这个整数中每位上的数字进行反转。
     */
    public static int reverse(int x) {
        long n = 0;
        while(x!=0){
            n = n*10 + x%10;
            x /= 10;
        }

        return (int)n==n?(int)n:0;
    }

    public static void main(String[] args) {
        int reverse = reverse(12345678);
        System.out.println(reverse);
    }
}
