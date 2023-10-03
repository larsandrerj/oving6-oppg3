public class Matrix {
    private int[][] matrix = null;

    private final int[][] zeroMatrix = new int[][]{{0, 0},{0, 0}};

    public Matrix(int[][] inputMatrix) {
        this.matrix = inputMatrix;
    }

    public int[][] add(int[][] input) {
        if (this.matrix.length != input.length || this.matrix[0].length != input[0].length) {
            return zeroMatrix;
        }
        int[][] result = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                result[i][j] = matrix[i][j] + input[i][j];
            }
        }

        return result;
    }
    public int[][] mul(int[][] input) {
        if (this.matrix.length != input[0].length) {
            return zeroMatrix;
        }
        int[][] result = new int[matrix[0].length][input.length];

        for (int i = 0; i < result[0].length; i++) {
            for (int j = 0; j < result.length; j++) {
                for (int k = 0; k < input[0].length; k++) {
                    result[i][j] += matrix[k][j] * input[i][k];
                }
            }
        }

        return result;
    }
    public int[][] trans() {
        int[][] result = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < this.matrix[0].length; i++) {
            for (int j = 0; j < this.matrix.length; j++) {
                result[i][j] = this.matrix[j][i];
            }

        }
        return result;
    }

}
