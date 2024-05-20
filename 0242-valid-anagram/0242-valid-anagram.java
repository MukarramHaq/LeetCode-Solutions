import java.util.HashMap;

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(t.length() != s.length()){
            return false;
        }
        
        HashMap<Character, Integer> myMap = new HashMap<>();
        HashMap<Character, Integer> myMap2 = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            if(myMap.containsKey(t.charAt(i))){
                myMap.put(t.charAt(i), myMap.get(t.charAt(i))+1);
            }else{
                myMap.put(t.charAt(i), 1);
            }
        }
        
        for(int i = 0; i < s.length(); i++){
            if(myMap2.containsKey(s.charAt(i))){
                myMap2.put(s.charAt(i), myMap2.get(s.charAt(i))+1);
            }else{
                myMap2.put(s.charAt(i), 1);
            }
        }

        return myMap.equals(myMap2);
    }
}