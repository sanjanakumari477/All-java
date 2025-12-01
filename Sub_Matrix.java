public class MatrixSubtraction {
    public static void main(String[] args) {
        
        int[][] matrix1 = {
            {5, 8, 3},
            {6, 7, 2}
        };

        int[][] matrix2 = {
            {2, 4, 1},
            {3, 1, 5}
        };

  
        int[][] result = new int[2][3];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        System.out.println("Result of Matrix Subtraction:");
        for (int i = 0
