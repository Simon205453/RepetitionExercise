public class Acid extends Liquid{

    private int lethalityLv;
    private boolean isBioHazard;

    public Acid(int amount, String name, int phValue, int lethalityLv, boolean isBioHazard) {
        super(amount, name, phValue);
        this.lethalityLv = lethalityLv;
        this.isBioHazard = isBioHazard;
    }

    @Override
    public String toString() {
        return "Acid{" +
                "lethalityLv=" + lethalityLv +
                ", isBioHazard=" + isBioHazard +
                '}';
    }

    @Override
    public void drink(){
        if (lethalityLv>0){
            System.out.println("Careful with that");
        } else {
            System.out.println("Cheers man");
        }
    }

}
