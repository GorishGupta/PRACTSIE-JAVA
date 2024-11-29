class Ques2 {
    public static void main(String[] args) {
        int n = 7; // Number of rows for the top triangle
        int n2 = (n / 2) + 2; // Height of the top inverted triangle

        // Top part: Inverted triangle
        for (int i = n2 - 1; i >= 0; i--) {
            for (int j = n2 - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom part: Regular triangle without 5th and 6th rows
        n = 4; // Number of rows for the bottom triangle
        for (int i = 1; i <= n; i++) {
            if (i == 2 || i == 3) continue; // Skip rows 5 and 6

            for (int j = 1; j <= n2 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (i == n || k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
