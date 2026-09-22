public class Strings {
    public static void main(String args[]){
        String name = "Ajjay Sabari";
        String name2 = "Ram";
        String name3  = "ram";
        System.out.println(name.equals(name2));//checks whether the both names are same  or not
        System.out.println(name.charAt(6));//finds the value in that index
        System.out.println(name.length()); // finds the length
        System.out.println(name2.equalsIgnoreCase(name3));//it will ignore the case senstive
        System.out.println(name2.toUpperCase());// changes to upper case
        System.out.println(name.toLowerCase()); // changes to lower case
        System.out.println(name.contains("Ajjay"));//checks whether the string contains the charcters in the string
        System.out.println(name.substring(0,7)); // it will list the charcters from the names that is from index 0 to index 7
        System.out.println(name2.replace("Ram","New Ram"));

    }

}
