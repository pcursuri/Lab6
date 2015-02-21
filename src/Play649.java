/**
 * Created by Toshiba on 21.02.2015.
 * Documentatie
 * Se accepta doar caractere din 1->49 si sa fie unice - se memoreaza intr-un Array
 * Generarea se face cu 6 numere distincte intre 1-49 distincte
 * Castigator este numai de la 4
 */
public class Play649 {
    public static void main(String s[]) {
        System.out.println("Game 6 from 49");
        int[] sixGeneratedNumbers = new RandomNumbers().arrRandom();
        int[] myNumbers = new ReadNumbers().readSixNumbers();
        int k = 0;
        System.out.println("Numbers random:");
        for (int number : sixGeneratedNumbers) {
            k++;
            System.out.print(number + (k <6 ? "; " : ""));
        }
        System.out.println("\n---------------------------");
        System.out.println("MyNumbers: ");
        k=0;
        for (int number : myNumbers) {
            k++;
            System.out.print(number + (k < 6 ? "; " : ""));
        }

        //compare and tell if won
        int howManyWons = 0;
        int[] wonNumbers = new int[6];

        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 6; j++) {

                if (myNumbers[i] == sixGeneratedNumbers[j]) {
                    howManyWons++;
                    wonNumbers[howManyWons - 1] = sixGeneratedNumbers[j];
                }
            }
        System.out.println("\n");
        switch (howManyWons) {
            case 3: // that is 4 numbers
                System.out.println("congrat, you won at 3rd category");
                break;
            case 4: // that is 5 numbers
                System.out.println("congrat, you won at 2rd category");
                break;
            case 5: // that is 6 numbers
                System.out.println("WOW, you won at 1st category");
                break;
            default:
                System.out.println("you are a looser, but keep trying, you guessed " + howManyWons + " numbers");
                break;
        }

    }
}
