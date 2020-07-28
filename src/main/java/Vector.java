package main.java;

public class Vector {

    public static double scalarProduct(double[] vector1, double[] vector2){
        if(vector1.length != vector2.length) throw new IllegalArgumentException("Vectors aren't the same length");
        double product=0.0;
        for(int i=0; i<vector1.length; i++)
            product+=vector1[i]*vector2[i];

        return product;
    }

    public static double[] multiplyByScalar(double scalar, double[] vector){
        double[] newVector=new double[vector.length];
        for(int i=0; i<vector.length; i++)
            newVector[i]=scalar*vector[i]*1.0;
        return newVector;
    }

    public static int[] multiplyByScalar(int scalar, int[] vector){
        int[] newVector=new int[vector.length];
        for(int i=0; i<vector.length; i++)
            newVector[i]=scalar*vector[i];
        return newVector;
    }
    public static double[] multiplyByScalar(double scalar, int[] vector){
        double[] newVector=new double[vector.length];
        for(int i=0; i<vector.length; i++)
            newVector[i]=scalar*vector[i]*1.0;
        return newVector;
    }

    public static double[] multiplyByScalar(int scalar, double[] vector){
        double[] newVector=new double[vector.length];
        for(int i=0; i<vector.length; i++)
            newVector[i]=scalar*vector[i]*1.0;
        return newVector;
    }

    public static double[] subtract(double[] vector1, double[] vector2){
        if(vector1.length != vector2.length) throw new IllegalArgumentException("Vectors aren't the same length");
        double[] newVector=new double[vector1.length];
        for(int i=0; i<vector1.length; i++)
            newVector[i]=vector1[i]-vector2[i];
        return newVector;
    }

    public static int[] subtract(int[] vector1, int[] vector2){
        if(vector1.length != vector2.length) throw new IllegalArgumentException("Vectors aren't the same length");
        int[] newVector=new int[vector1.length];
        for(int i=0; i<vector1.length; i++)
            newVector[i]=vector1[i]-vector2[i];
        return newVector;
    }


}
