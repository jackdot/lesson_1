package geekbrains.lesson8;

public class Human implements runnableAndJumpable {

        String name;
        int maxHeight;
        int maxLength;


    public Human(String name, int maxHeight, int maxLength) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }

    @Override
    public int getMaxHeight() {
        return 0;
    }

    @Override
    public int getMaxLength() {
        return 0;
    }

    @Override
    public void jump() {

    }

    @Override
    public void run() {
    }

    @Override
    public String toString(){
        return "Человек " + name;
    }
}

