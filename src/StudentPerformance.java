public class StudentPerformance {
    public static void main(String [] args){
        java.util.ArrayList<String> students = new java.util.ArrayList<>();
        students.add("Ajjay");
        students.add("Aakash");
        students.add("Charu");
        students.add("bipin"); // we have used arraylist because it will resize dynamically so we can add many students to the array

        //now we have to go for the subjects list
        String [] subjects = {"Maths","Java","SQL","Automata"};

        //2D ARRAY CREATION
        int[][] marks={
                {75,60,80,85},
                {50,56,77,90},
                {82,72,97,66},
                {71,58,98,45}
        };

        for(int i=0;i<marks.length;i++){
            int total =0;//total is intially 0
            System.out.println("Student: " + students.get(i));//it will fetch the name of the student using the index of rows
            for(int j = 0; j< marks[i].length; j++){  //nested for loops the marks will come here
                System.out.println(subjects[j] + " " +marks[i][j]);
                total = total + marks[i][j];
            }
            System.out.println("the total mark:" + total);
            double avg = total / 4.0;
            System.out.println("The Average Mark Is:" + avg);

            if (avg>=90){
                System.out.println("A+ Grade");
            }
            else if(avg>=75){
                System.out.println("A Grade");
            }
            else if(avg>=60){
                System.out.println("B Grade");
            }
            else if(avg >=50){
                System.out.println("C Grade");
            }
            else{
                System.out.println("Fail");
            }

        }
    }
}

