public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4};
        int Q[][] = {{1, 0}, {-3, 1}, {-4, 0}, {2, 3}};
        int result[] = new SumOfEvenNumbers().sumEvenAfterQueries(A, Q);
        for (int i = 0; i < A.length; i++) {
            System.out.println(result[i]);
        }
    }

    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int sum[] = new int[queries.length];

        for (int j = 0; j < queries.length; j++) {
            int total = 0;
            A[queries[j][1]] += queries[j][0];

            for (int x = 0; x < A.length; x++) {
                if (A[x] % 2 == 0)
                    total += A[x];
            }
            sum[j] = total;
//            System.out.println("After Update:" +sum[j]);
        }

        for (int i = 0; i < A.length; i++) {
            A[i] = sum[i];
        }

        return A;
    }
}


/* A better solution:

Track sum of all even #s.
There are 4 cases for odd / even property of A[k] and queries[i][0], where k = queries[i][1]:
1). even and odd, lose an even item in A; sum need to deduct A[k];
2). even and even, get a bigger even item in A; sum need to add queries[i][0](same as deduct A[k] first then add both);
3). odd and odd, get a bigger even item in A; sum need to add both;
4). odd and even, no influence on even items in A;

Therefore, we can simplify the above as following procedure:

find sum of all even #s;
for each queries, check the item in A and after-added-up value, if
a) the item in A is even, deduct it from sum; according to 1) & 2).
b) after-added-up we have an even value, then add the new value to sum; according to 2) & 3).

public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
    int sum = 0, i = 0;
    for (int a : A) { if (a % 2 == 0) sum += a ; } // sum of even #s.
    int[] ans = new int[queries.length];
    for (int[] q : queries) {
        if (A[q[1]] % 2 == 0) { sum -= A[q[1]]; } // from 1) and 2)
        A[q[1]] += q[0];
        if (A[q[1]] % 2 == 0) { sum += A[q[1]]; } // from 2) and 3)
        ans[i++] = sum;
    }
    return ans;
}

Analysis:

Time: O(max(m, n)), space: O(n), where m = A.length, n = queries.length.

* */

/* A readable version of the previous code. */

    /*
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int n = queries.length;
        int[] res = new int[n];

        // get sum of all even numbers in A
        int sum = 0;
        for(int num : A)
        {
            if((num & 1) == 0)
                sum += num;
        }

        for(int i = 0; i < n; i++)
        {
            int val = queries[i][0];
            int idx = queries[i][1];

            if((A[idx] & 1) == 0)
                sum -= A[idx];

            if(((A[idx] + val) & 1) == 0)
            {
                sum += A[idx] + val;
            }

            A[idx] += val;
            res[i] = sum;
        }

        return res;
    }

    */