import org.apache.commons.lang3.StringUtils;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        System.out.println("Enter something: ");
        String input = in.nextLine();
        System.out.println("You typed : " + input);
        System.out.println(StringUtils.isNumeric(input) + " : " + input + " is Not a number");
        System.out.println("Flipped case : " + StringUtils.swapCase(input));
        System.out.println("Reversed: " + StringUtils.reverse(input));





    }



}
