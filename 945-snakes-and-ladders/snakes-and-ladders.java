class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        Queue<Integer> que = new LinkedList<>();
        boolean visited[] = new boolean[n * n];
        int count = 0;
        que.add(1);

        while(!que.isEmpty()){
            count++;
            int size = que.size();

            for(int i = 0; i < size; i++){
                int num = que.poll();
                // dice 
                for(int j = 1; j <= 6; j++){
                    int nextNum = num + j;
                    int cord[] = findCordinate(nextNum, n);
                    int row = cord[0];
                    int col = cord[1];
                    if(board[row][col] != -1){
                        nextNum = board[row][col];
                    }
                    if(nextNum == n * n){
                        return count;
                    }
                    if(!visited[nextNum]){
                        visited[nextNum] = true;
                        que.add(nextNum);
                    }
                }
            }
        }
        return -1;
    }
    
    public int[] findCordinate(int num,int n){

        int row = n - (num -1) / n - 1;
        int col = (num -1 )% n ;
        if((row % 2 == n % 2 ) ){
            col = (n - 1) - col;
        }
        
        return new int[]{row,col};
    }
    


}