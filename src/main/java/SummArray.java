public class SummArray {
    //3.Написать алгоритм SumArray, который возвращает сумму всех чисел массива
    //Test Data:
    //{0, 1, 2, 3, 4, 5} → 15
    //{-7, -3} → -10
    public int sumArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            if (array.length != 0) {
                sum += array[i];
            }
        }
        return sum;
    }

}
