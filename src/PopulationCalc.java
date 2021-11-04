public class PopulationCalc {

    private int birthInterval = 7;
    private int deathInterval = 13;
    private int currentPopulation = 331002651;

    public void calcPopulationGrowthInYears(int years){
        int yearsToSec = years*365*24*60*60;
        for (int i = 0; i <= yearsToSec; i++) {
            if (i%birthInterval==0) {
                currentPopulation++;
            }
            if (i%deathInterval==0){
                currentPopulation--;
            }
        }
        System.out.println("The population in " + years + " years will be: " + currentPopulation);
    }

}
