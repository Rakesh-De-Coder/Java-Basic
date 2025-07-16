import java.util.*;

public class OfficeRostering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of employees (N) and number of friendships (M)
        int N = sc.nextInt();
        int M = sc.nextInt();

        // Create adjacency list for friendship connections
        List<Set<Integer>> friends = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            friends.add(new HashSet<>());
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            friends.get(a).add(b);
            friends.get(b).add(a);
        }

        // Read the target rostering value (K)
        int K = sc.nextInt();

        // Initialize all employees working from office (Day 1)
        boolean[] currentDayStatus = new boolean[N];
        Arrays.fill(currentDayStatus, true);

        int totalRoster = N; // All employees worked on Day 1
        int days = 1;        // Start from Day 1

        while (totalRoster < K) {
            boolean[] nextDayStatus = new boolean[N];
            int todayAttendance = 0;

            // Determine attendance for the next day
            for (int i = 0; i < N; i++) {
                int friendCountWFO = 0;
                for (int friend : friends.get(i)) {
                    if (currentDayStatus[friend]) {
                        friendCountWFO++;
                    }
                }

                if (currentDayStatus[i]) {
                    // WFO today, check condition for next day
                    nextDayStatus[i] = (friendCountWFO == 3);
                } else {
                    // WFH today, check condition for next day
                    nextDayStatus[i] = (friendCountWFO < 3);
                }

                if (nextDayStatus[i]) {
                    todayAttendance++;
                }
            }

            totalRoster += todayAttendance;
            currentDayStatus = nextDayStatus;
            days++;
        }

        System.out.println(days);
        sc.close();
    }
}

