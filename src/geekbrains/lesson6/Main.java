package geekbrains.lesson6;

public class Main {
    public static void main(String[] args) {

        int catCount = 0;
        int dogCount = 0;

        Animal frank = new Cat ("Фрэнk", "черный", 3, 10);
        Animal bob = new Dog("Боб","белый",3, 50, 10);
        Animal tuzik = new Dog("Тузик","оранжевый",11,199,33);
        Animal tony = new Cat("Тони","синий",4,100, 10);



        frank.animalRunAndSwim ();
        System.out.println ();


        bob.animalRunAndSwim ();
        System.out.println ();

        tony.animalRunAndSwim ();
        System.out.println ();

        tuzik.animalRunAndSwim ();
        System.out.println ();


    }
}