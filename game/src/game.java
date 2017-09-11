public class game {

    public static void main(String[] args) {
        int[][] masComp = new int[10][10];
        int[][] masPlay = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                masComp[i][j] = 0;
                masPlay[i][j] = 0;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (j < 10) {
                    System.out.print(masComp[i][j]);
                } else if (j > 9) {
                    System.out.print(masPlay[i][j - 10]);
                }

                if (j == 9) {
                    System.out.print(' ');
                }
            }
            System.out.print('\n');
        }
    }

}