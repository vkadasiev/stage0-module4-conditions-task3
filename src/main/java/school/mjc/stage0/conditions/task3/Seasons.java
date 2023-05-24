package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month == 1 || month == 2 || month == 12) {
            System.out.println("Winter");
        }
        if (month == 4 || month == 5 || month == 3) {
            System.out.println("Spring");
        }
        if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");

        }
        if (month < 1 || month > 12) {
            System.out.println("wrong number!");
        }

    }

    public static void main(String[] Args) {
        Seasons newSeasonInstance = new Seasons();
        newSeasonInstance.tellTheSeasonByMonthNumber(1);

    }

}





//Print the name of a season by number of a month(e.g. if number is 6 => "Summer").
// Number of the month will be coming from parameter of the method(if number is not a month number e.g. 13 => print: "wrong number!" ):
// Summer 6 7 8
// Spring 4 5 3
// Winter 1 12 2