public class Intersection {
    public int[] intersection(int[] array1, int[] array2) {
    int count1 = 0;
    int count2 = 0;
    if (array1.length > 0 && array2.length > 0) {

        if(array1.length < array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[i]) {
                    count1 = array1[i];
                    count1++;
                }
            } int[] result = new int[count1];

        } else if (array1.length > array2.length){
            for (int j = 0; j < array2.length; j++) {
                if (array1[j] == array2[j]) {
                    count2 = array2[j];
                    count2++;
                }
            } int[] result = new int[count2];
        }
    } else {
        return new int[]{};
    }

    return new int[count2 - count1];
}
}
