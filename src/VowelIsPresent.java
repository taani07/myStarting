public class VowelIsPresent {
    public static void main(String[] args) {
        System.out.println(isPresent("Hello"));
        System.out.println(isPresent("TV"));

    }
    public static boolean isPresent(String str){
        //char[] ch = {'a','e','i','o','u'};
       return str.toLowerCase().matches(".*[aeiou].*");
    }
}
