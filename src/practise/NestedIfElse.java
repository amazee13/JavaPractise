package practise;

import javax.swing.plaf.synth.SynthSpinnerUI;
import java.net.StandardSocketOptions;

public class NestedIfElse {
    public static void main(String[] args){

        int weekNo = 1;

        if (weekNo == 1)
        {
            System.out.println("Sunday");
        }
        else if (weekNo == 2)
        {
            System.out.println("Monday");
        }
        else if (weekNo == 3)
        {
            System.out.println("Tuesday");
        }
        else if (weekNo == 4)
        {
            System.out.println("Wednesday");
        }
        else if (weekNo == 5)
        {
            System.out.println("Thursday");
        }
        else {
            System.out.println("Invalid number");
        }

    }
}
