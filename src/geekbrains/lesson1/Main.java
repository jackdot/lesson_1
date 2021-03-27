package geekbrains.lesson1;

public class Main {
    public static void  main(String[] args){

        int a = 666;
        float b = 3.57f;
        long c = 34234363232L;
        byte d = 3;
        char e = 'A';
        short n = 34;
        boolean boolT = true;
        boolean boolF = false;
        double x = -3.42;

        taskBetween10and20(5, 5);
        calculate(1.3f, 2.4f, 5.1f,4.1f);
        isPositiveOrNegative(11);
        isNegative(5);
        name("Frank");
//        isLeapYear(2020);
    }

    public static float calculate(float a, float b, float c, float d){
        float result =  a * (b + (c / d));
        System.out.println(result);
        return result;
    }
    public static boolean taskBetween10and20(int a, int b){
        int sum = a + b;
        if(sum >= 10 && sum <= 20){
            return true;
        } else{
            return false;
        }
    }
    public static void isPositiveOrNegative(int a){
        if(a >= 0){
            System.out.println("Число положительное.");
        } else{
            System.out.println("Число отрицательное.");
        }
    }
    public static boolean isNegative(int a){
        if(a < 0){
            return true;
        }else{
            return false;
        }
    }
        public static void name(String name){
            System.out.println("Hello " + name + "!");
        }


//    public static void isLeapYear(int year) {
//        if ((year % 4 == 0 && year % 400 = 0) && year % 100 == 1) {
//            System.out.println(year + " Не високосный год");
//        } else {
//            System.out.println(year + " Високосный год");
//        }
//    }




}



