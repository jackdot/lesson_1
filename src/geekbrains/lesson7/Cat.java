package geekbrains.lesson7;


public class Cat {
    private String name;
    private int appetite;
    private boolean catIsFull;



    public Cat(String name, int appetite, boolean catIsFull) {
        this.name = name;
        this.appetite = appetite;
        this.catIsFull = catIsFull;
    }


    public void eat(Plate plate){
        if(appetite < Plate.food){
            plate.decreaseFood (appetite);
            System.out.println ("Кот " + name + " поел, теперь он сыт.");
            catIsFull = true;
        } else {
            System.out.println ("Коту " + name + " не хватает еды в миске, он не будет есть, пока миска не будет заполнена.");
            plate.info();
        }
    }


}
