public class Liquid {

    private int amount;
    private String name;
    private int phValue;

    public Liquid(int amount, String name, int phValue) {
        this.amount = amount;
        this.name = name;
        this.phValue = phValue;
    }

    @Override
    public String toString() {
        return "Liquid{" +
                "amount=" + amount +
                ", name='" + name + '\'' +
                ", phValue=" + phValue +
                '}';
    }

    public void drink(){
        System.out.println("Bottoms up");
        }
}
