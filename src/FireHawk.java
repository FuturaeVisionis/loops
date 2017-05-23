import java.util.Arrays;
import java.util.List;

/**
 * Created by ronald on 26/09/16.
 */
public class FireHawk {

    public static void main(String[] args) {


        int warnumber = 0;
        int jeep = 0;

        String planes[] = {"Mirage", "F-16", "F-18 Hornet", "Sea Harrier"};

        // convert array to a list

        List<String> warplanes = Arrays.asList(planes);

        System.out.println("----------THE FOR EACH LOOP-----------");

        for (String plane : planes) {
            if (plane.startsWith("M"))
                continue;
            System.out.println(plane);
        }
        System.out.println("----------THE FOR LOOP----------------");

        for (int i = 0; i < planes.length; i++) {
            if (planes[i].equals("F-16"))
                break;
            System.out.println(planes[i]);
        }
        System.out.println("----------THE DO WHILE LOOP-----------");
        do

        {
            if (planes[warnumber].equals("F-16"))
                warnumber++;

            System.out.println(planes[warnumber]);
            warnumber++;

        } while (warnumber < planes.length);

        System.out.println("----------THE WHILE LOOP--------------");

        while (jeep < planes.length) {
            if (planes[jeep].equals("F-18 Hornet"))
                jeep++; // try using break and see what happens.

            System.out.println(planes[jeep]);
            jeep++;
        }
    }

}
