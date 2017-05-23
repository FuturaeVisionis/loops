import java.util.Arrays;

/**
 * Created by ronald on 28/09/16.
 */
public class Animation {
    public static void main(String[] args) {

        int pencil = 0;

        String[][] cartoons = {
                {"Flinstones", "Fred", "Wilma", "Pebbles", "Dino"},
                {"Rubbles", "Barney", "Betty", "Bam Bam"},
                {"Jetsons", "George", "Jane", "Elroy", "Judy", "Rosie", "Astro"},
                {"Scooby Doo Gang", "Scooby Doo", "Shaggy", "Velma", "Fred", "Daphne"}};

        //for (int i = 0; i < cartoons.length; i++) {

            // loop and display sub-arrays.
            //String[] sub = cartoons[i];

            //for (int x = 0; x < sub.length; x++) {
                //System.out.println(sub[x]);
            //}
            //System.out.println();

        do {

            System.out.println(cartoons[pencil][0]);
            System.out.println(cartoons[pencil][1]);
            System.out.println(cartoons[pencil][2]);
            System.out.println(cartoons[pencil][3] + "\n");
            pencil++;


        } while (pencil < cartoons.length);
    }

}

