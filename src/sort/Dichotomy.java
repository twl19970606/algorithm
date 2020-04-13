package sort;

/**
 * @ClassName Dichotomy
 * @Author tang
 * @Description 二分法
 * @Date 2020/4/13 0013 下午 3:14
 * @Version 1.0
 */
public class Dichotomy {

    public static final int[] array = {0,1,2,3,5,6,7,8,9,10};

    public static int getIndex(int value){
        int startIndex = 0;
        int endIndex = array.length-1;

        while (startIndex<endIndex){
            int mid = (startIndex+endIndex)/2;
            if(array[mid]==value){
                return mid;
            }else if(array[mid]<value){
                startIndex = mid;
            }else{
                endIndex = mid;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(getIndex(4));
    }
}
