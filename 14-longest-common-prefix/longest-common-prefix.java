class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String res = strs[0];

        for(int i = 1; i < n; i++){
            res = findSamePrefix(res, strs[i]);
        }
        return res;
    }

    String findSamePrefix(String str1, String str2){
        String res = "";
        int n = Math.min(str1.length(), str2.length());

        for(int i = 0; i < n; i++){
            if(str1.charAt(i) == str2.charAt(i)){
                res += str1.charAt(i);
            }else{
                break;
            }
        }
        return res;
    }
}