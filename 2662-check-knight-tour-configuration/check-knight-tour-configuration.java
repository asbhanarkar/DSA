class Solution {
    boolean isValid(int x, int y, int n){
        if(x >= 0 && y >= 0 && x < n && y < n ){
            return true;
        }
        return false;
    }
    public boolean checkValidGrid(int[][] grid) {

        int x1 = 0, y1 = 0;
        int x = 0;
        if(grid[x1][y1] != x){
            return false;
        }
        int n = grid.length;
        int last = n * n ;

        while(x < last-1){
            x++;
            
            int ax[] = {1, 1, -1, -1, 2, -2, 2, -2};
            int ay[] = {2, -2, 2, -2, 1, 1, -1, -1};
            boolean flag = false;
            for(int i = 0; i < ax.length; i++){
                int xx = x1 + ax[i];
                int yy = y1 + ay[i];
                
                
                if(isValid(xx, yy, n) ){
                    if(x == grid[xx][yy]){
                        flag = true;
                        x1 = xx;
                        y1 = yy;
                    }
                }
               
            }

            if(flag == false){
                return false;
            }
        }
        return true;
    }
}