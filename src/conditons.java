public class conditons {
    int age = 20; // instance variable (One Way)
    public static void main(String[] args){
        conditons c = new conditons();
        if (c.age>18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Minor");
        }
        c.checkMarks();
        c.checkGrade();
        c.checkDay();
    }

    void checkMarks(){
        int marks = 80; // local variable(other way)
        if (marks >=50){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }

    }
    void checkGrade() {
        int marks = 80;

        if (marks >= 90) {
            System.out.println("A+");
        } else if (marks >= 75) {
            System.out.println("A");
        } else if (marks >= 50) {
            System.out.println("B");
        } else {
            System.out.println("Fail");
        }
    }
    void checkDay(){
        int day = 3;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid");

        }
    }
}
