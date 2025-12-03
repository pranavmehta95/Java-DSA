import java.util.*;


public class Pascal_Triangle_Using_ArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // number of rows

        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();

            // First element is always 1
            row.add(1);

            // Middle elements (only if row > 1)
            if (i > 0) {
                ArrayList<Integer> prev = triangle.get(i - 1);
                for (int j = 1; j < i; j++) {
                    row.add(prev.get(j - 1) + prev.get(j));
                }
                // Last element is also 1
                row.add(1);
            }

            triangle.add(row);
        }

        // Print the Pascal Triangle
        // for (ArrayList<Integer> row : triangle) {
        //     for (int num : row) {
        //         System.out.print(num + " ");
        //     }
        //     System.out.println();
        for (ArrayList<Integer> row : triangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}