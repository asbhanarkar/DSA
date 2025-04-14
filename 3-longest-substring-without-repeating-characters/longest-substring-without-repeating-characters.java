class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0, lastInd = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c) && map.get(c) >= lastInd){
                lastInd = map.get(c) + 1;
            }
            map.put(c, i);
            res = Math.max(res, i -  lastInd + 1);
        }
        return res;
    }
}