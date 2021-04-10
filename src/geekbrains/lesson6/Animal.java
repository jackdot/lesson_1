package geekbrains.lesson6;

public class Animal {

    protected String name;
    protected String color;
    protected int age;
    protected int run;
    protected int swim;


    public Animal(String name, String color, int age, int run) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.run = run;
    }

    public Animal(String name, String color, int age, int run, int swim) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.run = run;
        this.swim = swim;
    }

    void animalRunAndSwim(){
        System.out.println ("Животное пробежало " + run + " и проплыло " + swim + " м.");
    }






//Создать классы Собака и Кот с наследованием от класса Животное.
    //Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
    // Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
    //У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
    //* Добавить подсчет созданных котов, собак и животных.
}
