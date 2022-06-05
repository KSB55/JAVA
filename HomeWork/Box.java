package HomeWork;

import java.util.ArrayList;

public class Box <T extends Fruit> {

    private ArrayList <T> fruits;


    public Box(){
        this.fruits = new ArrayList<>();
    }

    public void addInBox(T fruit){
        fruits.add(fruit);
    }



    public ArrayList<T> getFruits(){
        return fruits;
    }

    public float getWeight(){
        float totalWeight = 0.0f;
        for(T fruit : fruits)
            totalWeight += fruit.getWeight();
        return  totalWeight;

    }
    public boolean compare(Box<? extends Fruit> box){

        return Float.compare(this.getWeight(), box.getWeight()) == 0;
    }

    public void addFruits(ArrayList<T> fruits){
        this.fruits.addAll(fruits);
    }
    public void moveAllToNextBox(Box<T> box) {
        box.addFruits(getFruits());
        fruits.clear();

    }
}
