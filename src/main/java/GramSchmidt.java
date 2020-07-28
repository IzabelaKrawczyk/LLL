package main.java;

import static main.java.Vector.*;

public class GramSchmidt {
    double[][] orthognalizedBasis;
    double[][] projectionCoeff;
    double[] B;

    public double[][] getOrthognalizedBasis() {
        return orthognalizedBasis;
    }

    public double[][] getProjectionCoeff() {
        return projectionCoeff;
    }

    public double[] getB() {
        return B;
    }

    public GramSchmidt(int[][] basis)
    {
        orthognalizedBasis=new double[basis.length][basis[0].length];
        projectionCoeff=new double[basis.length][basis[0].length];
        for(int i=0; i< basis.length; i++){
            for(int j=0; j<basis[0].length; j++) {
                orthognalizedBasis[i][j]= basis[i][j];
            }
        }
        for(int i=1; i<basis.length; i++){
            double[] vector= new double[basis[i].length];
            for(int j=0; j<basis[i].length; j++)
                vector[j]= basis[i][j];

            for(int j=i-1; j>=0;j--){
                projectionCoeff[i][j]= scalarProduct(orthognalizedBasis[i], orthognalizedBasis[j])/scalarProduct(orthognalizedBasis[j],orthognalizedBasis[j]);
                vector=subtract(vector, multiplyByScalar( projectionCoeff[i][j],orthognalizedBasis[j]));
            }
            orthognalizedBasis[i]=vector;
        }
        B=new double[basis.length];
        for(int i=0; i<basis.length; i++)
            B[i]=scalarProduct(orthognalizedBasis[i], orthognalizedBasis[i]);

    }

}
