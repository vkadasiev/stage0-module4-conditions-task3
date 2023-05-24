package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month < 1 || month > 12)
            System.out.println("wrong number!");
         if (month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            System.out.println(31);
         if (month == 4 || month == 6 || month == 9 || month == 11)
             System.out.println(30);
         if (month == 2)
             System.out.println(28);
    }

    public static void main(String[] Args)    {
    DaysInMonthPrinter newDaysInMonthPrinter = new DaysInMonthPrinter();
    newDaysInMonthPrinter.amountOfDays(2);


    }
}




////case 1: // Январь
////        case 3: // Март
////        case 5: // Май
////        case 7: // Июль
////        case 8: // Август
////        case 10: // Октябрь
//          case 12: // Декабрь






//Implement the program that will consume a number month from method argument
//and print amount of days in that month, if number is not a month number -> print: "wrong number!"