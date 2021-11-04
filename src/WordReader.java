import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordReader {

    public File words = new File("Resources/Words.txt");
    private Scanner scannerwords;

    {
        try {
            scannerwords = new Scanner(words);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void getScannerwordsCount() {
        int numOfScannerwords = 0;
        while (scannerwords.hasNext()) {
            numOfScannerwords++;
            scannerwords.nextLine();
        }
        System.out.println("Der er " + numOfScannerwords + " ord i filen");
    }
}
