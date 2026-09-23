public class operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 30;

        // Arithmetic
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        // Comparison
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));

        // Logical
        System.out.println("AND: " + (a > 5 && b < 5)); // both should be true
        System.out.println("OR: " + (a < 5 || b < 5)); // one should be true
        System.out.println("NOT: " + !(a > 5)); // reverses the output


        // Assignment
        a += 5;
        System.out.println("a after += 5: " + a);

        // Increment
        a++;
        System.out.println("a after increment: " + a);

        // Ternary
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println(result);
    }
}