/**
 * Created by ronald on 26/09/16.
 */
public class Amour {

    public static void main(String[] args) {


        int bullets[][] = new int[4][5]; // 4 rows and 5 columns!
        bullets[0][0] = 1; // allocating cq. at row 0, column o putt 1.
        bullets[1][1] = 2;
        bullets[3][2] = 3;
        bullets[2][3] = 6;
        bullets[1][4] = 2; // at row 1, column 4 putt 2

        /*

0 1 0 0 0 0
1 0 2 0 0 2
2 0 0 0 6 0
3 0 0 3 0 0

*/

// loop over the top level arrays
        for (int i = 0; i < bullets.length; i++) {

            // loop and display sub-arrays.
            int[] sub = bullets[i];
            for (int x = 0; x < sub.length; x++) {
                System.out.println(sub[x]);
            }
            System.out.println();
        }
    }
}

