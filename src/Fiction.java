/**
 * Created by ronald on 27/09/16.
 */
public class Fiction {

    public static void main(String[] args) {


        int startrek[][] = {{8, 9, 10, 11}, {12, 13, 14, 15}, {88, 99}};
        int deepspace[][] = {{30, 31, 32, 33}, {43}, {4, 5, 6}, {77, 99}};
        int blackhole[][] = {{1, 2, 3}};

        System.out.println("This is Startrek code");
        delta(startrek);

        System.out.println("This is Clingon code");
        delta(deepspace);

        System.out.println("This is Blackhole code:");
        delta(blackhole);

    }

    //public static void delta(int x[][]){

    //for (int i = 0; i < x.length; i++) {

    // loop and display sub-arrays.
    //int[] sub = x[i];

    //for (int p = 0; p < sub.length; p++) {
    // System.out.println(sub[p]);
    //}
    // System.out.println();


    //public static void delta(int x[][]) {

    //for (int row = 0; row < x.length; row++) {
    //for (int column = 0; column < x[row].length; column++) {
    //System.out.println(x[row][column] + "\t");
    //}
    //System.out.println();
    //}

    public static void delta(int x[][]) {

        for (int[] row : x) {
            for (int column : row) {
                System.out.println(column);
            }
            System.out.println();
        }


    }
}