/**
 * Created by ronald on 18/12/16.
 */
public class Slope {
    public static void main(String[] args) {

        int ski[][] = new int[4][5];


        int i, j, k = 0;

        for (i = 0; i < 4; i++)
            for (j = 0; j < 5; j++) {
                ski[i][j] = k;
                k++;
            }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++)
                System.out.print(ski[i][j] + " ");
            System.out.println();
        }
        }
    }




