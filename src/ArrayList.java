public class ArrayList {

    public static void main(String[] args) {

        java.util.ArrayList<Integer> numbers = new java.util.ArrayList<>();

        numbers.add(10); // we can just use .add() method to add
        numbers.add(20);
        numbers.add(30);
        numbers.add(60);

        System.out.println(numbers);
        numbers.remove(1);//remove the numbers by index we can
        System.out.println(numbers);
        System.out.println(numbers.get(2)); // access the elements using the index
        numbers.set(1,100); // it is something where we change the value of index 1 to 100
        System.out.println(numbers);
        System.out.println(numbers.size());// TO SEE HOW MANY VALUES ARE THERE IN THE ARRAY
        System.out.println(numbers.contains(100));// checks whether the value 100 is there
        System.out.println(numbers.contains(199)); // check whether the value 199 is there or not
        numbers.clear();// removes all the elments
        System.out.println(numbers);
        System.out.println(numbers.isEmpty()); // checks whether the array is empty or not
    }
}