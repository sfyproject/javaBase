package sunfy;

/**
 * 冒泡排序语法示例
 * successful
 * sfyxsy changes
 */
public class BubbleSort {

    public static void main(String[] args){
        int[] arr = {1,3,65,34,56,8};
        for (int i = 0; i < arr.length; i++) {
            System.out.println("原始数据---"+arr[i]);
        }
        for(int i=0;i< arr.length;i++){
            for(int j=0;j < arr.length - i - 1;j++){
                // 倒序
                if(arr[j+1] > arr[j]){
                    int a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("排序后的数据为："+ arr[i]);
        }

    }
}
