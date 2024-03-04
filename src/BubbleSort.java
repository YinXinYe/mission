public class BubbleSort {
    public static void main(String[] args){
        int[] array = {38, 65, 3, 17, 2};
            for(int i=0; i<array.length-1; i++){
                for(int j=0; j<array.length-i-1; j++){
                    if(array[j] > array[j+1]){
                        System.out.println("i value is " + i + " anad j value is " + j);
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
       for(int j = 0; j<array.length; j++){
         System.out.println(array[j] + ", ");
}
        }
    }