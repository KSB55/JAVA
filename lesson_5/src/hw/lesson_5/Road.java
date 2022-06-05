package hw.lesson_5;

public class Road extends Stage{
    public Road(int lenght){
        this.length = lenght;
        this.description = "Дорога " + lenght + " метров";
    }

    @Override
    public void go(Car c){
        try{
            System.out.println(c.getName() + " начал этап: " + description);
            Thread.sleep(length / c.getSpeed() * 1000L);
            System.out.println(c.getName() + " начал этап: " + description);
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

}
