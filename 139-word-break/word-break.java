class Solution {
     public boolean wordBreak(String s, List<String> wordDict) {

        int n = s.length();
        int maxLen = 0;

        for(String str:  wordDict){
            maxLen = Math.max(maxLen, str.length());
        }

        boolean dp[] = new boolean[n + 1];
        dp[0] = true;

        for(int i = 1; i <= n; i++){

            for(int j = i - 1; j >= Math.max(0, i - maxLen-1); j--){
                if(dp[j] && wordDict.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
    
}