public class HW9 {

    //1.Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,  если число нечетное,
    // и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.
    //
    //Test Data:
    //-345 →  “Odd”
    //0 →  “Even”
    //222222 →  “Even”
    //2147483647 + 1 →  “Undefined”

    public String oddEvenAlgoritm(long number){

        String odd = "Odd";
        String even = "Even";
        String undefined = "Undefined";

        if (number <= 2147483647l && number >= -2147483648l){
            if (number % 2 == 0){

                return even;
            }else{

                return odd;
            }
        }

        return undefined;
    }
    //2.Написать алгоритм OddIndices, который принимает массив чисел,  и возвращает массив значений нечетных индексов
    //Test Data:
    //Input = {-45, 590, 234, 985, 12, 68}
    //Expected Result =  {590, 985, 68}
    public int[] oddIndices(int[] array){
        int[] oddIndices = new int[array.length / 2];
        int j = 0;
        for (int i = 0; i < array.length; i++){
            if (i % 2 != 0){
                oddIndices[j] = array[i];
                j++;
            } else if (array.length == 0){
                return new int[]{};
            }
        } return oddIndices;
    }




}
