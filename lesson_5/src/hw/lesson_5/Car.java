package hw.lesson_5;



public class Car implements Runnable {

    private static int CARS_COUNT;

    static {
        CARS_COUNT = 0;
    }

    private final Race race;
    private final int speed;
    private final String name;

    public String getName() { return name;}

    public int getSpeed() { return speed; }

    public Car(Race race, int speed){
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участиник № " + CARS_COUNT;
        System.out.println(this.name + " готовится");
        try{
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void run(){
        for(int i = 0; i < race.getStages().size(); i++){
            race.getStages().get(i).go(this);
        }
    }

}
