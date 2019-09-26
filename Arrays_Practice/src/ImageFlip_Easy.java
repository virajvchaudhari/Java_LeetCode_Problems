/*
Input: [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
*/

public class ImageFlip_Easy
{
    public int[][] flipAndInvertImage(int[][] A)
    {
        int revArr[][] = new int[A.length][A[0].length];

//      Reversing & Flipping the elements of the input array.
        for (int i = 0; i < A.length; i++) {
            for (int k =0,j = A[0].length - 1; (j >= 0 & k < A[0].length) ; k++, j--){
                revArr[i][k] = A[i][j];
                revArr[i][k] = revArr[i][k] == 0 ? 1:0;
            }
        }

        return revArr;
    }

    public static void main(String[] args) {
        int A[][] = {{1,1,0},{1,0,1},{0,0,0}};
        ImageFlip_Easy ifp = new ImageFlip_Easy();
        int result[][] = ifp.flipAndInvertImage(A);

        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A.length; j++){
                System.out.print(result[i][j] + " ");
            }
        }
    }
}
