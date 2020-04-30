package day;

/**
 * @ClassName FindPrime
 * @Author tang
 * @Description 查找质数
 * @Date 2020/4/15 0015 下午 3:57
 * @Version 1.0
 */

/**
 * 求区间内的所有质数
 */
public class FindPrime {

    /**
     * 一个数若可以进行因数分解，那么分解时得到的两个数一定是一个小于等于sqrt(n)，一个大于等于sqrt(n)，
     * 据此，上述代码中并不需要遍历到n-1，遍历到sqrt(n)即可，因为若sqrt(n)左侧找不到约数，那么右侧也一定找不到约数
     */
    public static void find(int left,int right){
        for (int i = left; i <= right; i++) {
            if(i%2==0){
                continue;
            }
            double sqrt = Math.sqrt(i);
            boolean flag = true;
            for (int j = 2; j <= sqrt; j++) {
                if(i%j==0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
            }
        }
    }

    /**
     令x≥1，将大于等于5的自然数表示如下：
     ······ 6x-1，6x，6x+1，6x+2，6x+3，6x+4，6x+5，6(x+1），6(x+1)+1 ······
     可以看到，不在6的倍数两侧，即6x两侧的数为6x+2，6x+3，6x+4，由于2(3x+1)，3(2x+1)，2(3x+2)，所以它们一定不是素数，
     再除去6x本身，显然，素数要出现只可能出现在6x的相邻两侧。这里有个题外话，关于孪生素数，有兴趣的道友可以再另行了解一
     下，由于与我们主题无关，暂且跳过。这里要注意的一点是，在6的倍数相邻两侧并不是一定就是质数。此时判断质数可以6个为单
     元快进，即将方法（2）循环中i++步长加大为6，加快判断速度，原因是，假如要判定的数为n，则n必定是6x-1或6x+1的形式，对
     于循环中6i-1，6i，6i+1,6i+2，6i+3，6i+4，其中如果n能被6i，6i+2，6i+4整除，则n至少得是一个偶数，但是6x-1或6x+1的
     形式明显是一个奇数，故不成立；另外，如果n能被6i+3整除，则n至少能被3整除，但是6x能被3整除，故6x-1或6x+1（即n）不可
     能被3整除，故不成立。综上，循环中只需要考虑6i-1和6i+1的情况，即循环的步长可以定为6，每次判断循环变量k和k+2的情况即可
     */
    public static boolean find(int number){
        if(0==number||1==number){
            return false;
        }
        if(2==number||3==number){
            return true;
        }
        if(number%6!=1&&number%6!=5){
            return false;
        }
        double temp = Math.sqrt(number);
        for (int i = 5; i <= temp ; i+=6) {
            if(number%i==0||number%(i+2)==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //find(10,200);

        for (int i = 0; i <1000 ; i++) {
            if(find(i)){
                System.out.println(i);
            }
        }
    }
}
