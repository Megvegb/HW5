package Animal;

public class Animal {
    private int weight;
    private String brade;

    Animal(){

    }
    Animal(int weight, String brade) {
    this.weight = weight;
    this.brade = brade;
    }

    public int getWeight() {
        return weight;
    }

    public String getBrade() {
        return brade;
    }
}

