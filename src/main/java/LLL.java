package main.java;

public class LLL {

    public static void REDI_IL(int k, int l, int[][] b, int vector_dimension, long[] d, long[][] lambda)
    // the REDI procedure for the integer LLL algorithm (algorithm 2.6.7 in
    // Cohen's book)
    {
        if (Math.abs(2 * lambda[k][l]) <= d[l + 1]) {
            return;
        }

        long q = (long) Math.floor(((float) (2 * lambda[k][l] + d[l + 1]))
                / (2 * d[l + 1]));

        // q is the integer quotient of the division
        // (2*lambda[k][l]+d[l+1])/(2*d[l+1]).

        for (int m = 0; m < vector_dimension; m++) {
            b[k][m] -= q * b[l][m];
        }

        lambda[k][l] -= q * d[l + 1];

        for (int i = 0; i <= l - 1; i++) {
            lambda[k][i] -= q * lambda[l][i];
        }
    }

    public static void SWAPI(int k, int k_max, int[][] b, long[] d, long[][] lambda)
    // the SWAPI procedure of algorithm 2.6.7
    {

        // exchange b[k] and b[k-1]
        // This can be done efficiently by swapping pointers (not entries).
        int[] aswap = b[k];
        b[k] = b[k - 1];
        b[k - 1] = aswap;

        if (k > 1) {
            for (int j = 0; j <= k - 2; j++) {
                // exchange lambda[k][j] and lambda[k-1][j]
                long swap = lambda[k][j];
                lambda[k][j] = lambda[k - 1][j];
                lambda[k - 1][j] = swap;
            }
        }

        long _lambda = lambda[k][k - 1];

        long B = (d[k - 1] * d[k + 1] + _lambda * _lambda) / d[k];
        // It might be better to choose another evaluation order for this
        // formula,
        // see below.

        for (int i = k + 1; i <= k_max; i++) {
            long t = lambda[i][k];
            lambda[i][k] = (d[k + 1] * lambda[i][k - 1] - _lambda * t) / d[k];
            lambda[i][k - 1] = (B * t + _lambda * lambda[i][k]) / d[k + 1];
        }

        d[k] = B;
    }




    public static void integral_LLL(int[][] b, int number_of_vectors,  int vector_dimension) {

        // consider special case

        if (number_of_vectors <= 1) {
            // 0 or 1 input vector, nothing to be done
            return;
        }

        // memory allocation

        // The names are chosen (as far as possible) according to Cohen's book.
        // However, for technical reasons, the indices do not run from 1 to
        // (e.g.) number_of_vectors, but from 0 to number_of_vectors-1.
        // Therefore all indices are shifted by -1 in comparison with this book,
        // except from the indices of the array d which has size
        // number_of_vectors+1.

        long[] d = new long[number_of_vectors + 1];

        long[][] lambda = new long[number_of_vectors][];
        for (int s = 1; s < number_of_vectors; s++) {
            lambda[s] = new long[s];
        }
        // We only need lambda[n][k] for n>k.

        // Step 1: Initialization

        int k = 1;
        int k_max = 0;
        // for iteration
        d[0] = 1;

        d[1] = 0;
        for (int n = 0; n < vector_dimension; n++) {
            d[1] += b[0][n] * b[0][n];
        }
        // Now, d[1] is the scalar product of b[0] with itself.

        // The other steps are not programmed with "goto" as in Cohen's book.
        // Instead, we enter a do-while-loop which terminates iff k>r.

        do {

            // Step 2: Incremental Gram-Schmidt

            if (k > k_max)
            // else we can immediately go to step 3.
            {
                k_max = k;

                for (int j = 0; j <= k; j++) {
                    int u = 0;
                    // compute scalar product of b[k] and b[j]
                    for (int n = 0; n < vector_dimension; n++) {
                        u += b[k][n] * b[j][n];
                    }

                    for (int i = 0; i <= j - 1; i++) {
                        u *= d[i + 1];
                        u -= lambda[k][i] * lambda[j][i];
                        u /= d[i];

                        // u=(d[i+1]*u-lambda[k][i]*lambda[j][i])/d[i];
                    }

                    if (j < k) {
                        lambda[k][j] = u;
                    } else {
                        // j==k
                        d[k + 1] = u;
                    }
                }

                if (d[k + 1] == 0) {
                    throw new RuntimeException("Algorithm failure: input vectors must be linearly independent.");
                }
            }

            // Step 3: Test LLL-condition

            do {
                REDI_IL(k, k - 1, b, vector_dimension, d, lambda);

                // if(4*d[k+1]*d[k-1] < 3*d[k]*d[k] -
                // lambda[k][k-1]*lambda[k][k-1])
                if (4 * d[k + 1] * d[k - 1] < 3 * d[k] * d[k]
                        - lambda[k][k - 1] * lambda[k][k - 1]) {
                    SWAPI(k, k_max, b, d, lambda);
                    if (k > 1) {
                        k--;
                    }
                    // k=max(1,k-1)
                } else {
                    break;
                }

            } while (true);

            // Now the condition above is no longer satisfied.

            for (int l = k - 2; l >= 0; l--) {
                REDI_IL(k, l, b, vector_dimension, d, lambda);
            }
            k++;

            // Step 4: Finished?

        } while (k < number_of_vectors);

        // Now, b contains the LLL-reduced lattice basis.

    }
}