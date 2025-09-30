package practise;

import java.net.StandardSocketOptions;

public class SwitchCaseStatements {
    public static void main(String[] args){

//        int weekno = 2;
//        switch (weekno)
//        {
//            case 1: System.out.println("Sunday");break;
//            case 2: System.out.println("Monday");break;
//            case 3: System.out.println("Tuesday");break;
//            case 4: System.out.println("Wednesday");break;
//            case 5: System.out.println("Thursday");break;
//            default: System.out.println("Invalid number");
//        }

        String weekname = "Sunday";
        switch (weekname)
        {
            case "Sunday": System.out.println("Sunday");break;
            case "Monday": System.out.println("Monday");break;
            case "Tuesday": System.out.println("Tuesday");break;
            case "Wednesday": System.out.println("Wednesday");break;
            case "Thursday": System.out.println("Thursday");break;
            default: System.out.println("Invalid week name");
        }


    }
}
