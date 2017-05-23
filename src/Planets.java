import java.util.ArrayList;

/**
 * Created by ronald on 02/10/16.
 */
public class Planets {

        public static void main(String[] args) {

                int monkey = 0;


        ArrayList<String> names = new ArrayList<>();
                names.add("Green");
                names.add("Grasshopper");
                names.add("likes");
                names.add("honey.");

                //do

                //{
                        //System.out.println(names.get(monkey));
                        //monkey++;

                //} while (monkey < names.size());

                //while (monkey < names.size()) {
                //System.out.println(names.get(monkey));
                // monkey++;
                //}
                for (int i = 0; i < names.size(); i++) {
                        String value = names.get(i);
                        System.out.println(value);
                        //}
                        //for (String value : names) {
                        //System.out.println(value);
                }
        }
}


