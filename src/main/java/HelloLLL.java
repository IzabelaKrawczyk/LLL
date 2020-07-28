package main.java;

public class HelloLLL {

    public static void
    main(String[] args) {

        int[][] basis;
        basis = new int[][]{{1, 5,2,8,9,10}, {0,6,1,0,0,7 }, {3, 7, 3,5,3,0}};
       LLLReduce reduced= new LLLReduce(basis);
       System.out.print(reduced);

    }



}
