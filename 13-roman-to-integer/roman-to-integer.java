class Solution {
    public int romanToInt(String s) {
        int res = 0;
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for(int i = 0; i < n - 1; i++){
            int curr = map.get(s.charAt(i));
            int next = map.get(s.charAt(i + 1));

            if(curr < next){
                res -= curr;
            } else {
                res += curr;
            }

        }

        return res + map.get(s.charAt(n - 1));
        
    }
}