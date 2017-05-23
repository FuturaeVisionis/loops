import java.util.Arrays;
import java.util.List;

/**
 * Created by ronald on 29/12/16.
 */
public class ZooAnimal {
    public static void main(String[] args) {

        String[] animals = {"Rhino", "Giraffe", "Lion", "Buffalo"};

        for (String bigfive : animals) {


            switch (bigfive) {
                case "Lion":
                    System.out.println("Rhino");
                    break;
                case "Buffalo":
                    System.out.println("Lion");
                    break;
                case "Rhino":
                    System.out.println("Giraffe");
                    break;
            }

        }
    }}
