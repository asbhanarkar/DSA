class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();

        for(String str: strs){
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String temp = new String(ch);
            if(map.containsKey(temp)){
                map.get(temp).add(str);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(temp, list);
            } 
        }

        for(List<String> list: map.values()){
            res.add(list);
        }
        return res;
        
    }
}