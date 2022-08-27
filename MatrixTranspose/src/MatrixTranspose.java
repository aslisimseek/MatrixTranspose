import java.util.Arrays;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {{2, 3}, {4, 9}, {5, 12}};

    /*  Matrix     =>   Transpose
        [2][3]
        [4][9]     =>  [2][4][5]
        [5][12]        [3][9][12]
     */
        System.out.println("Matrix");
        System.out.println("************************");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "      ");
            }
            System.out.println("");
        }

        System.out.println("Transpose");
        System.out.println("************************");

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i] + "      ");
            }
            System.out.println("");
        }

    }

}
