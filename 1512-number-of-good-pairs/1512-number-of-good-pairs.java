class Solution {
    public int numIdenticalPairs(int[] nums) {

        int counter = 0;
        HashMap<Integer, Integer> myMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(myMap.containsKey(nums[i])){
                myMap.put(nums[i], myMap.get(nums[i]) + 1);
                counter += myMap.get(nums[i]);
            }else{
                myMap.put(nums[i], 0);
                
            }
        }

        return counter;
        
    }
}