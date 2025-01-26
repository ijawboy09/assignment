public class Pattern {
    public static void main(String[] args) {
        int rows = 6;

        for (int i = 0; i < rows; i++) {
            if (i < 3) {
                for (int j = 0; j < 4; j++) {
                    System.out.print("* ");
                }
                for (int k = 0; k < 6; k++) {
                    System.out.print("= ");
                }
            } else {
                for (int j = 0; j < 5; j++) {
                    System.out.print("= ");
                }
                for (int k = 0; k < 4; k++) {
                    System.out.print("= ");
                }
            }
            System.out.println();
        }
    }
}
 