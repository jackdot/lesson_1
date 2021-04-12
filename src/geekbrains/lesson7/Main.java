package geekbrains.lesson7;

import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {

        Cat[] catArray = new Cat[5];

        catArray[0] = new Cat("Josh",13,false);
        catArray[1] = new Cat("Армада",20,false );
        catArray[2] = new Cat("Frank",16,false);
        catArray[3] = new Cat("Пуш",11,false);
        catArray[4] = new Cat("Иван",100,false);

        Plate plate = new Plate(100);

        for (Cat cat : catArray) {
            cat.eat (plate);
        }

        plate.increaseFood(500);
        plate.info();

    }
}
