package lesson_1;

public class Main {
    public static void  main(String[] args){

        //2. Создать переменные всех пройденных типов данных и инициализировать их значения.
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
        isLeapYear(2020);
    }
    // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float.
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

    //8. Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void isLeapYear(int year) {
        if ((year % 4 == 0 && year % 400 = 0) && year % 100 == 0) {
            System.out.println(year + " Не високосный год");
        } else {
            System.out.println(year + " Високосный год");
        }
    }


}



