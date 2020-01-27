package main.java;

public class HelloLLL {
    public static void
    main(String[] args) {

        int[][] basis;
        basis = new int[][]{{1,5,2,8,9,10}, {0,6,1,0,0,7}, {3,7,3,5,3,0}};
        LLL.integral_LLL(basis, 3,6);

        for(int i=0; i<3;i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(basis[i][j] + " ");
            }
            System.out.println();
        }

    }


}
