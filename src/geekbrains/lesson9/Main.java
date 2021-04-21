package geekbrains.lesson9;


public class Main {
    public static void main(String[] args) {

        String[][] arrayTest1 = {{"1", "2", "4", "5"}, {"2", "8", "7", "1"}, {"8", "2", "6", "7"}, {"1", "7", "9", "2"}};
        String[][] arrayTest2 = {{"1","2","4"},{"2","8","7","1"},{"8","2","6"}};
        String[][] arrayTest3 = {{"1","2","4","2"},{"aф","8","7","1"},{"8","2","6","7"},{"8","1","9","6"}};

        
        try{
            arrayCheck(arrayTest3);
        } catch (MyArraySizeException e) {
            System.out.println ("Недопустимый размер массива!");
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);
        }
    }


            public static int arrayCheck(String[][] arr) throws MyArraySizeException, MyArrayDataException{
               int arrSum = 0;

                for (int i = 0; i < arr.length; i++) {
                    if(arr[i].length != 4) {
                        throw new MyArraySizeException();
                    }
                    for (int j = 0; j < arr.length; j++) {
                        try{
                            arrSum+= Integer.parseInt (arr[i][j]);
                        } catch(NumberFormatException e){
                            throw new MyArrayDataException(i, j);
                        }
                    }
                }  System.out.println ("Общая сумма всех элементова массива равна:"+ arrSum);
                return arrSum;
            }

        }



