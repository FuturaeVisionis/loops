/**
 * Created by ronald on 18/12/16.
 */
public class BlackCat {
    public static void main(String[] args) {

        int cat[][] = new int[4][];
        cat[0] = new int[8];
        cat[1] = new int[8];
        cat[2] = new int[8];
        cat[3] = new int[8];

        int i, j, k = 0;

        for (i = 0; i < 4; i++)
            for (j = 0; j < i + 1; j++) {
                cat[i][j] = k;
                k++;
            }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++)
                System.out.print(cat[i][j] + " ");
            System.out.println();
        }
    }
}
