package ru.leetcode.solutions;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.function.BiFunction;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution999 {

    private static final char ROCK = 'R';
    private static final char PAWN = 'p';
    private static final char DOT = '.';

    @Test
    public void test() {
        Solution999 solution999 = new Solution999();
        assertEquals(
                3,
                solution999.numRookCaptures(
                        new char[][]{
                                {'.', '.', '.', '.', '.', '.', '.', '.'},
                                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                                {'.', '.', '.', 'R', '.', '.', '.', 'p'},
                                {'.', '.', '.', '.', '.', '.', '.', '.'},
                                {'.', '.', '.', '.', '.', '.', '.', '.'},
                                {'.', '.', '.', 'p', '.', '.', '.', '.'},
                                {'.', '.', '.', '.', '.', '.', '.', '.'},
                                {'.', '.', '.', '.', '.', '.', '.', '.'}
                        }
                )
        );
        assertEquals(
                0,
                solution999.numRookCaptures(
                        new char[][]{
                                {'.','.','.','.','.','.','.','.'},
                                {'.','p','p','p','p','p','.','.'},
                                {'.','p','p','B','p','p','.','.'},
                                {'.','p','B','R','B','p','.','.'},
                                {'.','p','p','B','p','p','.','.'},
                                {'.','p','p','p','p','p','.','.'},
                                {'.','.','.','.','.','.','.','.'},
                                {'.','.','.','.','.','.','.','.'}
                        }
                )
        );
    }

    public int numRookCaptures(char[][] board) {
        Dot rock = findRock(board);
        int paws = check(board, (y, brd) -> brd[rock.x()][y]);
        paws += check(board, (x, brd) -> brd[x][rock.y()]);
        return paws;
    }

    private int check(char[][] board, BiFunction<Integer, char[][], Character> mappingFunction) {
        boolean havePawn = false;
        boolean wasRock = false;
        int result = 0;
        for (int i = 0; i < 8; i++) {
            char c = mappingFunction.apply(i, board);
            if (c == PAWN) {
                if (wasRock) {
                    result++;
                    break;
                }
                havePawn = true;
                continue;
            }
            if (c == ROCK) {
                wasRock = true;
                if (havePawn) {
                    result++;
                    havePawn = false;
                }
                continue;
            }
            if (c != DOT) {
                havePawn = false;
                wasRock = false;
            }
        }
        return result;
    }

    private Dot findRock(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ROCK) {
                    return new Dot(i, j);
                }
            }
        }
        throw new RuntimeException("Rock not found in board %s".formatted(Arrays.toString(board)));
    }

    private record Dot(int x, int y) {

    }

}
