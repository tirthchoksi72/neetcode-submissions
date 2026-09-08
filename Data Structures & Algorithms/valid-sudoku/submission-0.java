class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i =0 ; i<9 ; i++){
            Set<Character> rows = new HashSet<>();
            for (int j = 0; j< 9; j++){
                if (board[i][j] == '.'){
                    continue;
                }
                else if (rows.contains(board[i][j])){return false;}
                else{
                    rows.add(board[i][j]);
                }
            }
        }
        for (int i =0 ; i<9 ; i++){
            Set<Character> columns = new HashSet<>();
            for (int j = 0; j< 9; j++){
                if (board[j][i] == '.'){
                    continue;
                }
                else if (columns.contains(board[j][i])){return false;}
                else{
                    columns.add(board[j][i]);
                }
            }
        }
        for (int squares = 0; squares <9; squares ++){
            Set<Character> square = new HashSet<>();
            for (int i = 0; i<3; i++){
                for(int j = 0; j<3; j++){
                    int rows = (squares / 3)*3 + i ;
                    int columns = (squares % 3)*3 + j;
                    if (board[rows][columns] == '.'){continue;}
                    else if (square.contains(board[rows][columns])){return false;}
                    else{
                        square.add(board[rows][columns]);
                    }
                }
            }
        }
        return true;
    }
}
