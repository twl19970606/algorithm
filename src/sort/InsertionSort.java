package sort;

/**
 * @ClassName InsertionSort
 * @Author tang
 * @Description 插入排序
 * @Date 2020/4/13 0013 下午 3:03
 * @Version 1.0
 */
public class InsertionSort {

    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i;j>0;j--){
                if(array[j]<array[j-1]){
                    int temp;
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }
    }

    public static void sort2(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i;j > 0 && array[j]<array[j-1];j--){
                int temp;
                temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1,5,6,2,0,7,4,8,5,4,2};
        sort2(array);
        for (int a:array) {
            System.out.print(a);
        }
    }
}
