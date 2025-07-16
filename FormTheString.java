import java.util.*;

public class FormTheString {

    public static int minimumCostToFormString(String mainString, String[][] substrings) {
        int mainLen = mainString.length();
        int[] dp = new int[mainLen + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0; // Base case: Cost to form an empty string is 0.

        // Iterate through every position in the main string
        for (int i = 0; i < mainLen; i++) {
            if (dp[i] == Integer.MAX_VALUE) continue; // Skip unreachable states.

            // Try to use every substring starting at position `i`
            for (String[] sub : substrings) {
                String substring = sub[0];
                int cost = Integer.parseInt(sub[1]);

                // Check if the substring matches the main string at position `i`
                if (i + substring.length() <= mainLen &&
                        mainString.substring(i, i + substring.length()).equals(substring)) {
                    dp[i + substring.length()] = Math.min(dp[i + substring.length()], dp[i] + cost);
                }
            }
        }

        return dp[mainLen] == Integer.MAX_VALUE ? -1 : dp[mainLen];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of substrings
        int n = sc.nextInt();
        sc.nextLine();

        // Read substrings and their costs
        String[][] substrings = new String[n][2];
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            substrings[i][0] = input[0];
            substrings[i][1] = input[1];
        }

        // Read the main string
        String mainString = sc.nextLine();

        // Compute the minimum cost
        int result = minimumCostToFormString(mainString, substrings);
        if (result == -1) {
            System.out.println("Impossible");
        } else {
            System.out.println(result);
        }
    }
}

