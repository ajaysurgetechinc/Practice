public class Array1D {
    int [] numbers = {10,20,30,40,50,60}; //ONE DIMENSIONAL ARRAY
    public static void main(String [] args){
        Array1D Arr = new Array1D();
        System.out.println(java.util.Arrays.toString(Arr.numbers)); // we cannot directly print the array values since array is a object
    }
}
