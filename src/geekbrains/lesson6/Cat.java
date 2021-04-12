package geekbrains.lesson6;

public class Cat extends Animal {

        int count = 0;

    public Cat(String name, String color, int age, int run, int swim) {
        super (name, color, age, run, swim);
        count++;
    }
    public Cat(String name, String color, int age, int run) {
        super (name, color, age, run);
        count++;
    }

        @Override
    public void animalRunAndSwim() {
                if(run > 200 && swim > 0){
                    super.run = run;
                    super.swim = swim;
                    System.out.println (name + " не сможет столько пробежать и тем более столько проплыть. ");

                } else if(swim > 0) {
                    super.swim = swim;
                    System.out.println (name + " не умеет плавать, он же кот.");
                    System.out.println (name + " пробежал " + run + " м.");
                } else if(run > 200){
                    super.run = run;
                    System.out.println(name + " столько не пробежит, сжальтесь над котом.");
                    System.out.println (name + " проплыл" + swim + " м.");
                } else{
                    System.out.println (name + " пробежал " + run + " м." + " и проплыл " + swim + " м.");
                }
            }

    }

