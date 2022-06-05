package HomeWork;

public class Fruit {
    protected float weight;
    protected String name;
    public Fruit(float weight, String name){
        this.weight = weight;
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }
    @Override
    public String toString(){
        return this.name + " " + weight;
    }
}
