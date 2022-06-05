package HomeWork;


public class Main {
    public static void main(String[] args) {
        String[] str = {"1", "2"};
        Integer[] ing = {1, 3};
        Double[] dbl = {1.5, 3.2};
        ChangeArray<Object> array = new ChangeArray<>();
        array.changeIndex(str, 0, 1);
        array.changeIndex(ing, 0, 1);
        array.changeIndex(dbl, 0, 1);
        System.out.println(array.toArrayList(str).getClass().getName());


        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        for(int i = 0; i < 3; i++){
            appleBox.addInBox(new Apple());
            orangeBox.addInBox(new Orange());
        }
        System.out.println("Коробка с яблоками: " + appleBox.getFruits());
        System.out.println("Коробка с апельсинами: " + orangeBox.getFruits());
        System.out.println("Вес коробки с яблоками: " + "=" + appleBox.getWeight());
        System.out.println("Вес коробки с апельсинами: " + "=" + orangeBox.getWeight());
        System.out.println("Сравним коробки: " + appleBox.compare(orangeBox));

        appleBox.addInBox(new Apple());
        appleBox.addInBox(new Apple());
        appleBox.addInBox(new Apple());
        orangeBox.addInBox(new Orange());
        System.out.println("Вес коробки с яблоками: " + "=" + appleBox.getWeight());
        System.out.println("Вес коробки с апельсинами: " + "=" + orangeBox.getWeight());
        System.out.println("Сравним коробки: " + appleBox.compare(orangeBox));

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addInBox(new Apple());
        appleBox.moveAllToNextBox(appleBox2);
        System.out.println(appleBox.getFruits());
        System.out.println(appleBox2.getFruits());

    }
}
