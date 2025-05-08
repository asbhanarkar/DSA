class Solution {
        void dfs(int mat[][], int newColor,int old, int i, int j){
        
        int m = mat.length;
        int n = mat[0].length;
        
        if(i < 0 || j < 0 || i >= m || j >= n || mat[i][j] == newColor || mat[i][j] != old){
            return;
        }
        mat[i][j] = newColor;
        
        dfs(mat, newColor, old, i - 1, j);
        dfs(mat, newColor, old, i, j - 1);
        dfs(mat, newColor, old, i + 1, j);
        dfs(mat, newColor, old, i, j + 1);
        return;
        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int old = image[sr][sc];
        
        dfs(image, color, old, sr, sc);
        
        return image;
    }
}