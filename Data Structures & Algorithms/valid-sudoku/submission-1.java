public class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<String, Set<Integer>> boxMap = new HashMap<>();
        for (int row = 0; row < 9; row++) {
            Set<Character> seenRows = new HashSet<>();
            Set<Character> seenCols = new HashSet<>();

            for (int col = 0; col < 9; col++) {
                String boxKey = (int) (row / 3) + "." + (int) (col / 3);
                if (board[row][col] != '.') {
                    if (seenRows.contains(board[row][col]))
                        return false;
                    seenRows.add(board[row][col]);

                    // box
                    Set<Integer> set = boxMap.getOrDefault(boxKey, new HashSet<>());
                    Integer curr = board[row][col] - '0';
                    if (set.contains(curr)) {
                        return false;
                    }
                    set.add(curr);
                    boxMap.putIfAbsent(boxKey, set);
                }

                if (board[col][row] != '.') {
                    if (seenCols.contains(board[col][row]))
                        return false;
                    seenCols.add(board[col][row]);
                }
            }
        }

        return true;
    }
}