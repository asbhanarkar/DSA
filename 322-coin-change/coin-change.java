class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[n+1][amount+1];
        int ans = (int) rec(coins, amount, n, dp);

        if(ans == Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }

    long rec(int arr[], int target, int n, int dp[][]){
        if(target == 0){
            return dp[n][target] = 0;
        }
        if(n == 0){
            return dp[n][target] = Integer.MAX_VALUE;
        }

        if(dp[n][target] != 0){
            return dp[n][target];
        }

        if(target >= arr[n - 1]){
            return dp[n][target] = (int)Math.min(rec(arr, target, n-1, dp),
                                (1+ rec(arr, target - arr[n-1],n, dp )) );
        }

        return dp[n][target] = (int) rec(arr, target, n-1, dp);
    }
}