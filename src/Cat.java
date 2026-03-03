public class Cat {
    // Question 1
    private String name;
    private double weight;
    private int ageM;
    private double cost;

    // Question 2
    public Cat(String name, double weight, int ageM, double cost){
        
        this.name = name;
        this.weight = weight;
        this.ageM = ageM;
        this.cost = cost;

    }

    public Cat(){
        name = "";
        weight = 0.0;
        ageM = 0;
        cost = 0.0;
    }

    public String getName() {
        return name;
    }

    public Double getWeight() {
        return weight;
    }

    public int getAgeM() {
        return ageM;
    }

    public double getCost() {
        return cost;
    }
    public void setAgeM(int ageM) {
    this.ageM = ageM;
}
public void setWeight(double Weight) {
    this.weight = weight;
}

}
