package main.java;

import java.util.Arrays;

import static main.java.Vector.multiplyByScalar;
import static main.java.Vector.subtract;

public class LLLReduce {


    @Override
    public String toString() {
        return Arrays.deepToString(reducedBasis);
    }

    public int[][] reducedBasis;
    public double delta;

    public int[][] getReducedBasis() {
        return reducedBasis;
    }

    public double getDelta() {
        return delta;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public LLLReduce(int[][] basis) {
        delta=0.75;
        reducedBasis=new int[basis.length][basis[0].length];
        System.arraycopy(basis, 0, reducedBasis, 0, basis.length);


        GramSchmidt gram = new GramSchmidt( reducedBasis);
        int k = 1;
        int q;
        while (k < reducedBasis.length) {
            for (int j = k - 1; j >= 0; j--) {
                q=(int) Math.round(gram.projectionCoeff[k][j]);
                reducedBasis[k] = subtract( reducedBasis[k], multiplyByScalar(q,  reducedBasis[j]));
            }
            gram = new GramSchmidt( reducedBasis);
            int[] vector = reducedBasis[k];
            if (gram.B[k] >= (delta - (gram.projectionCoeff[k][k - 1] * gram.projectionCoeff[k][k - 1])) * gram.B[k - 1])
                k = k + 1;
            else {
                reducedBasis[k] = reducedBasis[k - 1];
                reducedBasis[k - 1] = vector;
                gram = new GramSchmidt(reducedBasis);
                k = Math.max(1, k - 1);
            }

        }
    }

    public LLLReduce(int[][] basis, double delta) {
        reducedBasis=new int[basis.length][basis[0].length];
        System.arraycopy(basis, 0, reducedBasis, 0, basis.length);

        GramSchmidt gram = new GramSchmidt( reducedBasis);
        int k = 1;
        while (k <  reducedBasis.length) {
            int q;
            for (int j = k - 1; j >= 0; j--) {
                q=(int) Math.round(gram.projectionCoeff[k][j]);
                reducedBasis[k] = subtract( reducedBasis[k], multiplyByScalar(q,  reducedBasis[j]));
            }
            gram = new GramSchmidt( reducedBasis);
            int[] vector = reducedBasis[k];
            if (gram.B[k] >= (delta - (gram.projectionCoeff[k][k - 1] * gram.projectionCoeff[k][k - 1])) * gram.B[k - 1])
                k = k + 1;
            else {
                reducedBasis[k] = reducedBasis[k - 1];
                reducedBasis[k - 1] = vector;
                gram = new GramSchmidt(reducedBasis);
                k = Math.max(1, k - 1);
            }

        }
    }

}

