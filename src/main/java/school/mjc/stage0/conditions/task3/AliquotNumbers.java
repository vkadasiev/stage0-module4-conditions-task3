package school.mjc.stage0.conditions.task3;

public class AliquotNumbers {
    public void isFirstAliquot(int first, int second) {
        if (first % second == 0) {
            System.out.println("Aliquot");
        } else  {
            System.out.println("Not aliquot");
        }
    }
    public static void main(String[] Args) {
        AliquotNumbers newAliquotNumbersInstance = new AliquotNumbers();
        newAliquotNumbersInstance.isFirstAliquot(20, 5);
    }
}








//Implement the program that will consume 2 numbers as method arguments
// and will print if the first number is Aliquot(prints:"Aliquot" is yes otherwise "Not aliquot") to the other: