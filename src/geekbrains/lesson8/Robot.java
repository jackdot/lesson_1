package geekbrains.lesson8;

public class Robot implements runnableAndJumpable {

    String name;
    int maxHeight;
    int maxLength;


    public Robot(String name, int maxHeight, int maxLength) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }


    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void jump() {

    }

    @Override
    public void run() {

    }
    @Override
    public String toString(){
        return "Робот " + name;
    }

}
