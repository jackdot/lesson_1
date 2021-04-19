package geekbrains.lesson8.obstacles;

public class RunTrack implements isObstacles{

    private int length;

    public RunTrack(int length) {
        this.length = length;
    }

    @Override
    public boolean toRun(int maxLength) {
        return (maxLength >= length);
    }

    @Override
    public boolean toJump(int maxHeight) {
        return false;
    }
}
