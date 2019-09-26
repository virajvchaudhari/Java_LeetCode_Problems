public class SortParityEasy {
    public int[] sortArrayByParity(int[] A)
    {
        if (A.length == 0 || A.length == 1)
        {
            return A;
        }

        int result[] = new int[A.length];

        int k = 0, j = A.length-1;
        for (int i=0;i<A.length;i++)
        {
            if (A[i]%2==0)
            {
                 result[k] += A[i];
                 k += 1;
            }
            else{
                result[j] += A[i];
                j -= 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int A[] = {3,2,4,1};
        SortParityEasy sp = new SortParityEasy();
        int result[] = sp.sortArrayByParity(A);
        for (int i:result)
        {
            System.out.print(i + " ");
        }
    }
}

