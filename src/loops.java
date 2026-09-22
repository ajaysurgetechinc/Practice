public class loops {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) { //this is for loop where it will iterate until the condtions fails
            System.out.println(i);
        }
        System.out.println("For loop Executed");
        int i = 10;
        while (i <= 20) {  //this is the while loop when it is only true\
            System.out.println(i);
            i++;
        }
        System.out.println("While loop Executed");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        }
        while (j >= 20);
        System.out.println("Do While Executed");
        int[] numbers = {1, 2, 3, 4, 5};  // array intialzation , we will cover in depth of it
        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("Enchanced For Loop Executed");
        for (int k = 1; k <= 10; k++) {

            if (k == 5) {
                break;
            }

            System.out.println(k);
        }
        System.out.println("Break loop executed");

        for (int k = 1; k <= 10; k++) {

            if (k == 5) {
                continue;
            }
            System.out.println(k);
        }
        System.out.println("Continue loop executed");
    }
}

