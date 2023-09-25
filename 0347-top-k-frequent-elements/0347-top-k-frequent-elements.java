class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> myMap = new HashMap<>();
        for(int num: nums){
            myMap.put(num, myMap.getOrDefault(num,0)+1);
        }
        /* The lambda expression is for storing the values in descending order.*/
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> myMap.get(b) - myMap.get(a));
        heap.addAll(myMap.keySet());

        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = heap.poll();
        }

        return result;

    }
}