package oopsconcept.strings;

public class StringExample {
    public static void main(String[] args) {
        String greeting="hello";
        System.out.println(greeting);
        int length=greeting.length();
        System.out.println("length: "+length);
        String subString=greeting.substring(1, 2);
        System.out.println("Sunstring (7, 12): "+ subString);
        String newGreeting=greeting+ "Welcome to java.";
        System.out.println(newGreeting);
        String upperCaseGreeting=greeting.toUpperCase();
        System.out.println("Uppercase: "+ upperCaseGreeting);
        boolean isEqual=greeting.equals("hello, world!");
        System.out.println("Is equal to 'hello, world!':"+ isEqual);
        String replacedGreeting=greeting.replace("world", "java");
        System.out.println("Replaced: "+replacedGreeting);
    }
}
