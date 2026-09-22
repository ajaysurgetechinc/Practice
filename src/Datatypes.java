public class Datatypes {

    int age = 20;                 // int → whole number
    String name = "Rohan";        // String → reference type
    boolean student = true;       // boolean → true or false
    char grade = 'A';             // char → single character
    double fees = 15000.00;       // double → decimal number
    long longValue = 10000000000L; // long → large whole number
    float floatValue = 10.5f;     // float → decimal number

    public static void main(String[] args) {

        Datatypes d = new Datatypes();

        System.out.println("Age: " + d.age);
        System.out.println("Name: " + d.name);
        System.out.println("Student: " + d.student);
        System.out.println("Grade: " + d.grade);
        System.out.println("Fees: " + d.fees);
        System.out.println("Long: " + d.longValue);
        System.out.println("Float: " + d.floatValue);
    }
}