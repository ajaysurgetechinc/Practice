public class Arrays {
    int [] numbers = {10,20,30,40,50};// array intialize here
    public static void main(String [] args){
        Arrays a = new Arrays();// OBEJECT CREATION TO ACCESS
        System.out.println(a.numbers[0]);
        System.out.println(a.numbers[1]);//ACCESSING EACH ONE OF THEM
        System.out.println("BREAKK");
        for (int number : a.numbers) { // ENCHANCED FOR , USED TO PRINT THE VALUES
            System.out.println(number);
        }
        System.out.println("BREAKK");
        // to add values over this we cannot add because the array here is fixed we need to use arraylist that grows dynamically
        a.numbers[0]=100; // we change the value of index 0
        System.out.println(a.numbers[0]);
    }
}
