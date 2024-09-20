class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> myMap = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] arr = strs.[i].toCharArray();
            Arrays.sort(arr);
            String sortedWord = new String(arr);
            if(!myMap.containsKey(sortedWord)){
                myMap.put(sortedWord, new ArrayList<>());
            }
            myMap.get(sortedWord).add(strs[i])
        }

        return new ArrayList<>(myMap.values());

    }
}
