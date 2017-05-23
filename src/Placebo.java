/**
 * Created by ronald on 18/12/16.
 */
public class Placebo {
    public static void main(String[] args) {

        String [][] salutation = {
                {"Mr.", "Mrs.", "Ms.", "Sir"}, // array o
                {"Jameson", "Frederick"}, // array 1
                {"Van Morris"}, // array 2
                {"Clark", "Jansen", "Butter"}// array 3

        };
        System.out.println(salutation[2][0] + " " + salutation[3][1] + " " + salutation[0][2]);
    }
}
