public class ArrayParityAgain_Easy {
    public static void main(String[] args) {
        int A[] = {3,1,4,2};
        ArrayParityAgain_Easy sp = new ArrayParityAgain_Easy();
        int result[] = sp.sortArrayByParityII(A);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public int[] sortArrayByParityII(int[] A) {
        if (A.length == 2 && (A[0] % 2 != 0))
        {
            int temp = A[0];
            A[0] = A[1];
            A[1] = temp;
        }

        for (int i = 0; i < A.length; i++)
        {
            if (A[i] % 2 == 0 && i % 2 == 0)
            {
                continue;
            }
            else
                {
                    for (int j = i+1; j < A.length; j++)
                    {
                        if (A[j] % 2 == 1 && j % 2 == 1)
                        {
                            int temp = A[i];
                            A[i] = A[j];
                            A[j] = temp;
                            break;
                        }
                        else{
                            int temp = A[i];
                            A[i] = A[j+1];
                            A[j+1] = temp;
                            break;
                        }
                    }
                }
        }
        return A;
    }
}

//
// else {
//         for(int j = i; j < A.length; j++){
//        if (A[j]%2 == 1 && j % 2 == 1)
//        A[i] = A[j];
//        break;
//        }
//        }