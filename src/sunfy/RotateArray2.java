package sunfy;

import java.util.Arrays;

/**
 * 二维数据的旋转问题
 */
public class RotateArray2 {

    public void rotate(int[][] matrix) {
        System.out.println("******旋转前的数据为******");
        System.out.println(Arrays.deepToString(matrix));
        if (matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        //顺时针旋转270度
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println("******顺时针旋转270度的数据为******");
        System.out.println(Arrays.deepToString(matrix));
        //逆时针旋转180度
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length - 1 - j];
                matrix[i][matrix[0].length - 1 - j] = temp;
            }
        }
        System.out.println("******旋转后的数据为******");
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void main(String[] args) {
        RotateArray2 rotateArray2 = new RotateArray2();
        int[][] matrix = {{1,2},{3,4}};
        rotateArray2.rotate(matrix);
    }
}
