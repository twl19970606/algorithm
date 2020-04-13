package sort;

/**
 * @ClassName SelectionSort
 * @Author tang
 * @Description 选择排序
 * @Date 2020/4/13 0013 下午 2:12
 * @Version 1.0
 */
public class SelectionSort {

    public static void sort(int[] array){

        for (int i = 0; i < array.length ; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length ; j++) {
                if(array[j]<array[minIndex]){
                    int temp;
                    temp = array[minIndex];
                    array[minIndex] = array[j];
                    array[j] = temp;
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
    }
}
