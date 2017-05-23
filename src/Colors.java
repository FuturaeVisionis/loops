/**
 * Created by ronald on 26/09/16.
 */
public class Colors {

    public static void main(String[] args) {

        String colors[][][] = new String[1][3][1];

        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                for (int k = 0; k < colors[i][j].length; k++) {
                    colors[i][j][k] = "String [" + i + " , " + j + " , " + k + "]";
                    System.out.println(colors[i][j][k]);
                }
            }
        }
    }
}
/*

   0 0 0
 0 1 2


 */