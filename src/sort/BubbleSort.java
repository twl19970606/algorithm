package sort;

/**
 * @ClassName BubbleSort
 * @Author tang
 * @Description 冒泡排序
 * @Date 2020/4/13 0013 上午 10:28
 * @Version 1.0
 */
public class BubbleSort {

    public static void sort(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                int temp;
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void sort2(int[] array){
        for (int i = 0; i<array.length-1 ; i++) {
            for (int j = array.length-1; j>i; j--) {
                int temp;
                if(array[j]<array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] array = {1,5,6,2,0,7,4,8,5,4,2};
        sort(array);
        for (int a:array) {
            System.out.print(a);
        }
        System.out.println("");
        int[] array2 = {1,5,6,2,0,7,4,8,5,4,2};
        sort2(array2);
        for (int a:array2) {
            System.out.print(a);
        }
    }
}
