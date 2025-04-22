class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        rec(candidates, target, new ArrayList<>(), 0);
        return ans;
    }

    void rec(int arr[], int target, List<Integer> list, int n){
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(arr.length == n || target < 0){
            return;
        }

        if(arr[n] <= target){
            list.add(arr[n]);
            rec(arr, target - arr[n], list, n);
            list.remove(list.size() -1);
            // rec(arr, target, list, n+1);
        }
        rec(arr, target, list, n + 1);
        return;


    }
}