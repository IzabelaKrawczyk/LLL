package test.java;

import main.java.GramSchmidt;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class GramSchmidtTest {
    @Test
    public void GramSchmidtTest1(){
        int[][] B;
        double[][] expectedValue;
        B = new int[][]{{1, 5,2}, {0,6,1 }, {3, 7, 3}};
        expectedValue = new double[][]{{1, 5,2},{-1.066666667,0.666666667, -1.133333333},{0.813953488, 0.11627907,-0.697674419}};
        GramSchmidt orthbasis=new GramSchmidt(B);
        double[][] value=orthbasis.getOrthognalizedBasis();
        for (int i = 0; i < 3; i++) {
            assertArrayEquals(expectedValue[i], value[i], 0.005);
        }
    }

    @Test
    public  void GramSchmidtTest2(){
        int[][] basis;
        double[][] expectedValue=new double[][]{{1, 5,2,8,9,10},{-0.370909091, 4.145454545, 0.258181818, -2.967272727, -3.338181818, 3.290909091},
                {2.625848692, 4.652279329, 2.172203362,2.006789533, -0.367361775, -4.297971235}};
        basis = new int[][]{{1, 5,2,8,9,10}, {0,6,1,0,0,7 }, {3, 7, 3,5,3,0}};
        GramSchmidt orthbasis=new GramSchmidt(basis);
        double[][] value=orthbasis.getOrthognalizedBasis();

        for (int i = 0; i < 3; i++) {
            assertArrayEquals(expectedValue[i], value[i],0.005);
        }
    }

}
