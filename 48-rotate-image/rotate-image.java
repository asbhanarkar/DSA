class Solution {
    public void rotate(int[][] mat) {
        
        int m = mat.length;
        int n = mat[0].length;
        // transpose
        for(int i =0; i < m; i++){
            for(int j = i; j < n; j++){
                if(i != j){
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n/2; j++){
                
                int temp = mat[i][j];
                mat[i][j] = mat[i][m-j-1];
                mat[i][m-j-1] = temp;
            
            }
        }




    }
}