public class TwoSum_Increase_Easy_167 {
    public static void main(String[] args) {
        int target = 8;
        int[] numbers = {-2,4,10};
        int result[] = new TwoSum_Increase_Easy_167().twoSum(numbers, target);
        for (int val :
                result) {
            System.out.println(val);
        }

    }

    /* My approach was able to give solution but it in N.square complexity.

        public int[] twoSum(int[] numbers, int target) {
            int index = numbers.length;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] >= target) {
                    index = i;
                    break;
                }
            }
            int arr[] = new int[2];

            for (int i = 0; i < numbers.length; i++) {
                for (int j = i+1; j < numbers.length; j++) {
                    if (numbers[i] + numbers[j] == target) {
                        arr[0] = numbers[i];
                        arr[1] = numbers[j];
                        break;
                    }
                }
            }
            return arr;
        }
    */
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j){
            if (numbers[i] + numbers[j] > target) j--;
            else if (numbers[i] + numbers[j] < target) i++;
            else return new int[]{i+1,j+1};
        }
        return new int[2];
    }

}
//                System.out.println(numbers[i] + " "  + numbers[i+1] + " " + target);
