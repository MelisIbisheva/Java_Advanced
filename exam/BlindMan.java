import java.util.Arrays;
import java.util.Scanner;

public class BlindMan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int N = arr[0];
        int M = arr[1];
        String[][] map = new String[N][M];
        for (int i = 0; i < map.length; i++) {
            map[i] = scanner.nextLine().split(" ");
        }
        int currentCol = 0;
        int currentRow = 0;

        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                if (map[row][col].equals("B")) {
                    currentCol = col;
                    currentRow = row;
                    break;

                }
            }
        }
        int movesM = 0;
        int touchedOp
                = 0;
        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            switch (command) {
                case "up":
                    if (currentRow > 0) {
                        int nextRow = currentRow - 1;
                        String next = map[nextRow][currentCol];
                        if (!next.equals("O")) {
                            currentRow--;
                            movesM++;
                            if (next.equals("P")) {
                                touchedOp
                                        ++;
                                map[currentRow][currentCol] = "-";
                            }
                        }
                    }
                    break;
                case "down":
                    if (currentRow < map.length - 1) {
                        int nextRow = currentRow + 1;
                        String next = map[nextRow][currentCol];
                        if (!next.equals("O")) {
                            currentRow++;
                            movesM++;
                            if (next.equals("P")) {
                                touchedOp++;
                                map[currentRow][currentCol] = "-";
                            }
                        }
                    }
                    break;
                case "left":
                    if (currentCol > 0) {
                        int nextCol = currentCol - 1;
                        String next = map[currentRow][nextCol];
                        if (!next.equals("O")) {
                            currentCol--;
                            movesM++;
                            if (next.equals("P")) {
                                touchedOp++;
                                map[currentRow][currentCol] = "-";
                            }
                        }
                    }
                    break;
                case "right":
                    if (currentCol < map[currentRow].length - 1) {
                        int nextCol = currentCol + 1;
                        String next = map[currentRow][nextCol];
                        if (!next.equals("O")) {
                            currentCol++;
                            movesM++;
                            if (next.equals("P")) {
                                touchedOp++;
                                map[currentRow][currentCol] = "-";
                            }
                        }
                    }
                    break;
            }

            if (touchedOp == 3) {
                break;
            }
            command = scanner.nextLine();
        }

        System.out.println("Game over!");
        System.out.printf("Touched opponents: %d Moves made: %d%n", touchedOp, movesM);
    }
}