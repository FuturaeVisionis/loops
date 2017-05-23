import java.util.Arrays;
import java.util.List;

/**
 * Created by ronald on 27/09/16.
 */
public class Names {
    public static void main(String[] args) {

        System.out.println("----------THE DO WHILE LOOP-----------");

        int pencil = 0;

        String[][] names = {{"Sam", "Smith"}, {"Robert", "Delgro"}, {"James", "Gosling"}};

        //for (int i = 0; i < names.length; i++) {

        // loop and display sub-arrays.
        //String[] sub = names[i];

        //for (int x = 0; x < sub.length; x++) {
        //System.out.println(sub[x]);
        //}
        //System.out.println();
        //}

        do {

            System.out.println(names[pencil][0]);
            System.out.println(names[pencil][1] + "\n");
            pencil++;

        } while (pencil < names.length);
    }
}