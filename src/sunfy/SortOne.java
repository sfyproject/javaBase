package sunfy;

public class SortOne {

    /*
    问题描述：给定一组数字，以及一个数字`k`，确定这组数字中，是否存在任意两个数字，其相加之和等于`k`。
     */
    void getKFirst(int str[],int k){
        System.out.println("方法一：【暴力破解法】-满足条件的数字组合有：");
        for (int i = 0; i < str.length; i++) {
            for (int j = 1; j < str.length; j++) {
                if(str[i] + str[j] == k)
                    System.out.println("第一个数字："+str[i]+";第二个数字："+str[j]);
            }
        }
    }

    void getKTwo(int str[],int k){
        System.out.println("方法二：满足条件的数字组合有：");
        int strAdd[] = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            strAdd[i] = k - str[i];
        }
        for (int i = 0; i < strAdd.length; i++) {
            if(str[i] == strAdd[i]){
                System.out.println("第一个数字为："+str[i]+"；第二个数字为："+strAdd[i]);
            }
        }
    }

    public static void main(String[] args) {

        SortOne sortOne = new SortOne();

        int[] str = {2,3,5,4,6,8};
        int k = 10;
        // 方法一
        sortOne.getKFirst(str,k);
        // 方法二
        sortOne.getKTwo(str,k);

    }
}
