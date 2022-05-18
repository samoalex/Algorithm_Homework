public class MaxAveAlgorithm {
    //8.Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
    // Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,  и среднее
    // среди всех значений между 2-мя индексами.
    //
    //Test Data:
    //({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
    public int[] minMaxAveAlgorithm(int[] array, int index1, int index2){

        if (array == null || array.length < 1 || index1 < 0 || index1 > index2 || index2 > array.length){
            return new int[]{};
        }

        int minValue = array[index1];
        int maxValue = array[index2];
        int midValue = 0;
        int sum = 0;


        for (int i = index1; i <= index2; i++){
            if (array[index1] < array[i]){
                maxValue = array[i];
            }
            if (array[index1] > array[i]){
                minValue = array[i];
            }
            sum += array[i];
            midValue = sum / (index2 - index1 + 1);
        }
        int[] result = {minValue, maxValue, midValue};
        return result;
    }

}
