import java.util.*;

public class Permutations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 1) {
            System.out.println("1");
        } else if (n == 2 || n == 3) {
            System.out.println("NO SOLUTION");
        } else {
            ArrayList<Integer> permutation = new ArrayList<>();
            for (int i = 2; i <= n; i += 2) {
                permutation.add(i);
            }
            for (int i = 1; i <= n; i += 2) {
                permutation.add(i);
            }

            // Print the beautiful permutation
            for (int num : permutation) {
                System.out.print(num + " ");
            }
        }
    }
}
