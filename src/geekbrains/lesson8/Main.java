package geekbrains.lesson8;

import geekbrains.lesson8.obstacles.RunTrack;
import geekbrains.lesson8.obstacles.Wall;
import geekbrains.lesson8.obstacles.isObstacles;

public class Main {
    public static void main(String[] args) {

        runnableAndJumpable[] athletes = {
                new Cat ("Жош", 14, 10),
                new Cat ("Фрэнк", 15, 9),
                new Human ("Димасик", 9, 15),
                new Robot ("Айван", 99, 99),
        };

        isObstacles[] obstacles = {
                new Wall (15),
                new RunTrack (10),
        };

        jumpAndRun (athletes, obstacles);
    }


    private static void jumpAndRun(runnableAndJumpable[] athletes, isObstacles[] obstacles) {
        for (runnableAndJumpable athlete : athletes) {
            System.out.println ("К старту готовится атлет " + athlete);

            for (isObstacles obstacle : obstacles) {
                if ( obstacle.toJump (athlete.getMaxHeight ())) {
                    System.out.println ("Ему удаётся перепрыгнуть через стену");
                } else if ( obstacle.toRun (athlete.getMaxLength ()) ){
                    System.out.println ("Ему удаётся пробежать весь путь");
                } else{
                    System.out.println ("не удаётся обуздать препятствие");
                    break;
                }

            }
            System.out.println ();

        }
    }
}

