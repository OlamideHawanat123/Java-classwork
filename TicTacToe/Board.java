package TicTacToe;

public class Board {
    private char[][] board;

    public Board(){
        this.board = new char[3][3];
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[row].length; col++){
                board[row][col] = '_';
            }

        }
    }

    public void displayBoard(){
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[row].length; col++){
                System.out.print(board[row][col] + " ");
            }
        }
        System.out.println();
    }

     public int getRow(int number){


     }
}
