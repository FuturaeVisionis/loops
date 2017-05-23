/**
 * Created by ronald on 02/10/16.
 */
public class Locks {
    public static void main(String[] args) {

        int safe = 0; // need this guy to initialize your loop

        String[] locks = new String[4];

        locks[0] = "Motorbikes";
        locks[1] = "are";
        locks[2] = "for real";
        locks[3] = "men.";

        //iterate through the string array using a do while loop
        //do {
            //System.out.println(locks[safe]);
            //safe++; // declaring
        //}
        //while (safe < locks.length);

        //System.out.println();

        //while (safe < locks.length) {
            //System.out.println(locks[safe]);
            //safe++;
        //}
        //for (String value : locks){
            //System.out.println(value);
        //}
        for (int i = 0; i < locks.length; i++){
            System.out.println(locks[i]);
        }
    }
}
