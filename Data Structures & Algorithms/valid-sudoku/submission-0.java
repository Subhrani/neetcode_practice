class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> [] rows=new HashSet[9];
        HashSet<Character> [] cols=new HashSet[9];
        HashSet<Character> [] box=new HashSet[9];
        for(int i=0;i<9;i++){
         rows[i]=new HashSet<Character>();
        cols[i]=new HashSet<Character>();
         box[i]=new HashSet<Character>();
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char value= board[i][j];
                if(value =='.'){
                    continue;
                }
                if(rows[i].contains(value)){
                    return false;
                }
                rows[i].add(value);

                if(cols[j].contains(value)){
                    return false;
                }
                cols[j].add(value);

                int idx = (i/3)*3+(j/3);
                if(box[idx].contains(value)){
                    return false;
                }
                box[idx].add(value);
            }
        }
        return true;

    }
}
