/**
 * Created by ronald on 26/09/16.
 */
public class AminoAcids {

    public static void main(String[] args) {

        int[][] acids = new int[7][5];

        acids[0][0] = 10;
        acids[0][1] = 12;
        acids[0][2] = 43;
        acids[0][3] = 11;
        acids[0][4] = 22;

        acids[1][0] = 20;
        acids[1][1] = 45;
        acids[1][2] = 56;
        acids[1][3] = 1;
        acids[1][4] = 33;

        acids[2][0] = 30;
        acids[2][1] = 67;
        acids[2][2] = 32;
        acids[2][3] = 14;
        acids[2][4] = 44;

        acids[3][0] = 40;
        acids[3][1] = 12;
        acids[3][2] = 87;
        acids[3][3] = 14;
        acids[3][4] = 55;

        acids[4][0] = 50;
        acids[4][1] = 86;
        acids[4][2] = 66;
        acids[4][3] = 13;
        acids[4][4] = 66;

        acids[5][0] = 60;
        acids[5][1] = 33;
        acids[5][2] = 44;
        acids[5][3] = 12;
        acids[5][4] = 11;

        acids[6][0] = 01;
        acids[6][1] = 02;
        acids[6][2] = 03;
        acids[6][3] = 04;
        acids[6][4] = 05;

        //int rows = 6;
        //int columns = 5;
        //int i, j;

        //for (i = 0; i < rows; i++) {
        //for (j = 0; j < columns; j++) {
        //System.out.println(acids[i][j] + " ");
        //}
        //System.out.println("");
        //}
        for (int i = 0; i < acids.length; i++) {

            // loop and display sub-arrays.
            int[] sub = acids[i];

            for (int x = 0; x < sub.length; x++) {
                System.out.println(sub[x]);
            }
            System.out.println();

        }
    }
}
/*

  C  O  L  U  M  N  S
R 10 12 13 11 22
O 20 45 56 01 33
W 30 67 32 14 44
S 40 12 87 14 55
  50 86 66 13 66
  60 33 44 12 11
 */
