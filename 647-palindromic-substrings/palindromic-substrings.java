class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        char arr[] = s.toCharArray();
        // odd
        for(int i = 0; i < n; i++){
            int left = i -1, right = i + 1;
            count++;
            while(left >= 0 && right < n){
                if(arr[left--] == arr[right++]){
                    count++;
                }else{
                    break;
                }
            }
        } 

        //even

        for(int i = 0; i < n; i++){
            int left = i , right = i + 1;
            while(left >= 0 && right < n){
                if(arr[left--] == arr[right++]){
                    count++;
                }else{
                    break;
                }
            }
        } 

        return count;
    }
}