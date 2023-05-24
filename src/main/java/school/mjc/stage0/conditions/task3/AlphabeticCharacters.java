package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if ((character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z')) {
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
                }
        }

        else {
            System.out.println("wrong alphabet!");
                }

    }
    public static void main(String[] Args) {
        AlphabeticCharacters instanseAlphabeticCharacters = new AlphabeticCharacters();
        instanseAlphabeticCharacters.vowelDeterminer('a');

    }
}


//Implement the program that will consume a character from method argument which will be from english alphabet and print vowel if it is "Vowel" or consonant if it's "Consonant". And If it is not from eng alphabet than print "wrong alphabet!"

