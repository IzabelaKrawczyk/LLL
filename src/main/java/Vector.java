package main.java;

public class Vector {

    public static double scalarProduct(double[] vector1, double[] vector2) {
        if (vector1.length != vector2.length) throw new IllegalArgumentException("Vectors aren't the same length");
        double product = 0.0;
        for (int i = 0; i < vector1.length; i++)
            product += vector1[i] * vector2[i];

        return product;
    }

    public static double[] multiplyByScalar(double scalar, double[] vector) {
        double[] newVector = new double[vector.length];
        for (int i = 0; i < vector.length; i++)
            newVector[i] = scalar * vector[i] * 1.0;
        return newVector;
    }

    public static int[] multiplyByScalar(int scalar, int[] vector) {
        int[] newVector = new int[vector.length];
        for (int i = 0; i < vector.length; i++)
            newVector[i] = scalar * vector[i];
        return newVector;
    }

    public static double[] multiplyByScalar(double scalar, int[] vector) {
        double[] newVector = new double[vector.length];
        for (int i = 0; i < vector.length; i++)
            newVector[i] = scalar * vector[i] * 1.0;
        return newVector;
    }

    public static double[] multiplyByScalar(int scalar, double[] vector) {
        double[] newVector = new double[vector.length];
        for (int i = 0; i < vector.length; i++)
            newVector[i] = scalar * vector[i] * 1.0;
        return newVector;
    }

    public static double[] subtract(double[] vector1, double[] vector2) {
        if (vector1.length != vector2.length) throw new IllegalArgumentException("Vectors aren't the same length");
        double[] newVector = new double[vector1.length];
        for (int i = 0; i < vector1.length; i++)
            newVector[i] = vector1[i] - vector2[i];
        return newVector;
    }

    public static int[] subtract(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) throw new IllegalArgumentException("Vectors aren't the same length");
        int[] newVector = new int[vector1.length];
        for (int i = 0; i < vector1.length; i++)
            newVector[i] = vector1[i] - vector2[i];
        return newVector;
    }

    static final int R = 3;
    static final int C = 3;


    static void swap(int mat[][], int row1, int row2, int col) {
        for (int i = 0; i < col; i++) {
            int temp = mat[row1][i];
            mat[row1][i] = mat[row2][i];
            mat[row2][i] = temp;
        }
    }

    static int rankOfMatrix(int mat[][])
    {
        int C=mat[0].length;
        int R=mat.length;
        int rank =C;

        for (int row = 0; row < rank; row++) {
            if (mat[row][row] != 0) {
                for (int col = 0; col < R; col++) {
                    if (col != row) {
                        double mult = (double)mat[col][row] / mat[row][row];
                        for (int i = 0; i < rank; i++)
                            mat[col][i] -= mult * mat[row][i];
                    }
                }
            }
            else {
                boolean reduce = true;
                for (int i = row + 1; i < R; i++){
                    if (mat[i][row] != 0) {
                        swap(mat, row, i, rank);
                        reduce = false;
                        break ;
                    }
                }
                if (reduce) {
                    rank--;
                    for (int i = 0; i < R; i ++)
                        mat[i][row] = mat[i][rank];
                }
                row--;
            }
        }
        return rank;
    }
}


