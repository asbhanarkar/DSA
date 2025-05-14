class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c) && map.get(c) >= left){
                left = map.get(c) + 1;
            }
            map.put(c, i);
            res = Math.max(res, i - left + 1);
        }
        return res;

    }
}