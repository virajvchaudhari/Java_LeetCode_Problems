public class DistCandies_Easy_1103 {
    public static void main(String[] args) {
        int A[] = new DistCandies_Easy_1103().distributeCandies(7,4);

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

    public int[] distributeCandies(int candies, int num_people) {
        int res[] = new int[num_people];

        for (int give = 0; candies > 0 ; candies -= give) {
            res[give % num_people] += Math.min(candies, ++give);
        }
        return res;
    }
}


/*
* int j = 1;

        int res[] = new int[num_people];

        for (int i = 0; i < num_people; i++) {

            if (j > candies) break;
            else {
                if (i == num_people - 1){
                    res[i] += j;
                    candies = candies - j;
                    j++;
                    i = 0;
                }
                res[i] += j;
                candies = candies - j;
                j++;

            }
        }

        return res;
* */



/*
* if (candies != 0 && i == num_people - 1){
                j = 1;
                i = 0;
                res[i] += j;
                candies--;
                j++;
            }
            else {
                res[i] += j;
                candies--;
                j++;
            }

            if (candies == 0) break;

* */