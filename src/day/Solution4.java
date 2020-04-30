package day;

/**
 * @ClassName Solution4
 * @Author tang
 * @Date 2020/4/28 0028 下午 5:59
 * @Version 1.0
 */
public class Solution4 {

    public static void main(String[] args) {

    }

    /**
     * 判断是否是回文数
     * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数
     */
    public static boolean isPalindrome(int number){
        if(number<0){
            return false;
        }
        //优化
        if(number<10){
            return false;
        }
        if(number%10==0){
            return false;
        }
        int i = reverse(number);
        if(i==number){
            return true;
        }
        return false;
    }

    public static int reverse(int x){
        long n = 0;
        while (x!=0){
            n = n*10 + x%10;
            x /= 10;
        }
        return (int)n==n?(int)n:0;
    }
}
