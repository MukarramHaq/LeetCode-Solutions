class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /* *Use two pointer algorithm. */
        int i = 0;
        int j = numbers.length - 1;

        while(i<j){
            int sum = numbers[i] + numbers[j];
            if(sum < target){
                i++;
            }
            if(sum > target){
                j--;
            }
            if(sum == target){
                return new int[]{i+1, j+1};
            }
        }
        return new int[]{};
    }
}