class Solution {
    public void solve(char[][] board) {
        if(board.length <= 1 || board[0].length <= 1 ){
            return;
        }
        int m = board.length;
        int n = board[0].length;

        // conver all boundary element to start and connected all 0 to *
        for(int i = 0; i < m; i++){
            if(board[i][0] == 'O'){
                boundaryDFS(board, i, 0);
            }
            if(board[i][n -  1] == 'O'){
                boundaryDFS(board, i, n - 1);
            }
        }

        for(int i = 0; i < n; i++){
            if(board[0][i] == 'O'){
                boundaryDFS(board, 0, i);
            }
            if(board[m - 1][i] == 'O'){
                boundaryDFS(board, m - 1, i);
            }
        }

        // convert all 0 to x and all * to 0
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }else if( board[i][j] == '*'){
                    board[i][j] = 'O';
                }
            }
        }
    }
    //Use DFS algo to turn internal however boundary-connected 'O' to '*';
    private void boundaryDFS(char[][] board, int i, int j) {

        int m =board.length, n = board[0].length;
        if(i < 0 || j < 0 || i >= m || j >= n || board[i][j] != 'O'){
            return;
        }

        board[i][j] = '*';
        boundaryDFS(board,i - 1, j);
        boundaryDFS(board,i + 1, j);
        boundaryDFS(board,i , j - 1);
        boundaryDFS(board,i , j + 1);
        return;
    }   
}