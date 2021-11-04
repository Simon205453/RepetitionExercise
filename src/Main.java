import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanUserin = new Scanner(System.in);
        System.out.println("Hvilken exercise skal vises? \n 1 - Inheritance (exercise 2)\n 2 - WordReader (exercise 3)\n 3 - PopulationCalculator (exercise 4)\n 4 - Arraylist (exercise 6)");
        int chosenExercise = scanUserin.nextInt();

        switch (chosenExercise) {
            case 1:
                //Objekter og metoder til exercise 2:
                Liquid cola = new Liquid(33, "Coca Cola", 5);
                Acid ammoniumphosphat = new Acid(10, "Ammoniumsphosphat", 2, 10, true);
                System.out.println(cola);
                cola.drink();
                System.out.println(ammoniumphosphat);
                ammoniumphosphat.drink();
                break;

            case 2:
                //Objekter og metoder til exercise 3:
                WordReader reader1 = new WordReader();
                reader1.getScannerwordsCount();
                break;

            case 3:
                //Objekter og metoder til exercise 4:
                PopulationCalc calculator1 = new PopulationCalc();
                calculator1.calcPopulationGrowthInYears(5);
                break;

            case 4:
                //Objekter og metoder til exercise 6:
                ArraylistBuilder arr1 = new ArraylistBuilder();
                System.out.println(arr1.buildarrlist());
                arr1.rebuildArrlist(arr1.buildarrlist());
                break;
            default:
                System.out.println("Exercise not found");
        }
    }
}
