import java.util.Scanner;

public class NqueenProblem {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    void printSolution(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j] + " ");
            System.out.println();
        }
    }
    public boolean issafe(int board[][], int row, int col) {
        int i, j;
        //checking the leftside
        for (i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }
        //checking left diagonal
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        //checking the other diagonal
        for (i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public boolean place(int board[][], int col) {
        if (col >= N) {
            return true;
        }
        for (int i = 0; i < N; i++) {
            if (issafe(board, i, col)) {
                board[i][col] = 1;
                if (place(board, col + 1) == true)
                    return true;
                board[i][col] = 0;//backtracking
            }
        }
        return false;
}
}
