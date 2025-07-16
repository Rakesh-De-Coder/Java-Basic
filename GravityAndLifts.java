import java.util.*;

public class GravityAndLifts {

    public static int minimumCellsAndLifts(int N, int M, int[][] board, int[] start, int[] destination) {
        int startX = start[0], startY = start[1];
        int destX = destination[0], destY = destination[1];

        // If destination is not stable, return "Impossible"
        if (!isStableCell(board, destX, destY, N)) {
            return -1;
        }

        // Directions: [dx, dy]
        int[] dx = {1, -1, 0, 0}; // Down, Up, Left, Right
        int[] dy = {0, 0, -1, 1};

        // Queue for BFS: stores [x, y, cellsUsed, liftsUsed]
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startX, startY, 0, 0});

        // Visited set to prevent re-visiting cells
        boolean[][] visited = new boolean[N][M];
        visited[startX][startY] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0], y = current[1];
            int cellsUsed = current[2];
            int liftsUsed = current[3];

            // If the destination is reached, return the total cost
            if (x == destX && y == destY) {
                return cellsUsed + liftsUsed;
            }

            // Process each direction
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // Check if the new position is within bounds
                if (nx >= 0 && nx < N && ny >= 0 && ny < M && !visited[nx][ny]) {
                    // Gravity: Move downward until a stable cell is reached
                    if (i == 0) { // Moving downward
                        while (nx + 1 < N && board[nx + 1][ny] == 0) {
                            nx++;
                        }
                    }

                    // Move upward only if there's a lift
                    if (i == 1 && board[nx][ny] == 0) continue;

                    // If moving up, increment lift usage
                    int newLiftsUsed = liftsUsed + (i == 1 ? 1 : 0);

                    // Mark cell as visited
                    visited[nx][ny] = true;

                    // Add to queue
                    queue.add(new int[]{nx, ny, cellsUsed + 1, newLiftsUsed});
                }
            }
        }

        // If destination cannot be reached
        return -1;
    }

    private static boolean isStableCell(int[][] board, int x, int y, int N) {
        return x == N - 1 || (x + 1 < N && board[x + 1][y] == 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read dimensions
        int N = sc.nextInt();
        int M = sc.nextInt();

        // Read board
        int[][] board = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        // Read start and destination positions
        int[] start = {sc.nextInt(), sc.nextInt()};
        int[] destination = {sc.nextInt(), sc.nextInt()};

        // Find the result
        int result = minimumCellsAndLifts(N, M, board, start, destination);
        if (result == -1) {
            System.out.println("Impossible");
        } else {
            System.out.println(result);
        }

        sc.close();
    }
}

