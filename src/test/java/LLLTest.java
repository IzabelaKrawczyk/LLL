package test.java;

import main.java.LLL;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class LLLTest {

   @Test
   public void simpleLLTest(){
         int[][] B;
         int[][] expectedValue;
         B = new int[][]{{1, 5,2}, {0,6,1 }, {3, 7, 3}};
         expectedValue = new int[][]{{-1,1,-1},{2,0,-1},{0,-2,-2}};
         LLL.integral_LLL(B, 3,3);
         for (int i = 0; i < 3; i++) {
            assertArrayEquals(expectedValue[i], B[i]);
         }
      }

      @Test
      public  void simpleLLLTest2(){
          int[][] basis;
          int[][] expectedValue=new int[][]{{0,6,1,0,0,7},{3,1,2,5,3,-7},{-2,-8,-2,3,6,3}};
          basis = new int[][]{{1, 5,2,8,9,10}, {0,6,1,0,0,7 }, {3, 7, 3,5,3,0}};
          LLL.integral_LLL(basis, 3,6);
          for (int i = 0; i < 3; i++) {
              assertArrayEquals(expectedValue[i], basis[i]);
          }
      }

      @Test(expected = RuntimeException.class)
      public void throwsException() {
          int[][] basis=new int[][]{{1, 5,2}, {0,6,1 }, {3, 7, 3},{1,2,3}};
          LLL.integral_LLL(basis,4,3);

      }

   }

