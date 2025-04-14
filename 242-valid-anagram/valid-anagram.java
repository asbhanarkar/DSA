class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n != m){return false;}

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c: t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        for(int val: map.values()){
            if(val != 0){
                return false;
            }
        }
        return true;
    }
}