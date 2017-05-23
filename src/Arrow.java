import java.util.Arrays;
import java.util.List;

/**
 * Created by ronald on 26/09/16.
 */
public class Arrow {

    public static void main(String[] args) {


        int kingArthur = 0;

        String[] bow = {"one", "two", "three", "four", "five", "game over"};

        // make a list from the array and call this list "robinhood".
        List<String> robinhood = Arrays.asList(bow);

        // now iterate through the list using a do-while loop:

        do

        {
            if (robinhood.get(kingArthur).equals("game over"))
                break;

            System.out.println(robinhood.get(kingArthur));
            kingArthur++;

        } while (kingArthur < robinhood.size());

        robinhood.forEach((princeOfThieves) ->System.out.println(princeOfThieves));
    }
}
