package sort;

/**
 * @ClassName QuickSort
 * @Author tang
 * @Description 快速排序
 * @Date 2020/4/13 0013 下午 5:19
 * @Version 1.0
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5,88,47,56,8,12,34,54,63,99,21,77,65,3,58};
        sort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+",");
        }
    }

    public static void QuickSort(int[] arr,int low,int high){
        int i,j,temp,t;
        if(low>high){
            return;
        }
        i=low;
        j=high;
        //temp就是基准位
        temp = arr[low];

        while (i<j) {
            //先看右边，依次往左递减
            while (temp<=arr[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp>=arr[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            if (i<j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        QuickSort(arr, low, j-1);
        //递归调用右半数组
        QuickSort(arr, j+1, high);
    }


    public static void sort(int[] array,int low,int high){
        if(low>high){
            return;
        }

        int i = low;
        int j = high;
        int temp = array[i];

        while(i<j){
            while (temp<=array[j]&&i<j){
                j--;
            }
            while (temp>=array[i]&&i<j){
                i++;
            }
            if(i<j){
                int x = array[i];
                int y = array[j];
                array[i] = y;
                array[j] = x;
            }
        }

        array[low] = array[i];
        array[i] = temp;

        sort(array,low,i-1);
        sort(array,i+1,high);
    }
}
