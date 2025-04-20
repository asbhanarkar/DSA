class Solution {
 
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> []bucket = new ArrayList[nums.length + 1];

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for(int key: map.keySet()){
            int freq = map.get(key);

            if(bucket[freq] == null){
                List<Integer> list = new ArrayList<>();
                bucket[freq] = list;
            }

            bucket[freq].add(key);
        }
        int res[] =new int[k];
        int counter = 0;

        for(int i = bucket.length - 1; i >= 0 && counter < k; i--){
            if(bucket[i] != null){
                for(int val: bucket[i]){
                    res[counter++] = val;
                    if(counter == k){
                        return res;
                    }
                }
                
            }
        }
        return res;
    }
}