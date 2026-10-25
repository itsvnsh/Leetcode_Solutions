class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows=new  HashSet[9];
        HashSet<Character>[] columns=new  HashSet[9];
        HashSet<Character>[] block=new  HashSet[9];

        for(int i=0;i<9;i++){
            rows[i]=new HashSet<>();
            columns[i]=new HashSet<>();
            block[i]=new HashSet<>();
        }

        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c]=='.'){
                    continue;
                }
                int val=(r/3)*3+(c/3);
                if(rows[r].contains(board[r][c]) || columns[c].contains(board[r][c]) || block[val].contains(board[r][c])){
                    return false;
                }
                rows[r].add(board[r][c]);
                columns[c].add(board[r][c]);
                block[val].add(board[r][c]);
            }
        }
        return true;
        
    }   
}