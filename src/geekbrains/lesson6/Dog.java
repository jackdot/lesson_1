package geekbrains.lesson6;

public class Dog extends Animal{

    public Dog(String name, String color, int age, int run, int swim) {
        super (name, color, age, run, swim);
    }

    @Override
    public void animalRunAndSwim(){
        if(run > 500 && swim > 10){
            super.run = run;
            super.swim = swim;
            System.out.println (name + " не сможет столько пробежать и тем более столько проплыть. ");

        } else if(swim > 10) {
            super.swim = swim;
            System.out.println (name + " не сможет столько проплыть, пожалейте пса.");
            System.out.println (name + " пробежал " + run + " м.");
        } else if(run > 500){
            super.run = run;
            System.out.println(name + " столько не пробежит, сжальтесь над псом.");
            System.out.println (name + " проплыл" + swim + " м.");
            } else{
                System.out.println (name + " пробежал " + run + " м." + " и проплыл " + swim + " м.");
            }
        }
    }
