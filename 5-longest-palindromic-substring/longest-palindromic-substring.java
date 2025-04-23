class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int count = 0;
        char arr[] = s.toCharArray();
        String str = "";
        // odd
        for(int i = 0; i < n; i++){
            int left = i -1, right = i + 1;
            if(count < 1){
                str = Character.toString(arr[i]);
            }
            while(left >= 0 && right < n){
                if(arr[left] == arr[right]){
                    if(count < (right-left +1)){
                        count = (right-left +1);
                        str = s.substring(left, right+1);
                    }
                    left--;
                    right++;
                }else{
                    break;
                }
            }
        } 

        //even

        for(int i = 0; i < n; i++){
            int left = i , right = i + 1;
            while(left >= 0 && right < n){
                if(arr[left] == arr[right]){
                    if(count < (right-left +1)){
                        count = (right-left +1);
                        str = s.substring(left, right+1);
                    }
                    left--;
                    right++;
                }else{
                    break;
                }
            }
        }
        return str; 
    }
}