package geekbrains.lesson7;

public class Plate {


    protected static int food;

    public Plate(int food) {
        this.food = food;
        if(food < 1){
            System.out.println ("Положите в миску больше еды");


        }
    }

    public void decreaseFood(int n){
        food -= n;
        if(food < 0){
            System.out.println ("Наполните миску кормом. ");
        }
    }

    public void increaseFood(int n){
        food += n;
        System.out.println ("Пополняем миску корма на " + n + " г.");
    }

    public void info() {

        if ( food < 0 ) {
            System.out.println ("Кот остался голодным");
        } else {
            System.out.println ("\nВ тарелке осталось " + food + " г. корма.");

        }
    }

}
