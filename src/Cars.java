import java.util.Arrays;

/**
 * Created by ronald on 29/09/16.
 */
public class Cars {
    public static void main(String[] args) {

        String[][] vehicles = {
                {"Mini", "Toyota", "Maserati", "Yamaha", "Kawasaki"},
                {"Ferrari", "Veron", "Rolls", "Picanto"}};

        for (String[] row : vehicles) {
            for (String column : row) {
                System.out.println(column);
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(vehicles));
    }
}

