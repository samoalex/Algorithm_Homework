public class ReverseArray {
    public int[] reversArrayAlgoritm(int[]array){

     int[] result = new int[array.length];
     int count = array.length -1;

     for(int i = 0; i < array.length; i++){
         result[count] = array[i];
         count--;
     }
     return result;
    }
}
