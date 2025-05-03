class Solution {

    public void dfs(int n, int m, char grid[][], boolean vis[][]){
        int i = grid.length;
        int j = grid[0].length;
        if(n < 0 || m < 0 || n >= i || m >= j || grid[n][m] == '0' || vis[n][m] == true ) {
            return;
        }
        
        vis[n][m] = true;
        dfs(n -1, m, grid, vis);
        dfs(n + 1, m, grid, vis);
        dfs(n, m - 1,grid, vis);
        dfs(n, m + 1, grid, vis);
        
        return;
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean vis[][] = new boolean[n][m];
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == '1' && !vis[i][j]){
                    count++;
                    dfs(i, j, grid, vis);
                }
            }
        }
        return count;
    }
}