public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> rowSeen = new HashSet<>();
            Set<Character> colSeen = new HashSet<>();
            Set<Character> boxSeen = new HashSet<>();

            int startRow = (i / 3) * 3;
            int startCol = (i % 3) * 3;

            for (int j = 0; j < 9; j++) {
                // Row
                if (board[i][j] != '.' && !rowSeen.add(board[i][j]))
                    return false;

                // Column
                if (board[j][i] != '.' && !colSeen.add(board[j][i]))
                    return false;

                // Box
                int r = startRow + j / 3;
                int c = startCol + j % 3;

                if (board[r][c] != '.' && !boxSeen.add(board[r][c]))
                    return false;

            }
        }
        return true;
    }
}