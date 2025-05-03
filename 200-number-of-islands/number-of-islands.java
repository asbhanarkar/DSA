class Solution {

    public void dfs(int n, int m, char grid[][]){
        int i = grid.length;
        int j = grid[0].length;
        if(n < 0 || m < 0 || n >= i || m >= j || grid[n][m] == '0' ) {
            return;
        }
        
        grid[n][m] = '0';

        dfs(n -1, m, grid);
        dfs(n + 1, m, grid);
        dfs(n, m - 1,grid);
        dfs(n, m + 1, grid);
        
        return;
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(i, j, grid);
                }
            }
        }
        return count;
    }
}